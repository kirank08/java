class Foodfanda
{
   static void order(int qty)
   {
   System.out.println("oreder food by qty");
   }
   static void order(String food)
   {
   System.out.println("order food by name");
   }
   static void order(int qty,String food)
   {
   System.out.println("order food by qty,order food by name");
   }
   static void order(String food,int qty)
   {
   System.out.println("order food by name and order food by qty");
   }
}

class Mainclass4
{
public static void main(String[] args)
{
   Food.order(100);
   Food.order("biriyani");
   Food.order(10,"pizza");
   Food.order("fish",998877);
}
}