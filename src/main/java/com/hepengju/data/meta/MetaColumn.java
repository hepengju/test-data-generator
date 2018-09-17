package com.hepengju.data.meta;

import java.util.List;

import com.hepengju.data.generator.Generator;

/**
 * 
 * @author hepengju
 *
 */
public class MetaColumn {

	private String       comment        = ""       ;  //列注释
	private String       field                     ;  //列字段
	private ColumnType   type  = ColumnType.STRING ;  //列类型
	
	private Integer      size  = 10                ;  //列大小(对于字符串类型是长度,对于整数和小数是精度)
	private Integer      scale = 0                 ;  //列精度
	
	private Boolean      autoIncrement  = false    ;  //是否是自增
	private Boolean      unique         = false    ;  //是否唯一
	private Boolean      nullable       = true     ;  //是否可空
	
	private String       defaultValue              ;  //默认值
	private List<String> codeList                  ;  //码值列表
	
	private Generator<?> generator                 ;  //生成器

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public ColumnType getType() {
		return type;
	}

	public void setType(ColumnType type) {
		this.type = type;
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public Integer getScale() {
		return scale;
	}

	public void setScale(Integer scale) {
		this.scale = scale;
	}

	public Boolean getAutoIncrement() {
		return autoIncrement;
	}

	public void setAutoIncrement(Boolean autoIncrement) {
		this.autoIncrement = autoIncrement;
	}

	public Boolean getUnique() {
		return unique;
	}

	public void setUnique(Boolean unique) {
		this.unique = unique;
	}

	public Boolean getNullable() {
		return nullable;
	}

	public void setNullable(Boolean nullable) {
		this.nullable = nullable;
	}

	public String getDefaultValue() {
		return defaultValue;
	}

	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}

	public List<String> getCodeList() {
		return codeList;
	}

	public void setCodeList(List<String> codeList) {
		this.codeList = codeList;
	}

	public Generator<?> getGenerator() {
		return generator;
	}

	public void setGenerator(Generator<?> generator) {
		this.generator = generator;
	}                ;  
	
	
}
