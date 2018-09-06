package com.training.business;

 class Engine {

	
	String modelName;
	

	public Engine(String modelName) {
		super();
		this.modelName = modelName;
	}


	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	@Override
	public String toString() {
		return "Engine [modelName=" + modelName + "]";
	}
	
	
}
