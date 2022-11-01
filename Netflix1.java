class Netflix1
{
  static void search(String moviename)
  {
  System.out.println("movie is KGF2");
  }
  static void search(int ratings)
{
  System.out.println("ratings of the movie");
  }
  static void search(String moviename,int ratings)
	{
  System.out.println("movie is KGF2 and ratings");
  }
  static void search(int ratings,String moviename)
  {
  System.out.println("movie ratings and movie is");
  }
}

class Mainclass
{
public static void main(String [] args)
{
Netflix1.search("googly");
Netflix1.search(5);
Netflix1.search("googly",5);
Netflix1.search(5,"googly");
}
}