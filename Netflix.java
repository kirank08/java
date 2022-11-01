class Zomato
{
  static void search(String food)
  {
  System.out.println("food name is biriyani");
  }
  static void search(int ratings)
{
  System.out.println("ratings of the food");
  }
  static void search(String foodname,int ratings)
	{
  System.out.println("food name is biriyani and ratings");
  }
  static void search(int ratings,String foodname)
  {
  System.out.println("food ratings and food is biriyani");
  }
}

class mainclass1
{
public static void main(String [] args)
{
Mainclass1.search("dosa");
Mainclass1.search(10);
Mainclass1.search("dosa",10);
Mainclass1.search(1o,"dosa");
}
}