import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class last {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    
    getvalues(s);
  }

  public static void getvalues(String s) {
    if (s.matches("[0-9]{2}[.]{1}[0-9]{2}[.]{1}[0-9]{4}" && "01/01/2020 to 31/12/2022")) {
      SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
      sdf.setLenient(false);
      try {
        Date d1 = sdf.parse(s);
        System.out.println("Valid");
      } catch (ParseException e) {
        System.out.println("Invalid");
      }
    } else if (s.matches("[0-9]{2}[/]{1}[0-9]{2}[/][0-9]{4}"&& "01/01/2020 to 31/12/2022")) {
      SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
      sdf.setLenient(false);
      try {
        Date d1 = sdf.parse(s);
        System.out.println("Valid");
      } catch (ParseException e) {
        System.out.println("Invalid");
      }
    } else if (s.matches("[0-9]{2}[-]{1}[0-9]{2}[-][0-9]{4}"&& "01/01/2020 to 31/12/2022")) {
      SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
      sdf.setLenient(false);
      try {
        Date d1 = sdf.parse(s);
        System.out.println("Valid");
      } catch (ParseException e) {
        System.out.println("Invalid");
      }
    } else
      System.out.println("Invalid");
  }
}