public class Home6{


public static void main(String[]args){


     Home6 obj = new Home6();
	 
     	 obj.add();  // many times you call method many times , you call many times output also comes many times
     	 obj.add();
     	 obj.add();
     	 obj.add();
	 int result = obj.add();
	 System.out.println(result);
}

  int add()
  
  {
  
  int a = 10;
  int b = 20;
  
  int c = a+b;
  System.out.println("method"+"  "+c);
  return c;
  
}
}