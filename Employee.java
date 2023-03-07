public  class Employee extends Panindia implements Rules,Rules2{
	
	
public static void main(String[]args){	
	
	
	
	                                      Employee obj = new Employee();
	                                    //  Rules obj = new Employee();
	                                       obj.comeontime();
	                                       obj.breaktime();
	                                       obj.salary();
	                                       obj.hardwork();
	                                       obj.minsalary();
	                                    
	                                                      //   Employee.leave = 20;
	                                        System.out.println( Employee.minimum_salary);
	                                        System.out.println( Employee.leave);
	
	
	
}
	
	
	public void comeontime()
	{
	System.out.println("9.00 am");	
	}
	
	
	public void breaktime()
	{
	System.out.println("chating");	
	}
	
	
	public void salary()
	{
	System.out.println("13000");	
	}
	

	
	public void hardwork()
	{
	System.out.println("hardwork never fail");	
	}
	
}