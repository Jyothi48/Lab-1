package program1;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee("jyothi", 1, 20000);
		Employee e2=new Employee("Deepthi", 2, 60000);
		
		System.out.println("Initial details");
		e1.displayDetails();
    	e2.displayDetails();
    	
		e1.increaseSalary(5);
		e2.increaseSalary(5);
		
		System.out.println("incresed salary details:");
		e1.displayDetails();
		e2.displayDetails();
		

	}

}

