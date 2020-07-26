package com.basic;

class StaticRunningProgram {
	static {
		System.out.println("1");
	}

	{
		System.out.println("2");			
	}
	
	StaticRunningProgram() {
		System.out.println("3");		
	}
	public static void main(String args[]) {
		StaticRunningProgram a = new StaticRunningProgram();
	}
}