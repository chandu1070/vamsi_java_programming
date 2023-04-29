
		//single dimensional array
		//declare an array
		//insert values into array
		//find size of the array
		//read single value from an array
		//read multiple values from an array
package day6;

public class Single_dimensional_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
/*	int a[]=new int[5];//Declaration and inserting data into array{fixed}
	a[0]=100;
	a[1]=200;
	a[2]=300;
	a[3]=400;
    a[4]=500;  //array index out of bound */
   // approach-2
		int a[] ={100,200,300,400,500,600};// dynamic we can add any no of numbers
		//System.out.println(a.length);// 6
		//System.out.println(a[4]);//500 //read single value from an array
		//System.out.println(a[8]);//Index 8 out of bounds for length
	//for(int i=0;i<=a.length-1;i++)// read multiple values
	
	//{
		//System.out.println(a[i]);//100,200,300,400,500,600.
//	}
		for( int x:a)// for each loop
		{
			System.out.println(x);
		}// 100,200,300,400,500,600
		
		}

} 
