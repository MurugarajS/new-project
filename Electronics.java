 package deposite1.Electronics.com; 
public class Electronics{ 

                     String brand1;
                     String brand2;
                     String brand3;
                     String brand4;
                  
					 int price1;
					 int price2;
					 int price3;
					
					char processor1;
	     			 char processor2;
	
	                 float discount1;
	                 float discount2;
	                 float discount3;
	
	                 String gift1;
	                 String gift2;
	                 String gift3;

public Electronics(String a,String b,String c,String d,char e,char f)
{
           brand1 = a;
           brand2 = b;
           brand3 = c;
           brand4 = d;
		   processor1 = e;
		   processor2 = f;
		 
}
	public Electronics(String a,String b,int c,int d)
	{
		brand1 = a;
			brand2 = b;
			price1 = c;
			price2 = d;
		
	}
	public Electronics(String a,String b,String c ,int d,int e,int f)
		
	{
	    brand1 = a;
		brand2 = b;
		brand3 = c;
		price1 = d;
		price2 = e;
		price3 = f;
		
		
		
	}
	public Electronics(String a,float b,String c,int d,String e,float f,String g,int h,String i,float j,String k,int l)
	{
		     brand1 = a;
		     brand2 = e;
		     brand3 = i;
		      discount1 = b; 
		      discount2 = f; 
		      discount3 = j;
		price1 = d;
		price2 = h;
		price3 = l;
		    gift1 = c;
		    gift2 = g;
		    gift3 = k;
	}

					   
public static void main(String[]args){

          Electronics laptop = new Electronics("dell","acer","hp","lenovo",'I','A');
      Electronics computer = new Electronics("dell","hp",25000,30000);
       Electronics camera = new Electronics("cannon","nikon","sony",34000,38000,50000);
       Electronics smartphone = new Electronics("iphone",10.2f,"wireless_headphone",78000,"one plus",33.8f,"memory_card",38000,"samsung",7.5f,"pendrive",40000);
            
			laptop.buy1();
			computer.buy2();
			camera.buy3();
			smartphone.buy4();

}

public void buy1()
  {

System.out.println(brand1+" "+processor1);

}
	
	public void buy2()
	{
		System.out.println(brand2+" "+price2);
		
	}
	public void buy3()
	{
		
			System.out.println(brand3+" "+price3);
		
	}
	
	public void buy4()
	{
		
		System.out.println(brand1+"-brand "+price1+"-price "+discount1+"-discount "+gift1+"-gift ");
	}
			
}