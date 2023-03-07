public class Home7{


public static void main(String[]args){


     Home7 obj = new Home7();
	 
     	 obj.add();  // many times you call method many times , you call many times output also comes many times
     	 obj.add();
     	 obj.add();
     	 obj.add();
	 int result = obj.add();
	 System.out.println(result);
}

  int add()
  
  {
  
 
  
  System.out.println(10);
  return 5;
  
}
}