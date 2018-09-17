package com.hepengju.data.generator.string.name;

import org.apache.commons.lang3.RandomUtils;

import com.hepengju.data.generator.StringGenerator;
import com.hepengju.data.generator.config.DataConst;

public class EnglishLastNameGenerator implements StringGenerator {

private String[] lastNameArray = DataConst.lastNames;
	
	@Override
	public String generate() {
		return lastNameArray[RandomUtils.nextInt(0, lastNameArray.length)];
	}


}
