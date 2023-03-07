class Factory{
static String name = "vivek";
static int address = 10;

String brand1;
int price1;
String exp_date;


public static void main(String[]args)
{
Factory milk = new Factory();
Factory curd = new Factory();
Factory butter = new Factory();

milk.brand1 = "aavin";
milk.price1 = 25;
milk.exp_date = "25.11.22";

curd.brand1 = "vijay";
curd.price1 = 10;
curd.exp_date = "26.11.22";

  

butter.brand1 = "kavin";
butter.price1 = 45;

System.out.println(milk.brand1);
System.out.println(milk.price1);
System.out.println(curd.brand1);
System.out.println(curd.price1);
System.out.println(butter.brand1);
System.out.println(butter.price1);
System.out.println(milk.exp_date);
System.out.println(curd.exp_date);






}



}