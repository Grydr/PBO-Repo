public class TicketMachine {
    // The price of a ticket from this machine.
    private int price;
    // The amount of money entered by a customer so far.
    private int balance;
    // The total amount of money collected by this machine.
    private int total;

    public TicketMachine(int cost) {
        if (cost >= 0) {
            price = cost;
        } else {
            System.err.println("Price must not be less than 0");
        }
        balance = 0;
        total = 0;
    }

    public void printTicket() {
        System.out.println("##################");
        System.out.println("# The BlueJ Line");
        System.out.println("# Ticket");
        System.out.println("# " + price + " cents.");
        System.out.println("##################");
        System.out.println("");
        
        System.out.println("Balance before: " + balance);
        if (price > balance) {
            System.err.println("Not enough balance");
        } else {
            total += balance - price;
            balance -= price;
            System.out.println("Balance now: " + balance);
        }
    }

    public int getBalance() {
        return balance;
    }

    public int getPrice() {
        return price;
    }
    
    public int getTotal() {
        return total;
    }

    public void insertMoney(int money) {
        if (money >= 0) {
            balance += money;
        } else {
            System.err.println("Amount must not be less than 0");
        }
    }
}