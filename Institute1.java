public class Institute1{
 
       static String name = "PAYILAGAM";
       static String address = "velachery";      // static variable refer as a class
	   
	 String student_name = "ravi";
	 String student_Education;
	 String course = "java full stack";             // non static variable refer as a object 
	 int course_fees = 39000;
	   
	   
	    Institute1(String a ,String b, String c)
	   {
		   
		 String d=a+" "+b+" "+c;
		   
		   System.out.println(d);
		   
		   
		   
		   
	   }



public static void main(String[]args){


                    Institute1 student1 = new Institute1("payilagam","software","coaching");
                    Institute1 student2 = new Institute1("payilagam","software","coaching");
                    Institute1 student3 = new Institute1("payilagam","software","coaching");
	
	                    student1.student_name = "MURUGARAJ";
	               student1.student_Education = "MECHANICAL ENGINEER";   
	                    student2.student_name = "VIVEK";
	               student2.student_Education = "COMPUTER ENGINEER";
	                    student3.student_name = "ARUN";
	               student3.student_Education = "COMPUTER ENGINEER";
	
	
					
					System.out.println(Institute1.name);
					System.out.println(Institute1.address);
					System.out.println(student2.student_name);
					System.out.println(student2.student_Education);
					System.out.println(student2.course);
					System.out.println(student2.course_fees);

	
	
	               System.out.println(student1.fees(5000));    // method 1
	                                                         
	               System.out.println(student1.fees(5000,10000));  // method 2 method 1 and method 2 is method overloading
	
	                    String result = student1.feedback("good");
	                        System.out.println(result);
	           String result1 = student1.feedback("average","missing_notes");  
	
	                       System.out.println(result1);
	                 
	                         

}

public int fees(int a)                 // method 1 defenition
{	
	
	               System.out.println(this.student_name);                   // this keyword use for current object
	 return a;
	
}	
	
public int fees(int a,int b)
{                                        // method 2 defenition
	return a+b;
	
}
	
	public String feedback(String a)
	{	   
	             System.out.println(this.student_name);
	           //  System.out.println(a);
	                   
		
		             Institute1 feedback_student2 = new Institute1();
		           feedback_student2.feedback();
	                 return a;
}	
	 String feedback(String a ,String b)
	{ 
               String name = "VIVEK";
		   System.out.println(name);
		 
		return a+"  "+b;
		
		
	}

	
}
