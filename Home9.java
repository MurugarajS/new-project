
public class Home9{

   public static void main(String[]args){


        Home9 member = new Home9();
		
		System.out.println(member.add(20,30));   //  method 1 calling
	   
	   System.out.println(member.add(20,30,40)); //  method  2 calling
	   
	  System.out.println(member.add("murugaraj","S","athikkottai")); // method 3 calling
	 
	       System.out.println(member.add(20,30.5f)); // method  4 calling deferent data type
	   
//   System.out.println(member.add("murugaraj",32));    // method 5 different data type  if addding  
	   
	System.out.println(member.add(20.4f,30.5f));  // METHOD 6 CALLING
    
	System.out.println(member.add("MURUGARAJ",'S'));   //METHOD 7 CALLING STRING AAND CHAR
	   
	            System.out.println(member.add(54.4f,56.76532));    // method 8 float and double  if
	   
	            System.out.println(member.add(9025777895L,'S'));
	   
	   
}
      int add(int a,int b)   // method 1 definition                    // method overloading is konwn as same method name but different data type or different number of arguments
         {	  
            int c = a+b;                          
			  System.out.println(c);
      return c;

       }

	int add(int a,int b,int c)  // method 2 definition
	{
		int d = a+b+c;
		return d;
	
	}
	
	String add(String a,String b,String c) // method 3 definition
	{
	     String d = a+" "+b+" "+c;
		return d;
	    
	}
	
	float add(int a,float b) // method 4 definition  this method also excute because i bring values from method calling 
		                       // as deferent data type of values passing arguments are also same data type of method calling.
	                                  
	{                             
		float c = a+b;
		return c;
		
		
	
}
	
//	int add(String a,int b)
	//{                           // method 5        // in this method also not execute because passing deferent parameter
		
	//int c = a+b;
	//	return c;
	
	
	
//}
	
	float add(float a,float b)             // METHOD 6 DEFINITION
		
	{		
		float c = a+b;
	return c;
	
	}
	
	String add(String a,char b)                  //method 7 definition
	{
	   String c = a+b;
		System.out.println(c);
		return c;
	}
	
	double add(float a,double b)
	{
		return a+b;
	}
	
	long add(long a,char b)
	{
		return a+b;
	   	
	}
	
	
	
	
}