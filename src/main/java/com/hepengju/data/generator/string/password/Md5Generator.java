package com.hepengju.data.generator.string.password;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.RandomStringUtils;

import com.hepengju.data.generator.StringGenerator;

/**
 * md5密码生成器
 * @author hepengju
 *
 */
public class Md5Generator implements StringGenerator {

	@Override
	public String generate() {
		String password = RandomStringUtils.randomAlphabetic(6, 10);
		return DigestUtils.md5Hex(password);
	}

}
