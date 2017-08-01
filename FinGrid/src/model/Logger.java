package model;

public class Logger {

		public static void writeLine(String logText){
			
			try{
				java.lang.System.out.println(logText);
			}
			catch (Exception ex){
				java.lang.System.out.println(ex.getMessage()+ " " + ex.getStackTrace());
			}
		}
		
		public static void writeLine(String[] args){
			// split string and log all
		}
		
		public Logger(){}

}
