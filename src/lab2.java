import java.util.Scanner;

public class lab2 {
    static double initBal;
    static double currentBal;

    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        initBal = initProgram(in); //starting balance
        askPrompt(in);
    }

    public static double initProgram(Scanner in) {
        System.out.println("\n\nWelcome to your Expense Recorder.");
        System.out.println("Please enter your starting balance:");
        double initBal = Math.round(CheckInput.getDouble()*100.0)/100.0;
        return initBal;
    }

    public static int askPrompt(Scanner in){
        System.out.println("\n\nWelcome to your Expense Recorder.");
        System.out.println("Which task would you like to perform?");
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("0. (EXITS PROGRAM) Summary of balance, total incomes, and total expenses.");
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("1. Enter my Expenses.");
        System.out.println("2. Enter my Income.");
        System.out.println("3. Calculate my current balance.");
        System.out.println("4. Display all records of expenses.");
        System.out.println("5. Display all records of income.");
        System.out.println("-----------------------------------------------------------------------------\n");
        int choice = CheckInput.getPositiveInt();
        choices(choice, in);
        return choice;
    }

    public static void choices(int choice, Scanner in){
        boolean run = true;
        while(run){
            switch (choice){
            case 0:
                //displaySummary.main(null); INCOMPLETE
                run = false;
                break;
            case 1:
                recordExpense.main(null);
                break;
            case 2:
                recordIncome.main(null);
                break;
            case 3:
                calcBalance.main(null);
                break;
            case 4:
                displayAllExpenses.main(null);
                break;
            case 5:
                displayAllIncome.main(null);
                break;
            default:
                System.out.println("Invalid Input.");
                System.out.println("Try again\n\n");
                askPrompt(in);
                break;
            }
        }
    }
}

