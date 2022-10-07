package com;

public class Question2_ChildClass7 extends Question1_EmployeeAbstract implements Runnable{

	@Override
	public int abstractmethod1() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public int abstractmethod2() {
		// TODO Auto-generated method stub
		return 2;
	}

	@Override
	public int abstractmethod3() {
		// TODO Auto-generated method stub
		return 3;
	}

	@Override
	public int abstractmethod4() {
		// TODO Auto-generated method stub
		return 4;
	}

	@Override
	public int abstractmethod5() {
		// TODO Auto-generated method stub
		return 5;
	}

	@Override
	public int abstractmethod6() {
		// TODO Auto-generated method stub
		return 6;
	}

	@Override
	public int abstractmethod7() {
		// TODO Auto-generated method stub
		return 7;
	}

	@Override
	public int abstractmethod8() {
		// TODO Auto-generated method stub
		return 8;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Question2_ChildClass7 is using the runnable method");
	}

	public static void main(String[] args)
    {
	 
	 Thread threadobject7 = new Thread("Question2_ChildClass8");
	 threadobject7.start();
}

	

}
