package com.training.service;

import javax.jws.WebService;

@WebService
public interface Calc {

	double add(int x,int y);
}
