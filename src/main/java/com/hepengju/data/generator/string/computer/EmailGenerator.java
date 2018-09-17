package com.hepengju.data.generator.string.computer;

import org.apache.commons.lang3.RandomStringUtils;

import com.hepengju.data.generator.StringGenerator;
import com.hepengju.data.generator.config.DataConst;
import com.hepengju.data.util.RandomUtil;

/**
 * 邮箱生成器
 * 
 * @author hepengju
 *
 */
public class EmailGenerator implements StringGenerator {

	private String[] popolarMailSupplies = DataConst.popolarMailSupplies;
	
	@Override
	public String generate() {
		StringBuilder result = new StringBuilder();
        result.append(RandomStringUtils.randomAlphanumeric(3,10));
        result.append(RandomUtil.randomOne(popolarMailSupplies));
        return result.toString().toLowerCase();
	}

}
