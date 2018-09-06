package com.training.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(value = RetentionPolicy.RUNTIME)
public @interface Id {
String columnName();
String columnType();
String generatedStrategy() default "AUTO";
}
