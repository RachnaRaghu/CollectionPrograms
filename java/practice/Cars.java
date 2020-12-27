package com.java.practice;

public class Cars extends Vehicles{

	public Cars() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cars(String model_no, String model_name, String owner_name, String owner_details) {
		super(model_no, model_name, owner_name, owner_details);
		// TODO Auto-generated constructor stub
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
  
  public String retrieve(String type) throws TypeException {
	  if(type==null)
		  throw new TypeException();
	  else {
		  System.out.println(
		   "model_no=" + model_no + ", model_name=" + model_name + ", owner_name="
					+ owner_name + ", owner_details=" + owner_details);
	  }
	return type;
	
	  
}

}

class TypeException extends Exception{

	public TypeException() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Vehicle Type Not Set";
	}
	
	
}
