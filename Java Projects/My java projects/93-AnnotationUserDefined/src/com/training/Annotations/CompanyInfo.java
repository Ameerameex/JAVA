package com.training.Annotations;

public @interface CompanyInfo {

	int startYear();

	String CEO();

	String[] directors();

	int[] expansionYears();

}
