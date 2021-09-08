import java.util.Scanner;

public class displayAllExpenses {
	static double totExp;
    public static void main(String[] arg){
    	Scanner in = new Scanner( System.in );
    	recordExpense expenseL = new recordExpense();
    	expenseL.expensesList.display(true);
    	linkedList.Node currentE = expenseL.expensesList.head;
    	totExp = 0;
    	while(currentE != null) {    
            //Calculates total expenses.  
            totExp = totExp + currentE.money;    
            currentE = currentE.next;    
        }
		System.out.println("-----------------------------------------------------------------------------");
		totExp = Math.round(totExp*100.0)/100.0;
    	System.out.println("Your total expenses are: $" + totExp);
		System.out.println("Hit Enter to continue...");
		System.out.println("-----------------------------------------------------------------------------");
		if(in.hasNextLine()) {
			lab2.askPrompt(in);
			System.exit(0);
		}
    }
}
