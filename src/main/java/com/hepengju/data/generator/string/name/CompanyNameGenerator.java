package com.hepengju.data.generator.string.name;

import com.hepengju.data.generator.StringGenerator;
import com.hepengju.data.generator.config.DataConst;
import com.hepengju.data.util.RandomUtil;

public class CompanyNameGenerator implements StringGenerator {

	@Override
	public String generate() {
		StringBuilder result = new StringBuilder();
		
		String city = RandomUtil.randomOne(DataConst.cities);
		city = city.replace("省", "").replace("市", "").replace("区", "");
		
		result.append(city)
		      .append(RandomUtil.randomNum(DataConst.words, 2,4))
		      .append(RandomUtil.randomOne(DataConst.companyIndustries))
		      .append("有限公司");
		
		return result.toString();
	}

}
