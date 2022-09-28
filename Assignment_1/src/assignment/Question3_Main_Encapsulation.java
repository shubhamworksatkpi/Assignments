package assignment;

public class Question3_Main_Encapsulation {
	
	    public static void main(String[] args) {

//	        Encapsulation is a technique to  abstraction in Object-Oriented Programming,it helps to restrict access class members and methods


	    	Question3_Encapsulation emp = new Question3_Encapsulation();
	    	Question3_Encapsulation emp1 = new Question3_Encapsulation();
	    	Question3_Encapsulation emp2 = new Question3_Encapsulation();
	    	Question3_Encapsulation emp3 = new Question3_Encapsulation();
	    	Question3_Encapsulation emp4 = new Question3_Encapsulation();
	        emp.setName("Shubham Khule");
	        emp1.setAge(23);
	        emp2.setSalary(19700);
	        emp3.setEmpId(9188);
	        emp4.setLocation("Pune");
	        // Insted of direct calling variables we are calling getter and setters

	        System.out.println("Name :"+emp.getName());
	        System.out.println("Age :"+emp1.getAge());
	        System.out.println("Salary :"+emp2.getSalary());
	        System.out.println("EmpId :"+emp3.getempId());
	        System.out.println("Location :"+emp4.getLocation());
	       



	    }
	}


