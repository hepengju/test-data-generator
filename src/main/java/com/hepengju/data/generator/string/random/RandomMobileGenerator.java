package com.hepengju.data.generator.string.random;

import com.hepengju.data.generator.StringGenerator;
import com.hepengju.data.generator.config.DataConst;
import com.hepengju.data.util.RandomUtil;

/**
 * 手机号
 * 
 * @author hepengju
 *
 */
public class RandomMobileGenerator implements StringGenerator{

	@Override
	public String generate() {
		return "1" + RandomUtil.randomNum(DataConst.numbers, 10);
	}

}
