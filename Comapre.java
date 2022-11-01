import java.util.Date;   
import java.text.ParseException;   
import java.text.SimpleDateFormat;   
public class Compare
{   
public static void main(String args[]) throws ParseException   
{   
//Creating an object of the SimpleDateFormat class  
SimpleDateFormat sdfo = new SimpleDateFormat("yyyy-MM-dd");   
//dates to be compared   
Date date1 = sdfo.parse("2019-01-01");   
Date date2 = sdfo.parse("2020-01-01");   
// Print the dates   
System.out.println("Date1: " + sdfo.format(date1));   
System.out.println("Date2: " + sdfo.format(date2));   
//Compare the two dates   
if (date1.after(date2))   
{   
//if date1>date2, prints the following statement   
System.out.println("Date1 comes after Date2");   
}  
else if (date1.before(date2))   
{   
//if date1<date2, prints the following statement   
System.out.println("Date1 comes before Date2");   
}   
else if (date1.equals(date2))   
{   
//date1=date2 prints the following statement  
System.out.println("Both dates are equal");   
}   
}   
}  