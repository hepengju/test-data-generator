package com.hepengju.data.generator;

/**
 * 数据生成器
 * 
 * <br> 1.具有生成测试数据的功能
 * <br> 2.自己应该知道什么情况下选择自己
 * 
 * @author hepengju
 *
 */
public interface Generator<T>{
	
	/**
	 *  生成测试数据
	 */
	T generate();
	
	/**
	 * 选择我
	 */
	//double selectMe(MetaColumn metaColumn, List<Object> sampleData);
}
