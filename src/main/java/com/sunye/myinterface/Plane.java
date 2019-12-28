package com.sunye.myinterface;

public class Plane {
	
	private boolean oidFlg;

	

	public boolean isOidFlg() {
		return oidFlg;
	}



	public void setOidFlg(boolean oidFlg) {
		this.oidFlg = oidFlg;
	}



	@Override
	public String toString() {
	
		return new String("The Plane ");
	}
}
