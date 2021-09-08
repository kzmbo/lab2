import java.util.Scanner;

public class displayAllIncome {
	static double totInc;
    public static void main(String[] arg){
    	Scanner in = new Scanner( System.in );
    	recordIncome incomeL = new recordIncome();
    	incomeL.incomeList.display(false);
    	linkedList.Node currentI = incomeL.incomeList.head;
    	totInc = 0;
    	while(currentI != null) {    
            //Calculates total income.  
            totInc = totInc + currentI.money;    
            currentI = currentI.next;    
        }
		System.out.println("-----------------------------------------------------------------------------");
		totInc = Math.round(totInc*100.0)/100.0;
    	System.out.println("Your total income is: $" + totInc);
		System.out.println("Hit Enter to continue...");
		System.out.println("-----------------------------------------------------------------------------");
		if(in.hasNextLine()) {
			lab2.askPrompt(in);
			System.exit(0);
		}
    }

    public static double returnCurrentIncome(double input){
    	return input;
	}
}
