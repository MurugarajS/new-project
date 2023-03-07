public class Laptop1{

public static void main(String[]args){


		Laptop1 keyboard = new Laptop1();                // object creation
	
               keyboard.add(); 
  int result1 = keyboard.add();                  // add method calling
	
	      keyboard.sub();
int result2 = keyboard.sub();                  // sub method calling
	
	    keyboard.multiply();
int result3	= keyboard.multiply();
	
	
	
	
	System.out.println(result1);
	System.out.println(result2);
	System.out.println(result3);
}
 int add()                                  // add method definition
 {      
	 int a = 32;
	 int b = 45;
	 int c =a+b; 
	 
	 
return c;

	 }

int sub()                                       // sub method definition
{	
     int ab = 54;
	int bc = 43;
	int cd = ab-bc;
return cd;

}

int multiply()
{
	int no1 = 43;
	int no2 = 32;
	int no3 = no1*no2;
		return no3;


}
}
