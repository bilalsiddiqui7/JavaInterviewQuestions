package com.practice.FactoryDesignPattern;

public class FactoryOperatingSystem {
	public OperatingSystem factoryOS(String os) {
		if (os.equals("Windows"))
			return new Windows();
		else if (os.equals("Android"))
			return new Android();
		else if (os.equals("IOS"))
			return new IOS();
		else
			return null;
	}
}
