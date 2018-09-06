package com.training.business;

public class EngineProducer {

	public Engine produceEngine(){
		
	return new Engine("defaultModel");
	}
	public Engine produceEngine(String modelName){
		
		return new Engine(modelName);
		}
	
	
}
