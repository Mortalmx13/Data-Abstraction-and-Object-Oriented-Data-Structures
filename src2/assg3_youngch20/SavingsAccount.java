package assg3_youngch20;
//Charles Young YOUNGCH20
public class SavingsAccount extends Account {
        
        private double interestRate;

       
        public SavingsAccount(String acctNo) {
        // call to super
        super(acctNo);
        this.interestRate = 0;
        }

        
        public SavingsAccount(String acctNo, double balance, double interestRate) {
        // call to super
        super(acctNo, balance);
        this.interestRate = interestRate;
        }

        //gets interest rate
        public double getInterestRate() {
                return interestRate;
        }

        //sets interestRate
        public void setInterestRate(double interestRate) {
                this.interestRate = interestRate;
        }

        //add interest to balance
        public void addInterest() {
                super.setBalance((1 + interestRate) * getBalance());
        }

        
        @Override
        public String toString() {
                return super.toString() + "\n Interest Rate: " + interestRate;
        }

        
         // display the savings account 
         
        @Override
        public void displayInfo() {
                System.out.println(this.toString());
        }
}
	
