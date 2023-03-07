public class Bookshop{
	
                String book_name,author;
	                 //String author;
	             int pages;                 // non static starts with small letter 
	           

public static void main(String[] args){

            Bookshop book1 = new Bookshop();
            Bookshop book2 = new Bookshop();
	
	      book1.book_name = "strength of material";
	      book1.author = "vijayaraghavan";
	      book1.pages = 123;
	
	  book2.book_name = "finite element analysis";
	  book2.author = "ganesh";
	  book2.pages = 132;
	
	
	  book1.buy();
	//  book1.sell();
	  //  book2.buy();
//	Bookshop.buy();
	
}

	
	public void buy()
		
	{                                                        
		             Bookshop book2 = new Bookshop();                       // this keyword refer current object
	  book2.author = "akash";
		System.out.println(this.author);	
		
				book2.sell();               // this line refer to the object calling this line same as the method calling
		
	}
	public void sell()

	{
		
		
		System.out.println(this.author);	
		
		
	}
}