package com.hepengju.data.generator.string.address;

import com.hepengju.data.generator.StringGenerator;
import com.hepengju.data.generator.config.DataConst;
import com.hepengju.data.util.RandomUtil;

/**
 * 城市
 * 
 * @author hepengju
 *
 */
public class CityGenerator implements StringGenerator {

	@Override
	public String generate() {
		return RandomUtil.randomOne(DataConst.cities);
	}

}
