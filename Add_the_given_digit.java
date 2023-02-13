package practice;

public class Add_the_given_digit {

	public static void main(String[] args) {
	 
		
		Add_the_given_digit obj = new Add_the_given_digit();
		
		     //    obj.	// TODO Auto-generated method stubAdd_the_given_digit(12345);
		     //   obj.reverse_the_given_digit1(12345);
		         obj.Add_the_given_digit_untill_becomes_single_digit(12345);
		

	}	

	private void Add_the_given_digit_untill_becomes_single_digit(int no) {
	                         		         
		          int total=0;           
		          while(no>0)
		          {
		        	  total = total+no%10;
		        	  no=no/10;
		        	         	  
		          }
		             
		              
		            if(total>9)
		            {
		           
		            	  Add_the_given_digit_untill_becomes_single_digit(total);
		            }  
		            else
		            {
		            	  System.out.println(total);
		            } 
		
		
		
		
		
		
	}

	private void reverse_the_given_digit1(int no) {
		
		         no=12345;
		        int reverse = 0;
		         
		       while(no>0)
		       {
		    	   System.out.print(no%10);
		    	   
		    	   no=no/10;
		    	   
		    	   
		    	   
		    	   
		       }
		
		
		
		
	}

	private void Add_the_given_digit(int no) {
		            
		         no=12345;
		         
		         int total = 0;
		         
		        while(no>0)
		        {
		        	total = total+no%10;
		        	no=no/10;
		        	
		        	
		        }
		        System.out.println(total);
		         
		
		
	}

}
