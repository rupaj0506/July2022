package data_Type;

public class Relational_operatorprog2 
{
	

	public class Arithmatic_operator 
		 
		{
			static int a = 10;  
			static int b=20; // Static Variable

			public static void main(String[] args) 
			{
				System.out.println(a);
				System.out.println(b);
				
				System.out.println("Arithmatic operator");
				System.out.println("Addition "+ (a+b));  //30
				System.out.println("Substraction "+ (b-a)); //10
				System.out.println("multiplication "+ (a*b)); //200
				System.out.println("Division "+ (a/b));  //  0
				System.out.println("Reminder "+ (a%b)); //
				
				// Shift operator
				int d = 70;
				System.out.println("Left shift="+ (10 << 3));  // 10 * 2^3 = 80
				System.out.println("Right shift=" + (d >> 4)); // 80 / 2^4 = 5
				System.out.println("Right shift=" + (80 >>> 4));
				
			

		}


	}

}
