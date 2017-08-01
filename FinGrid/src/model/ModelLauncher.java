package model;
import java.util.*;
//import java.lang.*;

public class ModelLauncher {

	public ModelLauncher() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger.writeLine("Starting ModelLaucher...");
		
		// create a new model object
		
		// initialize input and output mechanisms
		int counter = 0;
		// put it into a listening state
		ModelBase riskmodel = new RiskModel();
		
		riskmodel.start();

		
		while (s_stopRunning == false)
		{
			
			try{
			
			Thread.sleep(5000);
			counter++;
		
			Logger.writeLine("Still running; iteration " + Integer.toString(counter));
			}
			catch(Exception ex){
				s_stopRunning = true;
				Logger.writeLine("Exception " + ex.getMessage());
				
			}	
			finally{
				
				}
		}
		

	}
	
	private static boolean s_stopRunning = false; 

}
