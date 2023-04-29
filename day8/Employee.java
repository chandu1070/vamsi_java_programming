package day8;

public class Employee
{

	int eid;
	String ename;
	int esal;
	String job;
	void display()
	{
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(esal);
		System.out.println(job);
	}
	
	
	public static void main(String[] args) {
		Employee empobj1= new Employee();   //object creation
		empobj1.eid=101;
		empobj1.ename="vamsi";
		empobj1.esal=25000;
		empobj1.job="manager";
		empobj1.display();
		
		Employee empobj2= new Employee();
		empobj2.eid=102;
		empobj2.ename="vinay";
		empobj2.esal=30000;
		empobj2.job="manager";
		empobj2.display();
				
		
		
		
				
				
		
		
		


	}

}
