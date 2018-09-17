package com.hepengju.data.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.RandomUtils;

/**
 * 随机工具类
 * 
 * @author hepengju
 *
 */
public class RandomUtil {

	private static final String DATE_FORMAT = "yyyy-MM-dd";

	/**
	 * 获取随机日期
	 */
	public static Date randomDate(String beginDate, String endDate) {
		try {
			SimpleDateFormat format = new SimpleDateFormat(DATE_FORMAT);
			Date start = format.parse(beginDate);
			Date end = format.parse(endDate);
			return randomDate(start.getTime(), end.getTime());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static Date randomDate(long startInclusive, long endExclusive) {
		//return new Date(RandomUtils.nextLong(startInclusive, endExclusive));
		return new Date(startInclusive + (long)((endExclusive - startInclusive) * Math.random()));
	}

	/**
	 * 数组中随机取一个
	 */
	public static String randomOne(String[] array) {
		return array[RandomUtils.nextInt(0, array.length)];
	}
	
	public static String randomOne(List<String> list) {
		return list.get(RandomUtils.nextInt(0, list.size()));
	}
	
	/**
	 * 数组中随机取N个
	 */
	public static String randomNum(String[] array, int num) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < num; i++) {
			sb.append(randomOne(array));
		}
		return sb.toString();
	}
	
	public static String randomNum(String[] array, int startInclusive,int endExclusive) {
		StringBuilder sb = new StringBuilder();
		int num = RandomUtils.nextInt(startInclusive, endExclusive);
		for (int i = 0; i < num; i++) {
			sb.append(randomOne(array));
		}
		return sb.toString();
	}

	public static boolean randomChance(double chance) {
		return Math.random() < chance;
	}

	public static Integer randomInt(Map<Integer, Double> chanceMap) {
		for (Map.Entry<Integer, Double> entry : chanceMap.entrySet()) {
			if (randomChance(entry.getValue()))
				return entry.getKey();
		}
		return chanceMap.keySet().iterator().next();
	}
	
	
}
