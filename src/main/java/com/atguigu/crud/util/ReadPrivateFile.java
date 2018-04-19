package com.atguigu.crud.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.ServletContext;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.ServletContextAware;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.atguigu.crud.bean.Role;
import com.atguigu.crud.service.IRoleService;

public class ReadPrivateFile implements InitializingBean, ServletContextAware {
	
	@Autowired
	IRoleService roleService;

	@Override
	public void setServletContext(ServletContext servletContext) {
		
			List<Role> newRoles = new ArrayList<Role>();
				//创建一个DocumentBuilderFactory的对象
				DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
				//创建一个DocumentBuilder的对象
				try {
					//创建DocumentBuilder对象
					DocumentBuilder db = dbf.newDocumentBuilder();
					//通过DocumentBuilder对象的parser方法加载books.xml文件到当前项目下
					 InputStream resourceAsStream = ReadPrivateFile.class.getResourceAsStream("/private/private.xml");  
					Document document = db.parse(resourceAsStream);
					//获取所有book节点的集合
					NodeList bookList = document.getElementsByTagName("page");
					//遍历每一个book节点
					for (int i = 0; i < bookList.getLength(); i++) {
							Node book = bookList.item(i);
							NamedNodeMap attrs = book.getAttributes();
							//遍历book的属性
							for (int j = 0; j < attrs.getLength(); j++) {
								Node attr = attrs.item(j);
								Role role = new Role();
								role.setRoleName(attr.getNodeName());//获取属性名
								role.setRoleCode(attr.getNodeValue());	//获取属性值
								newRoles.add(role);
							}
							//解析book节点的子节点
							NodeList childNodes = book.getChildNodes();
							//遍历childNodes获取每个节点的节点名和节点值
							for (int k = 0; k < childNodes.getLength(); k++) {
								//区分出text类型的node以及element类型的node
								if (childNodes.item(k).getNodeType() == Node.ELEMENT_NODE) {
									//获取了element类型节点的节点名
									Role role = new Role();
									role.setRoleName(childNodes.item(k).getNodeName());//获取了element类型节点的节点名
									role.setRoleCode(childNodes.item(k).getFirstChild().getNodeValue());//获取了element类型节点的节点值
									newRoles.add(role);
								}
							}
						}
				} catch (ParserConfigurationException e) {
					e.printStackTrace();
				}  catch (SAXException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
				roleService.deleteAll();
				for (Role role : newRoles) {
					roleService.insert(role);
				}
	}



	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		
	}
}
