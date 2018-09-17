package com.hepengju.data.util;

import java.util.List;

import com.hepengju.data.generator.Generator;
import com.hepengju.data.generator.date.DateGenerator;
import com.hepengju.data.generator.date.DateTimeGenerator;
import com.hepengju.data.generator.number.AutoIncrementGenerator;
import com.hepengju.data.generator.number.DoubleGenerator;
import com.hepengju.data.generator.number.IntegerGenerator;
import com.hepengju.data.generator.string.CodeListGenerator;
import com.hepengju.data.generator.string.address.AddressGenerator;
import com.hepengju.data.generator.string.computer.EmailGenerator;
import com.hepengju.data.generator.string.computer.IPv4Generator;
import com.hepengju.data.generator.string.name.ChineseNameGenerator;
import com.hepengju.data.generator.string.name.CompanyNameGenerator;
import com.hepengju.data.generator.string.password.Md5Generator;
import com.hepengju.data.generator.string.phone.MobileGenerator;
import com.hepengju.data.generator.string.phone.TelePhoneGenerator;
import com.hepengju.data.generator.string.random.RandomNameGenerator;
import com.hepengju.data.generator.string.random.RandomStringGenerator;
import com.hepengju.data.meta.ColumnType;
import com.hepengju.data.meta.MetaColumn;

/**
 * 生成器选择工具类
 * 
 * @author hepengju
 *
 */
public class SelectorUtil {
	
	
	public void selectGenerator(MetaColumn metaColumn, List<Object> sampleData) {

		Generator<?> generator = new RandomStringGenerator();
		
		// 一.根据列的元数据判断
		if (metaColumn != null) {
			// 1.代码值(枚举值)
			if (metaColumn.getCodeList() != null && metaColumn.getSize() > 0) {
				generator = new CodeListGenerator(metaColumn.getCodeList());
			} else {

				// 2.日期类型
				ColumnType type = metaColumn.getType();
				if (ColumnType.DATE == type) {
					generator = new DateGenerator();
				} else if (ColumnType.DATETIME == type) {
					generator = new DateTimeGenerator();

				// 3.数字类型
				} else if (ColumnType.DOUBLE == type) {
					generator = new DoubleGenerator();
				} else if (ColumnType.INTEGER == type) {
					// 自增主键
					if (metaColumn.getAutoIncrement()) {
						generator = new AutoIncrementGenerator();
					} else {
						generator = new IntegerGenerator();
					}
				
				// 4.字符串
				} else {
					String comment = metaColumn.getComment();
					String field = metaColumn.getField();
					//Integer size = metaColumn.getSize();
					
					//4.1名字
					if(comment.contains("姓名") || comment.contains("名称") || field.contains("name")) {
						if(comment.contains("公司") || field.contains("company")) {
							generator = new CompanyNameGenerator();
						}else if(comment.contains("用户") || comment.contains("客户") || field.contains("user") || field.contains("cust")){
							generator = new ChineseNameGenerator();
						}else {
							generator = new RandomNameGenerator();
						}
						
					//4.2密码
					}else if(comment.contains("密码") || field.contains("password")){
						generator = new Md5Generator();
					
					//4.2手机,电话号码
					}else if(comment.contains("手机") || comment.contains("电话") || comment.contains("号码") || field.contains("mobile") || field.contains("contact") || field.contains("phone")){
						if(comment.contains("电话") || field.contains("tele")) {
							generator = new TelePhoneGenerator();
						}else {
							generator = new MobileGenerator();
						}
					
					//4.3ip地址
					}else if(comment.contains("ip") || comment.contains("IP") || field.contains("ip_addr")){
						generator = new IPv4Generator();
						
					//4.4地址
					}else if(comment.contains("地址") || field.contains("addr")){
						generator = new AddressGenerator();
						
					//4.5邮箱	
					}else if(comment.contains("邮箱") || field.contains("mail")){
						generator = new EmailGenerator();
					}
				}
			}

		}

		// 二.根据样本数据判断(TODO)
		
		metaColumn.setGenerator(generator);
	}
}
