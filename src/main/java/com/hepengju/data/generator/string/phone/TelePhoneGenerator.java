package com.hepengju.data.generator.string.phone;

import com.hepengju.data.generator.StringGenerator;
import com.hepengju.data.generator.config.DataConst;
import com.hepengju.data.util.RandomUtil;

/**
 * 电话号码
 * 
 * @author hepengju
 *
 */
public class TelePhoneGenerator implements StringGenerator {

	@Override
	public String generate() {
		String telePhoneArea = RandomUtil.randomOne(DataConst.telePhoneArea);
		int num = 11 - telePhoneArea.length();
		return telePhoneArea + "-" + RandomUtil.randomNum(DataConst.numbers, num );
	}

}
