package com.core.integra;

public class Student {
	
	private int ID;
	private String NAME;
	private int COST;

	public Student(int ID, String NAME, int COST) {
		super();
		this.ID = ID;
		this.NAME = NAME;
		this.COST = COST;
	}

	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getNAME() {
		return NAME;
	}
	public void setNAME(String nAME) {
		NAME = nAME;
	}
	public int getCOST() {
		return COST;
	}
	public void setCOST(int cOST) {
		COST = cOST;
	}
	


	

}
