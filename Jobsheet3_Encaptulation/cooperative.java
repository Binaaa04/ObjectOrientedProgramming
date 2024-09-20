import java.util.Scanner;

/**
 * cooperative
 */
public class cooperative {
    private String name;
    private int IDCardNumber;
    private double borrowingLimit;
    private double loanAmount;
    Scanner inputUser = new Scanner(System.in);

    public cooperative(int IDCardNumber, String name, double borrowingLimit) {
        this.name = name;
        this.IDCardNumber = IDCardNumber;
        this.borrowingLimit = borrowingLimit;
        this.loanAmount = 0;
    }

    public String getName() {
        return name;
    }

    public int IDCardNumber() {
        return IDCardNumber;
    }

    public double getBorrowingLimit() {
        return borrowingLimit;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void borrowingLimit(double amount) {
        System.out.print("how much money do you want to borrow : ");
        amount = inputUser.nextDouble();
        if ((loanAmount + amount) > borrowingLimit) {
            System.out.println("Sorry, the loan amount exceeds the limit");
        } else {
            loanAmount += amount;
            System.out.println("Current load amount : " + loanAmount);
        }
    }

    public void installments(double amount) {
        System.out.print("how much money do you want to pay in installments : ");
        amount = inputUser.nextDouble();
        double minimumInstallment = loanAmount * 0.1;
        if (amount < minimumInstallment) {
            System.out.println("Sorry, the minimum installment should  10 percent from loan amount");
        } else {
            if (loanAmount - amount < 0) {
                loanAmount = 0;
            } else {
                loanAmount -= amount;
            }
        }
    }
}
