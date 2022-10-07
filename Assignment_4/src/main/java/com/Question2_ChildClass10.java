package com;

public class Question2_ChildClass10 extends Question1_EmployeeAbstract implements Runnable{

	@Override
	public int abstractmethod1() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int abstractmethod2() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int abstractmethod3() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int abstractmethod4() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int abstractmethod5() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int abstractmethod6() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int abstractmethod7() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int abstractmethod8() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Question2_ChildClass10 is using the runnable method");
	}

	public static void main(String[] args)
    {
	 
	 Thread threadobject2 = new Thread("Question2_ChildClass10");
	 threadobject2.start();
}

}
