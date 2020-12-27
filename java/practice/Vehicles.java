package com.java.practice;

public class Vehicles {
	
	String type; 
    String model_no;
    String model_name;
    String owner_name;
    String owner_details;
	public Vehicles() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Vehicles(String model_no, String model_name, String owner_name, String owner_details) {
		super();
		this.model_no = model_no;
		this.model_name = model_name;
		this.owner_name = owner_name;
		this.owner_details = owner_details;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getModel_no() {
		return model_no;
	}
	public void setModel_no(String model_no) {
		this.model_no = model_no;
	}
	public String getModel_name() {
		return model_name;
	}
	public void setModel_name(String model_name) {
		this.model_name = model_name;
	}
	public String getOwner_name() {
		return owner_name;
	}
	public void setOwner_name(String owner_name) {
		this.owner_name = owner_name;
	}
	public String getOwner_details() {
		return owner_details;
	}
	public void setOwner_details(String owner_details) {
		this.owner_details = owner_details;
	}
	@Override
	public String toString() {
		return "Vehicles [type=" + type + ", model_no=" + model_no + ", model_name=" + model_name + ", owner_name="
				+ owner_name + ", owner_details=" + owner_details + "]";
	}
    
	public String retrieve(String type) throws TypeException{
        return null;
    }

}
