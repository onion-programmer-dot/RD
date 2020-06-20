package com.rd.interview;

public class Phone {
	private String model;
	private OSType osType;
	
	
	enum OSType{
		ANDROID, IOS
	}

	
	public Phone() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Phone(String model, OSType osType) {
		super();
		this.model = model;
		this.osType = osType;
	}
	
	


	public Phone(OSType osType) {
		super();
		this.osType = osType;
	}


	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}


	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}


	/**
	 * @return the osType
	 */
	public OSType getOsType() {
		return osType;
	}


	/**
	 * @param osType the osType to set
	 */
	public void setOsType(OSType osType) {
		this.osType = osType;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Phone [model=" + model + ", osType=" + osType + "]";
	}
	
	
}
