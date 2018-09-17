package com.hepengju.data.generator.string.random;

import org.apache.commons.lang3.RandomStringUtils;

import com.hepengju.data.generator.StringGenerator;

/**
 * 邮箱生成器
 * 
 * @author hepengju
 *
 */
public class RandomEmailGenerator implements StringGenerator {

	@Override
	public String generate() {
		StringBuilder result = new StringBuilder();
		
        result.append(RandomStringUtils.randomAlphanumeric(3,10));
        result.append("@");
        result.append(RandomStringUtils.randomAlphanumeric(1,5));
        result.append(".");
        result.append(RandomStringUtils.randomAlphanumeric(2,3));

        return result.toString().toLowerCase();
	}

}
