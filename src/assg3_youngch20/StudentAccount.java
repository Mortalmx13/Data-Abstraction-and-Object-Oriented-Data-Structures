package assg3_youngch20;
//charles youg
public class StudentAccount implements Comparable<StudentAccount>  {

	
	private long acctNo;
	private double balance;
	private static long count;
	/**
	 * general constructor when no input is given
	 */
	public StudentAccount() {
		count++;
		this.balance = 0;
		this.acctNo = count;
		
	}
	/**
	 * constructor used when there is an value inputed
	 * @param newbal
	 */
	public StudentAccount(double newbal) {
		count++;
		this.balance = newbal;
		this.acctNo = count;
	}
	/**
	 * gets account number
	 * @return
	 */
	public double getAcctNo() {
		return acctNo;
	}
	/**
	 * gets account balance
	 * @return
	 */
	public double getBalance() {
		return balance;
	}
	/**
	 * gets account counter
	 * @return
	 */
	public static long getCounter() {
		return count;
	}
	/**
	 * sets balance
	 * @param newBalance
	 */
	public void setBalance(double newBalance) {
		balance = newBalance;
		
	}
	/**
	 * deposits amount into an account
	 * @param amount
	 */
	public void deposit(double amount) {
        
        if (amount > 0) {
                this.balance += amount;
        }
        else {
                System.out.println("Deposit amount must be a positive value.");
        }
}
	/**
	 * takes money away from an account
	 * @param amount
	 */
	public void charge(double amount) {
		if (amount > 0) {
            this.balance -= amount;
    }
    else {
            System.out.println("Charge amount must be a positive value.");
    }
		
		
	}
	/**
	 * takes amount from one account to another
	 * @param acct
	 * @param amount
	 */
	public void transfer(StudentAccount acct, double amount) {
        
        if(amount < 0) {
        	System.out.println("Enter a valid number");
        }
        else if(amount > getBalance()) {
        	System.out.println("Not enough in account to transfer");
        }
        else {
      this.balance = this.balance - amount;
      acct.setBalance(amount+ acct.getBalance());
      
        }
}
	/**
	 * prints acct num and balance
	 */
	 public void printInfo() {
         System.out.println("Account number:  "+ acctNo +"\n" + "Current balance: " + balance );
 }
	 @Override
	 /**
	  * prints acct num and balance
	  */
	public String toString() {
        return "Account number: " + acctNo + "\n Current balance: " + balance;
}
	@Override
	/**
	 * checks if two different accounts have the same balance or not
	 */
	public int compareTo(StudentAccount o) {
		if(this.balance < o.balance) {
			return -1;
		}else if (this.balance > o.balance) {
			return 1;
		}else {
			return 0;
		}
		
	}
	
}
