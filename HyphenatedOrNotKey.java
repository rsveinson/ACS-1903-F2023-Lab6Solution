/**
 * ACS-1903 Lab 6 Q7
 * @author (Enter your name and student number)
 */
import java.util.Scanner;
 
public class HyphenatedOrNotKey{
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        String word, response;
        
        String status;

        // place your code here
        
        do{
            System.out.println("Enter a word.");
            word = kb.next();
            
            status = word.indexOf("-") != -1 ? "hyphenated" : "not hyphenated";
            
            System.out.println(status);
            
            /* could also do it this way*/
            System.out.println(word.indexOf("-") != -1 ? "hyphenated" : "not hyphenated");

            
            // update the do while condition
            System.out.println("Would you like to enter another word? (yes/no)");
            response = kb.next();
        }//end do
        while(response.equals("yes"));
        

        
        System.out.println("Goodbye!");
    }// end main
}
