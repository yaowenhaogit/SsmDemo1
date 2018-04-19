package com.atguigu.crud.util;

import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;

public class EncryptUtil {
	public static String encryptPassword(String encryptType,String password,String username) {
		String hashAlgorithmName = encryptType;
		Object credentials = password;
		Object salt = ByteSource.Util.bytes(username);
		int hashIterations = 1024;
		Object result = new SimpleHash(hashAlgorithmName, credentials, salt, hashIterations);
		return result.toString();
	}
}
