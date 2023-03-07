
package rajivgandhi.bombblast;
public class Jail{

              static String  jail_name = "CENTAL JAIL";
			  static String  address = "chennai ";

                       String name1;
                       String case1;
                       String country1;
                       int age1;
	
	public Jail(String a,String b,int c,String d)
	{
		name1=a;
		case1=b;				
	    age1=c;
		country1=d;
	}
		

public static void main(String[]args){

                             Jail prisoner1 = new Jail("perarivalan","rajiv gandhi bomb blast",48,"srilanka");            // object creation
                              Jail prisoner2 = new Jail("nalini","rajiv gandhi bomb blast",39,"srilanka");            // object creation
                             
	                       prisoner1.case1_details();
	                       prisoner2.case2_details();
	
}
	public void case1_details()
	{
		
      System.out.println(this.name1);	
      System.out.println(this.age1);	
      System.out.println(this.case1);	
      System.out.println(this.country1);	
		
		
		
	}
  public void case2_details()
  {
	
   
	    System.out.println(this.name1);	
      System.out.println(this.age1);	
      System.out.println(this.case1);	
      System.out.println(this.country1);	
	  
	  
  }
}


                