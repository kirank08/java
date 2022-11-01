class Circle 
{
   static void area(int r)
   {
	   final double pi=3.142;
   double result=pi*r*r;
   System.out.println(result);
   }
   public static void main(String[] args)
   {
   System.out.println("***main starts***");
   area(2);
   System.out.println("***main ends***");
   }
}