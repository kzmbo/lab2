public class displaySummary {
    public static void main(String[] args){
        lab2 l2 = new lab2();
        double finalBal = l2.initBal;
        recordExpense expenseR = new recordExpense();
        recordIncome incomeR = new recordIncome();
        linkedList expenseL = expenseR.expensesList;
        linkedList incomeL = incomeR.incomeList;
        linkedList.Node currentE = expenseL.head;
        linkedList.Node currentI = incomeL.head;
        double totInc = displayAllIncome.totInc;
        double totExp = displayAllExpenses.totExp;

        System.out.println("\n\n-----------------------------------------------------------------------------");
        System.out.println("Summary");
        System.out.println("Initial Balance: $" + lab2.initBal);

        while(currentI != null) {
            //Subtracts expenses from finalBal
            //totInc = totInc + currentI.money;
            finalBal = finalBal + currentI.money;
            currentI = currentI.next;

        }
        System.out.println("Total income: $" + totInc);

        while(currentE != null) {
            //Calculates total expenses.
            //totExp = totExp + currentE.money;
            finalBal = finalBal - currentE.money;
            currentE = currentE.next;
        }
        System.out.println("Total expenses: $" + totExp);

        System.out.println("Final Balance: $" + finalBal);
        System.out.println("-----------------------------------------------------------------------------\n");
        System.out.println("Good Bye!");
    }
}
