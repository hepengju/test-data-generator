package com.hepengju.genetor;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.stream.IntStream;

import org.junit.Test;

import com.hepengju.data.generator.Generator;
import com.hepengju.data.generator.date.DateGenerator;
import com.hepengju.data.generator.number.AutoIncrementGenerator;
import com.hepengju.data.generator.number.DoubleGenerator;
import com.hepengju.data.generator.number.IntegerGenerator;
import com.hepengju.data.generator.string.address.AddressGenerator;
import com.hepengju.data.generator.string.card.IdCardGenerator;
import com.hepengju.data.generator.string.computer.EmailGenerator;
import com.hepengju.data.generator.string.computer.IPv4Generator;
import com.hepengju.data.generator.string.name.ChineseNameGenerator;
import com.hepengju.data.generator.string.name.CompanyNameGenerator;
import com.hepengju.data.generator.string.name.EnglishNameGenerator;
import com.hepengju.data.generator.string.phone.MobileGenerator;
import com.hepengju.data.generator.string.phone.TelePhoneGenerator;
import com.hepengju.data.generator.string.random.RandomEmailGenerator;
import com.hepengju.data.generator.string.random.RandomMobileGenerator;

/**
 * 测试生成器
 * 
 * @author hepengju
 *
 */
public class GenetorTest {

	int COUNT = 10;
	
	@Test
	public void testOne() {
		System.out.println("出生日期");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		DateGenerator generator = new DateGenerator();
		IntStream.range(0, 100).forEach(i -> System.out.println(sdf.format(generator.generate())));
	}
	
	@Test
	public void testNumber() {
		System.out.println("随机整数");
		printN(new IntegerGenerator());
		
		System.out.println("随机小数");
		printN(new DoubleGenerator());
		
		System.out.println("自增主键");
		printN(new AutoIncrementGenerator());
	}
	
	@Test
	public void testString() {
		System.out.println("中文姓名");
		printN(new ChineseNameGenerator());
		
		System.out.println("英文姓名");
		printN(new EnglishNameGenerator());
		
		System.out.println("身份证号");
		printN(new IdCardGenerator());
		
		System.out.println("邮箱");
		printN(new EmailGenerator());
		System.out.println("随机邮箱");
		printN(new RandomEmailGenerator());
		
		System.out.println("IP地址(v4)");
		printN(new IPv4Generator());
		
		System.out.println("手机号");
		printN(new MobileGenerator());
		System.out.println("随机手机号");
		printN(new RandomMobileGenerator());
		
		System.out.println("地址");
		printN(new AddressGenerator());
		
		System.out.println("电话号码");
		printN(new TelePhoneGenerator());
		
		System.out.println("公司名称");
		printN(new CompanyNameGenerator());
		
	}
	
	public void printN(Generator<?> commonGenerator) {
		IntStream.range(0, COUNT).forEach(i -> System.out.println(commonGenerator.generate()));
		System.out.println();
	}
	
	@Test
	public void printYearTime() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.parse("1900-01-01").getTime());
		System.out.println(sdf.parse("2100-12-31").getTime());
		System.out.println(sdf.parse("2101-01-01").getTime());
	}
}
