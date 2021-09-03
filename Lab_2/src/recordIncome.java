import java.util.Scanner;

public class recordIncome {
    static String incomeDescription;
    static double incomeAmount;

    public static void main(String[] arg){
        Scanner in = new Scanner(System.in);
        incomeDescription = description(in);
        incomeAmount = amount(in);
        continueProgramTwo(in);
    }

    public static String description(Scanner in){
        System.out.println("\n\nAdd an income description");
        String description = in.nextLine();
        //PUSH INCOME DESCRIPTION TO LINKED LIST
        return description;
    }

    public static double amount(Scanner in){
        System.out.println("\nAdd the income amount for: " + incomeDescription);
        double amount = CheckInput.getDouble();
        //PUSH INCOME AMOUNT TO LINKED LIST
        return amount;
    }

    public static void continueProgramTwo(Scanner in){
        System.out.println("\nWould you like to add more income records?");
        boolean continueRun = CheckInput.getYesNo();
        if(continueRun){
            main(null);
        }else{
            lab2.askPrompt(in);
            System.exit(0);
        }
    }
}
