package data_Type;

public class Prog1_variables 

{
	// declare under class body
	//this variable is non static in nature
	//it can use as non initialsed in non static method
	//we are not using static keyword
	int a=100; //initialized instance variable
	double b;// non initialized instance variable
	public void demo ()// non static method
	{
		System.out.println("I am in demo method a");
		System.out.println("i am in demo method="+b);
	}
	public void demo_duplicate () // non static
	{
		System.out.println("I am in demo_duplicate method="+a);
		System.out.println("i am in demo_duplicate method="+b);
	}
	
	//public static void demo_copy ()// static method
	//{
		//System.out.println("I am in static method="+a);
		//System.out.println("i am in static method="+b);
	//}
	public static void main(String[]args)
	{
		Prog1_variables obj= new Prog1_variables();
		obj.demo();
		System.out.println(obj.b);
		obj.demo_duplicate();
	}
}



