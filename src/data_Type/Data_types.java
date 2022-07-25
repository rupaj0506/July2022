package data_Type;

public class Data_types 

{
	public void boolean_Demo ()
	{// default size--> 1 bit
		// true/false value 
		// default --> false
		boolean b= false;
		System.out.println("Boolean value is "+b);
		
	}
	public void Byte_Demo ()
	{
		//default value-->0
		// size-->1 byte=8 bit
		// range--> -2^(n-1) to 2^(n-1)-1 i.e-128 to 127
		byte b=127;
	System.out.println("byte value is"+b);
	}
   public void Short_Demo()
   {//default value-->0
	   //size-->2 byte
	   //range-->-32768 to32767
	   short b=32767;
	   System.out.println("Short value is"+ b );}
	   public void Int_demo ()
	   {//value-->0
		   //size:4byte
		   //range-->(-2^31) to((2^31)-1)
		   int b=1235689654;
		   System.out.println("int value is"+b);
		   
	   }
	   public void Long_Demo () 
		{
			// Default Value --> 0l
			// size: --> 8 byte
			// range --> (-2^63) to ((2^63)-1) 
			long b = 1234567899999999l; 
			System.out.println("Long value is "+b);
   }
		public void Float_Demo () 
		{
			// Default Value --> 0.0f
			// size: --> 4 byte
			// range --> unlimited --> 
			float b = 12345678.999999999999f; 
			System.out.println("Float value is "+b);
		}
		public void Double_Demo () 
		{
			// Default Value --> 0.0d
			// size: -
			//-> 8 byte
			// range --> unlimited --> 
			double b = 123456789999999999999999999999999999.999999999999999999999999999999999999999999999999; 
			System.out.println("Double value is "+b);
		}
		public void Char_Demo () 
		{
			// Default Value --> 
			// size: --> 4 byte
			// range --> unlimited --> 
			char b = 'A'; 
			System.out.println("Char value is "+b);	
		}
		public static void main (String[] rup)
		{ Data_types D=new Data_types ();
		D.boolean_Demo();
		D.Byte_Demo();
		D.Short_Demo();
		D.Int_demo();
		D.Long_Demo();
		D.Float_Demo();
		D.Double_Demo();
		D.Char_Demo();
		}
}





