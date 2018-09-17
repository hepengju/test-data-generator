package com.hepengju.data.generator.number;

import org.apache.commons.lang3.RandomUtils;

import com.hepengju.data.generator.Generator;

/**
 * 整数生成器
 * 
 * @author hepengju
 *
 */
public class IntegerGenerator implements Generator<Integer>{

	private Integer startInclusive = 0;
	private Integer endExclusive = 99999;
	
	@Override
	public Integer generate() {
		return RandomUtils.nextInt(startInclusive,endExclusive);
	}

	public Integer getStartInclusive() {
		return startInclusive;
	}

	public void setStartInclusive(Integer startInclusive) {
		this.startInclusive = startInclusive;
	}

	public Integer getEndExclusive() {
		return endExclusive;
	}

	public void setEndExclusive(Integer endExclusive) {
		this.endExclusive = endExclusive;
	}

	
}
