package com.hepengju.data.generator.string;

import java.util.List;

import com.hepengju.data.generator.StringGenerator;
import com.hepengju.data.util.RandomUtil;

/**
 * 代码列表
 * 
 * @author hepengju
 *
 */
public class CodeListGenerator implements StringGenerator {

	private List<String> codeList;
	
	public CodeListGenerator(List<String> codeList) {
		super();
		this.codeList = codeList;
	}

	@Override
	public String generate() {
		return RandomUtil.randomOne(codeList);
	}

}
