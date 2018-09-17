package com.hepengju.data.generator.date;

import java.util.Date;

import com.hepengju.data.generator.Generator;
import com.hepengju.data.util.RandomUtil;

/**
 * 日期时间数据生成器
 * 
 * @author hepengju
 *
 */
public class DateTimeGenerator implements Generator<Date>{

	private long startInclusive = -2209017600000l;    //1900-01-01 00:00:00
	private long endInclusive   = 4133952000000l;     //2101-01-01 00:00:00
	
	
	public DateTimeGenerator() {
		super();
	}

	public DateTimeGenerator(long startInclusive, long endInclusive) {
		super();
		this.startInclusive = startInclusive;
		this.endInclusive = endInclusive;
	}


	@Override
	public Date generate() {
		return RandomUtil.randomDate(startInclusive, endInclusive);
	}

}
