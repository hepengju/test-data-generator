package com.hepengju.data.generator.number;

import java.util.concurrent.atomic.AtomicInteger;

import com.hepengju.data.generator.Generator;

/**
 * 自增生成器
 * @author hepengju
 *
 */
public class AutoIncrementGenerator implements Generator<Integer> {

	private AtomicInteger atomic = new AtomicInteger(0);
	
	@Override
	public Integer generate() {
		return atomic.incrementAndGet();
	}

}
