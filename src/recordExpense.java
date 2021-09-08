import java.util.Scanner;

public class recordExpense {
    static String expenseDescription;
    static double expenseAmount;
    static linkedList expensesList = new linkedList();
    
    public static void main(String[] arg){
        Scanner in = new Scanner(System.in);
        expenseDescription = description(in);
        expenseAmount = amount(in);
        expensesList.addNode(expenseAmount, expenseDescription);
        continueProgramTwo(in);
    }

    /*
        Asks the user for the description of the expenses.
        Returns the string that the user gave.
     */
    public static String description(Scanner in){
        System.out.println("\n\nAdd a expense description");
        String description = in.nextLine();
        return description;
    }

    /*
       Asks the user for the amount of the expenses.
       Returns the double that the user gave.
    */
    public static double amount(Scanner in){
        System.out.println("\nAdd the expense amount for: " + expenseDescription);
        double amount = Math.round((CheckInput.checkDollaSign()) * 100.0) / 100.0;
        return amount;
    }

    /*
       If the user would like to add more expenses, description(in) and amount(in) would run again.
       If the user is done inputting the expenses, the program would return back the lab2.java (the main program).
       and it would show the main menu. Also, this program would close.
    */
    public static void continueProgramTwo(Scanner in){
        System.out.println("\nWould you like to add more expenses?");
        boolean continueRun = CheckInput.getYesNo();
        if(continueRun){
            main(null);
        }else{
            lab2.askPrompt(in);
            System.exit(0);
        }
    }
}
