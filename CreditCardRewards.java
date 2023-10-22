/**
 * ACS-1903 Lab 6 Q8
 * @author (your name and student number)
 */
import java.util.Scanner;

public class CreditCardRewards{
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the rewards code: ");
        int rewardsCode = kb.nextInt();
        String rewardsType = getRewardsType(rewardsCode);
        System.out.println("Rewards type: " + rewardsType);
    }// end main
    

    
}// end class
