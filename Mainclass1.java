class Ola
{
  static void search(String ride)
  {
  System.out.println("vehicle name is innovva");
  }
  static void search(int ratings)
{
  System.out.println("ratings of the ride");
  }
  static void search(String ride,int ratings)
	{
  System.out.println("vehicle name is innovva and ratings");
  }
  static void search(int ratings,String ride)
  {
  System.out.println("ride ratings and vehicle is innovva");
  }
}

class Mainclass2
{
public static void main(String [] args)
{
Ola.search("auto");
Ola.search(1);
Ola.search("auto",1);
Ola.search(1,"auto");
}
}