package com.hepengju.data.generator.string.phone;

import com.hepengju.data.generator.StringGenerator;
import com.hepengju.data.generator.config.DataConst;
import com.hepengju.data.util.RandomUtil;

/**
 * 手机号
 * 
 * @author hepengju
 *
 */
public class MobileGenerator implements StringGenerator{

	@Override
	public String generate() {
		return RandomUtil.randomOne(DataConst.mobileTypes) + RandomUtil.randomNum(DataConst.numbers, 8);
	}

}
