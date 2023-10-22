/**
 * ACS-1903 Lab 6 Q8
 * @author (your name and student number)
 */
import java.util.Scanner;

public class CreditCardRewardsKey{
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the rewards code: ");
        int rewardsCode = kb.nextInt();
        String rewardsType = getRewardsType(rewardsCode);
        System.out.println("Rewards type: " + rewardsType);
    }
    
    public static String getRewardsType(int code){
        String type;
        switch(code){
            case 0:
            case 1: type = "Points"; 
                    break;
            case 2: type = "Travel miles"; 
                    break;
            case 3: type = "Cash back"; 
                    break;
            default: type = "invalid entry"; 
        }
        return type;
    }
    
}
