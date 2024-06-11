public class BankCustomer {
    private int acno;       // Account Number
    private String atype;   // Account Type
    private double amt;     // Amount

    // Default constructor
    public BankCustomer() {
        this.acno = 0;
        this.atype = "Default";
        this.amt = 0.0;
    }

    // Constructor with account number
    public BankCustomer(int acno) {
        this.acno = acno;
        this.atype = "Default";
        this.amt = 0.0;
    }

    // Constructor with account number and account type
    public BankCustomer(int acno, String atype) {
        this.acno = acno;
        this.atype = atype;
        this.amt = 0.0;
    }

    // Constructor with account number, account type, and amount
    public BankCustomer(int acno, String atype, double amt) {
        this.acno = acno;
        this.atype = atype;
        this.amt = amt;
    }

    // Getter and Setter methods
    public int getAcno() {
        return acno;
    }

    public void setAcno(int acno) {
        this.acno = acno;
    }

    public String getAtype() {
        return atype;
    }

    public void setAtype(String atype) {
        this.atype = atype;
    }

    public double getAmt() {
        return amt;
    }

    public void setAmt(double amt) {
        this.amt = amt;
    }

    @Override
    public String toString() {
        return "BankCustomer{" +
                "acno=" + acno +
                ", atype='" + atype + '\'' +
                ", amt=" + amt +
                '}';
    }

    public static void main(String[] args) {
        // Testing the constructors
        BankCustomer customer1 = new BankCustomer();
        BankCustomer customer2 = new BankCustomer(12345);
        BankCustomer customer3 = new BankCustomer(12345, "Checking");
        BankCustomer customer4 = new BankCustomer(12345, "Checking", 5000.00);

        // Displaying the customer details
        System.out.println(customer1);
        System.out.println(customer2);
        System.out.println(customer3);
        System.out.println(customer4);
    }
}
