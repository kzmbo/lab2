import java.util.Scanner;

public class displayAllExpenses {
    public static void main(String[] arg){
    	Scanner in = new Scanner( System.in );
    	recordExpense expenseL = new recordExpense();
    	expenseL.expensesList.display(true);
    	linkedList.Node currentE = expenseL.expensesList.head;
    	double totExp = 0;
    	while(currentE != null) {    
            //Calculates total expenses.  
            totExp = totExp + currentE.money;    
            currentE = currentE.next;    
        }
    	System.out.println("Your total expenses are: $" + totExp);
		System.out.println("Hit Enter to continue...");
		if(in.hasNextLine()) {
			lab2.askPrompt(in);
			System.exit(0);
		}
    	System.exit(0);
    }
}
