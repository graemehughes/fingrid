package model;

public class RiskModel extends ModelBase {

	public RiskModel() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initInputData() {
		// TODO Auto-generated method stub
		inData = new PositionData();
		
	}

	@Override
	public void initResultData() {
		// TODO Auto-generated method stub
		resultData = new ResultData();
	}
	
	private PositionData inData = null;
	private ResultData resultData = null;
	
	@Override
	public void start()
	{
		super.start();
		
		// get in data
		// perform calc
		calculate(inData, resultData);
		// set output data
		
		
	}
	
	private void calculate(PositionData inputs, ResultData results){
		
		// get meta data
		
		// perform calculation
		
		// set results
	}
	
	
	

}
