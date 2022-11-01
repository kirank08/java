class Ptym
{
  static void send(int number)
  {
  System.out.println("send money by mobile number");
  }
  static void send(String anand)
{
  System.out.println("name of contact number");
  }
  static void send(String anand,int number)
	{
  System.out.println("name of contact number");
  }
  static void send(int number,String anand)
  {
  System.out.println("String name is anand and int is mobile number");
  }
}

class Mainclass3
{
public static void main(String [] args)
{
Ptym.send(99887);
Ptym.send("anand");
Pytm.send(99877,"anand");
Pytm.send("anand",99877);
}
}