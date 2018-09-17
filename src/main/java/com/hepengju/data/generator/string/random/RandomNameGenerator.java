package com.hepengju.data.generator.string.random;

import com.hepengju.data.generator.StringGenerator;
import com.hepengju.data.generator.config.DataConst;
import com.hepengju.data.util.RandomUtil;

public class RandomNameGenerator implements StringGenerator{

	
	private int startInclusive = 1;
	private int endExclusive = 10;

	@Override
	public String generate() {
		return RandomUtil.randomNum(DataConst.words, startInclusive, endExclusive);
	}

}
