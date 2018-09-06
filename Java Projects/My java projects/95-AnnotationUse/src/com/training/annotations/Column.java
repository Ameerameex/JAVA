package com.training.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Retention(value = RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD,ElementType.METHOD})
public @interface Column {

	String columnName();
	String columnType() default "String";
	int CoumnWidth() default 10;
	int decimalwidth() default 2;
}
