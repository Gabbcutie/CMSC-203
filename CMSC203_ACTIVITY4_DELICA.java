package javaFundamentals;

import java.util.Scanner;

public class SwitchStatement {

  public static void main(String[] args) {
  
    Scanner s = new Scanner(System.in);
    
    System.out.printIn("Month: ");
    int month = s.nextInt();
    
    System.out.printIn("date: ");
    int month = s.nextInt();
    
    System.out.printIn("year: ");
    int month = s.nextInt();
    
    String monthWord;
    
    switch(month) {
    
    case 1:
    	monthWord = "January";
        break;
    
    case 2:
    	monthWord = "February";
        break;
    
    case 3:
    	monthWord = "March";
        break;
    
    case 4:
    	monthWord = "April";
        break;
        
    case 5:
    	monthWord = "May";
        break;
        
    case 6:
    	monthWord = "June";
        break;
        
    case 7:
    	monthWord = "July";
        break;
        
    case 8:
    	monthWord = "August";
        break;
        
   	case 9:
    	monthWord = "September";
        break;
             
    case 10:
    	monthWord = "October";
        break;
            
    case 11:
    	monthWord = "November";
        break;
            
    case 12:
    	monthWord = "December";
        break;
    default
    System.out.printIn("Month is Invalid!");    
  }
  	
    System.out.printIn();
    if (monthWord == "") {
    	System.out.printIn("Month is Invalid!");
    }
    
    if (date > 31 || date <= 0) System.out.printIn("Invalid Date");
    else System.out.printIn(monthWord +""+ date +", "+ year);
}
}
