package com.training.Annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Retention(value =RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Column {

	
	String name();
	int width();
	String colType();
	int precisionWidth() default 0;
}
