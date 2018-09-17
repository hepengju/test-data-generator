package com.hepengju.data.generator.number;

import java.math.BigDecimal;

import org.apache.commons.lang3.RandomUtils;

import com.hepengju.data.generator.Generator;

/**
 * 小数生成器
 * 
 * @author hepengju
 *
 */
public class DoubleGenerator implements Generator<Double>{

	private Double startInclusive = 0.0;
	private Double endInclusive = 1000.0;
	private Integer scale = 2;
	
	@Override
	public Double generate() {
		double doubleValue = RandomUtils.nextDouble(startInclusive,endInclusive);
		return new BigDecimal(doubleValue).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
	}

	public Double getStartInclusive() {
		return startInclusive;
	}

	public void setStartInclusive(Double startInclusive) {
		this.startInclusive = startInclusive;
	}

	public Double getEndInclusive() {
		return endInclusive;
	}

	public void setEndInclusive(Double endInclusive) {
		this.endInclusive = endInclusive;
	}

	public Integer getScale() {
		return scale;
	}

	public void setScale(Integer scale) {
		this.scale = scale;
	}
	
}
