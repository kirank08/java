import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  String s1 = sc.nextLine();

  int n = getvalues(s1);
  
 if(n==1);


  {
	  if(start date=01/01/2020 to 31/12/2022);
    System.out.println("Valid date format");
	
	  

  }
  else
	  {
    System.out.println("Invalid date format array out of range");
  }
  
}
public static int getvalues(String s1) {
if(s1.matches("[0-9]{2}[/]{1}[0-9]{2}[/]{1}[0-9]{4}"))
{
SimpleDateFormat sdf=new SimpleDateFormat("01/01/2020 to 31/12/2022");
sdf.setLenient(false);
try {
Date d1=sdf.parse(s1);
return 1;
} catch (ParseException e) {
return -1;
}
}
else
  return -1;
}}