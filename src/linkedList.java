/* References: https://www.javatpoint.com/java-program-to-create-and-display-a-singly-linked-list
 * 
 */

public class linkedList {    
    
	/*Node of the Singly Linked List which contains both a variable for expense/income and a variable for
	 *the description.
	 */
    
	class Node{    
        double money;
        //Can be expense/income.
        String desc;
        //Description of the expense/income.
        Node next;
        //Where the node points to. [A] -> [B] -> [C] etc...
            
        public Node(double money, String desc) {    
            this.money = money;
            this.desc = desc;
            this.next = null;    
        }    
    }    
     
    //Head   
    public Node head = null;    
    //Tail
    public Node tail = null;    
        
    //addNode() will add a new node to the list    
    public void addNode(double money, String desc) {    
        //Create a new node    
        Node newNode = new Node(money, desc);    
            
        //Checks if the list is empty    
        if(head == null) {    
            //If list is empty, both head and tail will point to new node    
            head = newNode;    
            tail = newNode;    
        }    
        else {    
            //newNode will be added after tail such that tail's next will point to newNode    
            tail.next = newNode;    
            //newNode will become new tail of the list    
            tail = newNode;    
        }    
    }    
        
    //display() will display all the nodes present in the list    
    public void display(boolean eoi) {    
        //Boolean eoi - expensesOrIncome. If True, expenses desc. If False, income desc.
    	
    	//Node current will point to head    
        Node current = head;    
            
        if(head == null) {    
            if(eoi) {
            	System.out.println("No expenses recorded.");
            }else {
            	System.out.println("No income has been recorded.");	
            }    
            return;    
        }    
        if(eoi) {
        	System.out.println("Here are your recorded expenses: ");
        }else {
        	System.out.println("Here is your recorded income: ");	
        }    
        while(current != null) {    
            //Prints each node by incrementing pointer    
            System.out.println("$" + current.money + " " + current.desc + " ");    
            current = current.next;    
        }    
        System.out.println();    
    }    
        
    /*
     * Run tests/experiment here.
     */
    
    public static void main(String[] args) {    
            
        //linkedList sList = new linkedList();    
            
        //Add nodes to the list    
        //sList.addNode(1, "Hello");    
        
            
        //Displays the nodes present in the list    
        //sList.display();    
    }    
} 