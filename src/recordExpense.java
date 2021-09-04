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

    public static String description(Scanner in){
        System.out.println("\n\nAdd a expense description");
        String description = in.nextLine();
        //PUSH EXPENSE DESCRIPTION TO LINKED LIST
        return description;
    }

    public static double amount(Scanner in){
        //System.out.println("running expenseAmount");
        System.out.println("\nAdd the expense amount for: " + expenseDescription);
        double amount = Math.round(CheckInput.getDouble()*100.0)/100.0;
        //PUSH EXPENSE AMOUNT TO LINKED LIST
        return amount;
    }

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
