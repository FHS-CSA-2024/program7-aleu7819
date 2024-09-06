//import stuff here

//Your code here
import java.util.Scanner;

public class Program5 {
    public static void main (String[] args) {
        
         Scanner numScanner = new Scanner(System.in);
         
         System.out.println("how many shrutebucks?");
         double Shrutebucks = numScanner.nextInt();
         
          System.out.println("how many klevens?");
        double Klevens = numScanner.nextInt();
                
         System.out.println("how many stanley nickels?");
         double StanNickels = numScanner.nextInt();
         
         double newStanNickel = Klevens/20.0 + StanNickels/240.0 +Shrutebucks;
         
        
         System.out.println("new monetary system: " + newStanNickel);

 
        
}}



//Paste console output below:
/*

how many shrutebucks?
7
how many klevens?
17
how many stanley nickels?
9
new monetary system: 7.8875

*/
