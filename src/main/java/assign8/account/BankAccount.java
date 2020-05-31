package assign8.account;

public class BankAccount {
    private long accountNumber;
    private double interestRate;
    private double balance;
    private String branch;
    private String owner;

    private BankAccount(Builder builder) {
        this.accountNumber = builder.accountNumber;
        this.interestRate = builder.interestRate;
        this.balance = builder.balance;
        this.branch = builder.branch;
        this.owner = builder.owner;

    }
    public static class Builder {

        private long accountNumber; //This is important, so we'll pass it to the constructor.
        private String owner;
        private String branch;
        private double balance;
        private double interestRate;

        public Builder(long accountNumber) {
            this.accountNumber = accountNumber;
        }

        public Builder withOwner(String owner) {
            this.owner = owner;
            return this;  //By returning the builder each time, we can create a fluent interface.
        }

        public Builder atBranch(String branch) {
            this.branch = branch;
            return this;
        }

        public Builder openingBalance(double balance) {
            this.balance = balance;
            return this;
        }

        public Builder atRate(double interestRate) {
            this.interestRate = interestRate;
            return this;
        }

        public BankAccount build() {
            return new BankAccount(this);
        }

    }
}
