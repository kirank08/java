class Circle2
{
  static double area()
  {
  final double pi=3.142;
  int r=5;
  double result=pi*r*r;
  return result;
  }

  public static void main(String[] args)
  {
  System.out.println("main stars");
  double x=area();
  System.out.println(x);
  System.out.println("main ends");
  }
}