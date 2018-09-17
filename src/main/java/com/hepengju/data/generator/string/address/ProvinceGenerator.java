package com.hepengju.data.generator.string.address;

import com.hepengju.data.generator.StringGenerator;
import com.hepengju.data.generator.config.DataConst;
import com.hepengju.data.util.RandomUtil;

/**
 * 省份
 * 
 * @author hepengju
 */
public class ProvinceGenerator implements StringGenerator {

	@Override
	public String generate() {
		return RandomUtil.randomOne(DataConst.provinces);
	}

}
