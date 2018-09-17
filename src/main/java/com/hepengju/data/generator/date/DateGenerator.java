package com.hepengju.data.generator.date;

import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang3.time.DateUtils;

import com.hepengju.data.generator.Generator;
import com.hepengju.data.util.RandomUtil;

/**
 * 日期生成器
 * 
 * @author hepengju
 */
public class DateGenerator implements Generator<Date>{

	private long startInclusive = -2209017600000l;    //1900-01-01 00:00:00
	private long endInclusive   = 4133952000000l;     //2101-01-01 00:00:00

	@Override
	public Date generate() {
		return DateUtils.truncate(RandomUtil.randomDate(startInclusive, endInclusive),Calendar.DATE);
	}

	public long getStartInclusive() {
		return startInclusive;
	}

	public void setStartInclusive(long startInclusive) {
		this.startInclusive = startInclusive;
	}

	public long getEndInclusive() {
		return endInclusive;
	}

	public void setEndInclusive(long endInclusive) {
		this.endInclusive = endInclusive;
	}

	
}

