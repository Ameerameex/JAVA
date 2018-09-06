package com.training.service;

import javax.jws.WebService;

@WebService(endpointInterface="com.training.service.CollegeService")
public class CollegeServiceImpl implements CollegeService {

	@Override
	public String getCollegeName() {
		
		return "SNR College";
	}

	@Override
	public String getCollegeEmail() {
		return "snr@gmail.com";
	}

	@Override
	public String getCollegePhone() {
		return "044-4320045";
	}

}
