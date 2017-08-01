package model;

public class PositionData {

	public PositionData() {
		// TODO Auto-generated constructor stub
	}
	
	public int getNextValue()
	{
		classvalue++;
		return classvalue;
	}
	
	private int classvalue = 0;

}
