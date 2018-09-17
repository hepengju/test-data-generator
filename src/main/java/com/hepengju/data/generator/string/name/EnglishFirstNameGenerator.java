package com.hepengju.data.generator.string.name;

import org.apache.commons.lang3.RandomUtils;

import com.hepengju.data.generator.StringGenerator;
import com.hepengju.data.generator.config.DataConst;

public class EnglishFirstNameGenerator implements StringGenerator {

	private String[] firstNameArray = DataConst.firstNames;
	
	@Override
	public String generate() {
		return firstNameArray[RandomUtils.nextInt(0, firstNameArray.length)];
	}

}
