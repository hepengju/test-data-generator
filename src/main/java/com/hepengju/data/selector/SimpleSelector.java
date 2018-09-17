package com.hepengju.data.selector;

import java.util.List;

import com.hepengju.data.generator.Generator;
import com.hepengju.data.generator.string.CodeListGenerator;
import com.hepengju.data.meta.MetaColumn;

public class SimpleSelector implements Selector {

	@Override
	public Generator<?> select(MetaColumn metaColumn, List<Object> sampleData) {
		
		
		//一.根据列的元数据判断
		if(metaColumn != null) {
			//1.代码值(枚举值)
			if(metaColumn.getCodeList() != null && metaColumn.getSize() > 0) {
				return new CodeListGenerator(metaColumn.getCodeList());
			}
			
			//2.
		}
		
		//二.根据样本数据判断(TODO)
		
		
		
		return null;
	}

}
