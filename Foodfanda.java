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
   F1.order(100);
   F1.order("biriyani");
   F1.order(10,"pizza");
   F1.order("fish",998877);
}
}