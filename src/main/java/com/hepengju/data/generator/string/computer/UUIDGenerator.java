package com.hepengju.data.generator.string.computer;

import java.util.UUID;

import com.hepengju.data.generator.StringGenerator;

/**
 * UUID生成器
 * 
 * @author hepengju
 *
 */
public class UUIDGenerator implements StringGenerator{

	@Override
	public String generate() {
		return UUID.randomUUID().toString();
	}

}
