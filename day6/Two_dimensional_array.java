package day6;

public class Two_dimensional_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int a[][]=new int[1][2];// declaration
		// inserting the data into array
	//int b [][]= new int [2][3];
	//int[][]c= new int[3][2];
	//int[]d[]= new int[1][4];
				
		int a[][]= {{100,200},{300,400},{500,600}};// inserting and read the single value
		//System.out.println(f[0][1]);
		//System.out.println("number of rows:"+f.length);//3      length
		//System.out.println("number of columns:"+f[0].length);//2    length
	//System.out.println(f[1][1]);//400: read single value from array
	
	
		for(int r=0; r<a.length;r++)// read multiple values in array
		{
			for(int c=0; c<2;c++)
			{ 
				System.out.print(a[r][c]+ "   ");//100,200,300,400,500,600
			}
			System.out.println();// 100   200
			                       // 200   500
			                        //300   600
		}
		
		

	}

}
