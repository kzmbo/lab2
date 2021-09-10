import java.util.Scanner;

public class recordIncome {
    static String incomeDescription;
    static double incomeAmount;
    static linkedList incomeList = new linkedList();
    
    public static void main(String[] arg){
        Scanner in = new Scanner(System.in);
        incomeDescription = description(in);
        incomeAmount = amount(in);
        incomeList.addNode(incomeAmount, incomeDescription);
        continueProgramTwo(in);
    }

    /*
        Asks the user for the description of the income.
        Returns the string that the user gave.
     */
    public static String description(Scanner in){
        System.out.println("\n\nAdd an income description");
        String description = in.nextLine();
        return description;
    }

    /*
        Asks the user for the amount of the income.
        Returns the double that the user gave.
     */
    public static double amount(Scanner in){
        System.out.println("\nAdd the income amount for: " + incomeDescription);
        double amount = Math.round((CheckInput.checkDollaSign()) * 100.0) / 100.0;
        return amount;
    }

    /*
       If the user would like to add more income, description(in) and amount(in) would run again.
       If the user is done inputting the income, the program would return back the lab2.java (the main program).
       and it would show the main menu. Also, this program would close.
    */
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
