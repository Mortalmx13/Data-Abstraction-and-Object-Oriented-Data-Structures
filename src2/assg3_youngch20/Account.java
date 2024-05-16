package assg3_youngch20;
//Charles Young YOUNGCH20
public class Account {

	
    private String acctNo;
    private double balance;

    
    public Account(String acctNo) {
            this.acctNo = acctNo;
            this.balance = 0;
    }

    
    public Account(String acctNo, double balance) {
    	
            this.acctNo = acctNo;
         
            if (balance > 0)
                    this.balance = balance;
            else
                    this.balance = 0;
    }

    //gets account number
    public String getAcctNo() {
            return acctNo;
    }

    //gets balance
    public double getBalance() {
            return balance;
    }

    //sets the balance
    public void setBalance(double balance) {
            this.balance = balance;
    }

    //deposit method
    public void deposit(double amount) {
            
            if (amount > 0) {
                    this.balance += amount;
            }
            else {
                    System.out.println("Deposit amount must be a positive value.");
            }
    }

    
    //withdraw method 
    public void withdraw(double amount) {
            
            if (amount > 0) {
         
                    if (this.balance - amount >= 0) {
                            this.balance -= amount;
                         
                    }
                    else {
                            System.out.println("There is not enough in the account");
                            
                    }
            } 
            else {
                    System.out.print(amount + " Should be positive value");
                  
            }
    }

    //transfer method
    public void transfer(Account accttran, double amount) {
           
            if(amount < 0) {
            	System.out.println("Enter a valid number");
            }
            else if(amount > getBalance()) {
            	System.out.println("Not enough in account to transfer");
            }
            else {
          this.balance = this.balance - amount;
          accttran.setBalance(amount+ accttran.getBalance());
          
            }
    }

    
    public void displayInfo() {
            System.out.println(toString());
    }

    
    @Override
    public String toString() {
            return "Account number: " + acctNo + "\n Current balance: " + balance;
    }

    
    @Override
    public boolean equals(Object obj) {
            if (this == obj)
                    return true;
            if (obj == null)
                    return false;
            if (getClass() != obj.getClass())
                    return false;
            Account acct2 = (Account) obj;
            if (acctNo == null) {
                    if (acct2.acctNo != null)
                            return false;
            } 
            else if (!acctNo.equals(acct2.acctNo))
                    return false;
            return true;
    }
    
}

	
	
	

