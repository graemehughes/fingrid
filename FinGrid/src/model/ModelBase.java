package model;

public abstract class ModelBase {
	
	public abstract void initInputData();
	
	public abstract void initResultData();
	
	public void start(){
		
		Logger.writeLine("Starting Model...");
		
	}

}
