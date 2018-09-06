package com.training.example.common;

import java.util.List;

public interface Persistence<T> {

	
	boolean save(T object) throws Throwable;
	boolean delete(T object) throws Throwable;
	boolean update(T object) throws Throwable;
	T find(Class loadedClass,Object keyValue) throws Throwable;
	List getAll(Class loadedClass) throws Throwable;

	
}
