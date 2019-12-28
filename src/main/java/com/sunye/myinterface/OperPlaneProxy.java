package com.sunye.myinterface;

public class OperPlaneProxy implements Drive, Fly {

	private Drive target;
	
	public OperPlaneProxy(Drive d) {
		
		target = d;
	}
	
	private void operationCheck(Plane plane) {
		
		if(!plane.isOidFlg()) {
			
			System.out.println("没有燃油...");
			return;
		}
	}
	
	@Override
	public void drive(Plane plane) {
		
		operationCheck(plane);
		target.drive(plane);
	}

	@Override
	public void fly(Plane plane) {
		
		operationCheck(plane);	
		target.drive(plane);
	}

}
