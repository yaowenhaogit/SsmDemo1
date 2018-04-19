package com.atguigu.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.atguigu.crud.bean.TblEmp;
import com.atguigu.crud.bean.TnlDept;
import com.atguigu.crud.service.ITblEmpService;
import com.atguigu.crud.service.ITnlDeptService;
import com.sun.xml.internal.ws.api.model.wsdl.editable.EditableWSDLModel;

import ch.qos.logback.core.joran.spi.NoAutoStart;

@Controller
@RequestMapping("/tnlEmpController")
public class TnlEmpController {

	@Autowired
	ITnlDeptService tnlDeptService;
	@Autowired
	ITblEmpService tblEmpService;
	
	@Autowired
	
	@RequestMapping(value = "/insertTnlDept.do", method = RequestMethod.GET, produces = "application/json;charset=utf-8")
	@ResponseBody
	public String insertTnlDept() {
		
		return null;
	}
}
