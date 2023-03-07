public class Bookshop1{
          String author;
	            int price;


public static void main(String[]args){


            Bookshop1 book1 = new Bookshop1();
            Bookshop1 book2 = new Bookshop1();
	
			book1.author = "rajan";
			book1.price = 130;
	
	           book2.author = "makesh";
	           book2.price = 180;
	      

              book1.buy();

}
        public void buy()
		{
              Bookshop1 book2 = new Bookshop1();
                           book2.author = "kinametic";             
		System.out.println(this.author);	
		//	this.sell();
			book2.sell();
			
			
		}
			
	public void sell()
	
	{
		System.out.println(this.author);
		
	
	}
}