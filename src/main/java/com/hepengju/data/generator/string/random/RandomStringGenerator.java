package com.hepengju.data.generator.string.random;

import org.apache.commons.lang3.RandomStringUtils;

import com.hepengju.data.generator.StringGenerator;

public class RandomStringGenerator implements StringGenerator {

	private int maxLength = 64;
	

	@Override
	public String generate() {
		return RandomStringUtils.randomAlphanumeric(0,maxLength + 1);
	}
}
