public class Bookshop3{

	String name,author,shopname;
	int price;
	
	
	
	public Bookshop3(String name1,String author1,int price1)
	{                                                               // constructiortor defenition
		
		
//	System.out.println(name+"-"+author+"-"+price);
	System.out.println("iam constructor");
		
		
		       name=name1;
		   author=author1;
		    price = price1;
		
	}
	
	public Bookshop3(String name1,int price1)
	{
		
		System.out.println(name1+" "+price1);
		     name = name1;
		     price = price1;
		
	}
	public Bookshop3(String name1,String author1,String shopname)
	{
		
		
		
		System.out.println(name1+" "+author1+" "+shopname);
		  
	}
	
	
	

public static void main(String[]args){



     Bookshop3 book1 = new Bookshop3("tamil","veerama munivar","vijay");
     Bookshop3 book2 = new Bookshop3("english",240);             // construction calling statement
     Bookshop3 book3 = new Bookshop3("engdh","ravintharnath thagore",240);             // construction calling statement

	
	
	   //    book1.name = "tamil";
	    //   book1.author = "veerama munivar";
	     //  book1.price = 200;
	
	
/*	book2.name = "english";
	book2.author = "ravintharnath thagore";
	book2.price = 240;
	
	
*/	
	book2.sell();
	book3.sell();
	book1.sell();
	
//	book1.buy();



}
	public void sell()
	{


      System.out.println(name+"-"+author+"-"+price);
		
		
	}
	
		
		
}