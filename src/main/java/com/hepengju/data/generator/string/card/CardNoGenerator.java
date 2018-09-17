package com.hepengju.data.generator.string.card;

import com.hepengju.data.generator.StringGenerator;
import com.hepengju.data.generator.config.DataConst;
import com.hepengju.data.util.RandomUtil;

/**
 * 卡号生成器
 * 
 * @author hepengju
 *
 */
public class CardNoGenerator implements StringGenerator{

	private int length = 16;
	
	@Override
	public String generate() {
		return RandomUtil.randomNum(DataConst.numbers, length);
	}

}
