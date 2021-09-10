public class displaySummary {
    public static void main(String[] args){
        System.out.println("Summary");
        System.out.println("Initial Balance: $" + lab2.initBal);

        while(currentI != null) {
            //Subtracts expenses from finalBal
            finalBal = finalBal + currentI.money;
            currentI = currentI.next;

        }
        System.out.println("Total income: $" + totInc);

        while(currentE != null) {
            //Calculates total expenses
            finalBal = finalBal - currentE.money;
            currentE = currentE.next;
        }
        System.out.println("Total expenses: $" + totExp);

        System.out.println("Final Balance: $" + finalBal);
        System.out.println("-----------------------------------------------------------------------------\n");
        System.out.println("Initial Balance: " + initBal);
        System.out.println("Total incomes: " + totInc);
        System.out.println("Total expence: " + totExp);
        System.out.println("Final balance: " + finalBal);
        System.out.println("Good Bye!");

    }
}
