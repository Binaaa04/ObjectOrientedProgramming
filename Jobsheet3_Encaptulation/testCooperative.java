public class testCooperative {
    public static void main(String[] args) {
        cooperative member1 = new cooperative(111333444, "Donny", 5000000);
        System.out.println("Customer name: " + member1.getName());
        System.out.println("Borrowing limit: " + member1.getBorrowingLimit());

        // System.out.println("\nBorrow 10,000,000...");
        member1.borrowingLimit(10000000);
        System.out.println("Current loan Amount: " + member1.getLoanAmount());

        // System.out.println("\nBorrow 4,000,000...");
        member1.borrowingLimit(4000000);
        System.out.println("Current loan Amount: " + member1.getLoanAmount());

        // System.out.println("\nPaying 1,000,000 installments");
        member1.installments(1000000);
        System.out.println("Current loan Amount: " + member1.getLoanAmount());

        // System.out.println("\nPaying 3,000,000 installments");
        member1.installments(3000000);
        System.out.println("Current loan Amount: " + member1.getLoanAmount());
    }
}
