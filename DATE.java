/**
 * @(#)DATE.java
 *
 *
 * @author 
 * @version 1.00 2019/9/3
 */

import java.util.Date;
import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;


public class DATE {

    public static void main(String[] args) throws Exception {
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("YOUR DATE OF BIRTH? (FORMAT M-DD-YY)");
    	String input_bday = sc.nextLine();
    	
    	Date date = new Date();
    	SimpleDateFormat format = new SimpleDateFormat("M-dd-yyyy");
    	Calendar calendar = new GregorianCalendar();
    	
    	Date bday = format.parse(input_bday);
    	
    	int year = calendar.get(Calendar.YEAR);
    	calendar.setTime(bday);
    	int byear= calendar.get(Calendar.YEAR);
    	
    	int age = year - byear;
    	System.out.println("AGE: " + age);
    	

    }
    
    
}