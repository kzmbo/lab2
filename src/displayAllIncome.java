import java.util.Scanner;

public class displayAllIncome {
    public static void main(String[] arg){
    	Scanner in = new Scanner( System.in );
    	recordIncome incomeL = new recordIncome();
    	incomeL.incomeList.display(false);
    	linkedList.Node currentI = incomeL.incomeList.head;
    	double totInc = 0;
    	while(currentI != null) {    
            //Calculates total income.  
            totInc = totInc + currentI.money;    
            currentI = currentI.next;    
        }
    	System.out.println("Your total income is: $" + totInc);
    	lab2.askPrompt(in);
    	System.exit(0);
    }
}
