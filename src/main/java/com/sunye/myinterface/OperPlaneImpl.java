package com.sunye.myinterface;

public class OperPlaneImpl implements Drive, Fly{

	@Override
	public void drive(Plane plane) {
		
		System.out.println(plane.toString() + "is driving");
	}

	@Override
	public void fly(Plane plane) {

		System.out.println(plane.toString() + "is flying");
	}

}
