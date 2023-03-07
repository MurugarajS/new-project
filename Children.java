public class  Children extends Parents{




public static void main(String[]args){

	
	
	
	       Children ch = new Children();       //dynamic binding        //late binding
	                                                //  acess over ridden
	     ch.study();
	  //   ch.play();
	     ch.hardwork();
	     ch.motivate();
	     
	
	
}

       
	public final void study()
{



System.out.println("java");


}
	


    	public void play()
		{



System.out.println("cricket");


}
	






}