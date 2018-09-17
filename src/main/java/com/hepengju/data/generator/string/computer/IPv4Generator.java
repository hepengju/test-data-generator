package com.hepengju.data.generator.string.computer;

import org.apache.commons.lang3.RandomUtils;

import com.hepengju.data.generator.StringGenerator;

/**
 * IP地址(v4)生成器
 * 
 * @author hepengju
 *
 */
public class IPv4Generator implements StringGenerator {

	@Override
	public String generate() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(RandomUtils.nextInt(0, 255))
		  .append(".")
		  .append(RandomUtils.nextInt(0, 255))
		  .append(".")
		  .append(RandomUtils.nextInt(0, 255))
		  .append(".")
		  .append(RandomUtils.nextInt(0, 255));
		
		return sb.toString();
	}

}
