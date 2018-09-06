package com.training.service;

import javax.jws.WebService;

@WebService
public interface CollegeService {
	String getCollegeName();
	String getCollegeEmail();
	String getCollegePhone();

}
