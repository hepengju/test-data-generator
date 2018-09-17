package com.hepengju.genetor;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.stream.IntStream;

import org.junit.Test;

import com.hepengju.data.generator.Generator;
import com.hepengju.data.generator.date.DateGenerator;
import com.hepengju.data.generator.number.AutoIncrementGenerator;
import com.hepengju.data.generator.number.DoubleGenerator;
import com.hepengju.data.generator.number.IntegerGenerator;
import com.hepengju.data.generator.string.CodeListGenerator;
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

	int COUNT = 100;
	Generator<String> stringGenerator;
	
	@Test
	public void testPersonData() throws ParseException {
		
		//姓名
		Generator<String> nameGenerator = new ChineseNameGenerator();
		
		//性别
		Generator<String> genderGenerator = new CodeListGenerator(Arrays.asList("M","F"));
		
		//出生日期
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		DateGenerator birthDateGenerator = new DateGenerator();
		birthDateGenerator.setStartInclusive(sdf.parse("1900-01-01").getTime());
		birthDateGenerator.setEndInclusive((new Date().getTime()));
		
		//家庭人口
		IntegerGenerator populationGenerator = new IntegerGenerator();
		populationGenerator.setStartInclusive(1);
		populationGenerator.setEndExclusive(10);
		
		//家庭地址
		AddressGenerator addressGenerator = new AddressGenerator();
		
		//手机号
		MobileGenerator mobileGenerator = new MobileGenerator();
		
		//年收入
		DoubleGenerator incomeGenerator = new DoubleGenerator();
		incomeGenerator.setStartInclusive(0.0);
		incomeGenerator.setEndInclusive(99999.0);
		incomeGenerator.setScale(3);
		
		//经理,机构
		CodeListGenerator managerGenerator = new CodeListGenerator(Arrays.asList("M004","M005","M006","M007"));
		
		//反射生成数据
		//List<Generator<?>> generatorList = new ArrayList<>();
		//generatorList.add(nameGenerator);
		//generatorList.add(genderGenerator);
		//generatorList.add(mobileGenerator);
		//generatorList.add(birthDateGenerator);
		//generatorList.add(populationGenerator);
		//generatorList.add(incomeGenerator);
		
		//手工生成数据
		StringBuilder sb = new StringBuilder();
		IntStream.range(0, 1000).forEach(i -> {
			String managerId = managerGenerator.generate();
			String orgId = Arrays.asList("M004","M005").contains(managerId) ? "ORG0101":"ORG0102";
			sb.append(nameGenerator.generate()).append("\t")                     //姓名
			  .append(genderGenerator.generate()).append("\t")                   //性别
			  .append(mobileGenerator.generate()).append("\t")                   //手机号
			  .append(sdf.format(birthDateGenerator.generate())).append("\t")    //出生日期
			  .append(populationGenerator.generate()).append("\t")               //家庭人口
			  .append(incomeGenerator.generate()).append("\t")                   //年收入
			  .append(managerId).append("\t")                                    //经理编号
			  .append(orgId).append("\t")                                        //机构编号
			  .append(addressGenerator.generate())                               //家庭地址
			  .append("\n");
		});
		
		System.out.println(sb);
	}
	
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
	
	//@Test
	public void printYearTime() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.parse("1900-01-01").getTime());
		System.out.println(sdf.parse("2100-12-31").getTime());
		System.out.println(sdf.parse("2101-01-01").getTime());
	}
}
