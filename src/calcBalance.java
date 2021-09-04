import java.util.Scanner;

public class calcBalance {
    public static void main(String[] arg){
    	Scanner in = new Scanner( System.in );
    	lab2 l2 = new lab2();
    	double finalBal = l2.initBal;
    	recordExpense expenseR = new recordExpense();
    	recordIncome incomeR = new recordIncome();
    	linkedList expenseL = expenseR.expensesList;
    	linkedList incomeL = incomeR.incomeList;
    	linkedList.Node currentE = expenseL.head;
    	linkedList.Node currentI = incomeL.head;
    	while(currentE != null) {    
            //Subtracts expenses from finalBal    
            finalBal = finalBal - currentE.money;    
            currentE = currentE.next;    
        }
    	while(currentI != null) {    
            //Adds income to finalBal    
            finalBal = finalBal + currentI.money;    
            currentI = currentI.next;    
        }
    	System.out.println("$" + finalBal + " is your final balance.");
    	lab2.askPrompt(in);
    	System.exit(0);
            
    }
}
