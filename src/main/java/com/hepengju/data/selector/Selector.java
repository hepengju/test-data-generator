package com.hepengju.data.selector;

import java.util.List;

import com.hepengju.data.generator.Generator;
import com.hepengju.data.meta.MetaColumn;

/**
 * 
 * 数据产生器的选择器
 * 
 * @author hepengju
 *
 */
@FunctionalInterface
public interface Selector {
	
	/**
	 * @param metaColumn  列元数据
	 * @param sampleData  样例数据
	 */
	Generator<?> select(MetaColumn metaColumn,List<Object> sampleData);
}
