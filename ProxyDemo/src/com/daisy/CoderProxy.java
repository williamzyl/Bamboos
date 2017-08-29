package com.daisy;

public class CoderProxy implements ICoder {

	private ICoder iCode;
	
	
	
	public CoderProxy(ICoder iCode) {
		this.iCode = iCode;
	}



	public ICoder getiCode() {
		return iCode;
	}



	public void setiCode(ICoder iCode) {
		this.iCode = iCode;
	}



	@Override
	public void implDemands(String demandsName) {
		this.iCode.implDemands(demandsName);
	}

}
