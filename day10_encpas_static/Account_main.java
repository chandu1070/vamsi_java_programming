package day10_encpas_static;

public class Account_main {

	public static void main(String[] args) 
	{
	Account acc=new Account();
	// setters method
	acc.setAccount(100);
acc.setName("vamsi");
acc.getBalance();

// getters 
System.out.println(acc.getAccount());
System.out.println(acc.getName());
System.out.println(acc.getBalance());

	}

}
