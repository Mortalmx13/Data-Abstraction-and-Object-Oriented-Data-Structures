package assg3_youngch20;
//Charles Young YOUNGCH20
public class CheckingAccount extends Account{
	private double overdraft;
	private static double fee;

	       
	public CheckingAccount(String acctNo) {
		super(acctNo);
	    this.overdraft = 0;
		}

	 //constructor acctNo, balance, overdraft       
	public CheckingAccount(String acctNo, double balance, double overdraft) {
		super(acctNo, balance);
	    this.overdraft = overdraft;
	        }

	 //gets overdraft       
	public double getOverdraft() {
	       return overdraft;
	        }

	 //sets overdraft       
	public void setOverdraft(double overdraft) {
	        this.overdraft = overdraft;
	        }
	//gets fee
	public static double getFee() {
	                return fee;
	        }

	//sets fee        
	public static void setFee(double fee) {
	        CheckingAccount.fee = fee;
	        }

	        
	@Override
	public String toString() {
	        return super.toString() + "\n Overdraft amount: " + overdraft;
	        }

	        
	@Override
	public void withdraw(double amount) {
	       
	       if (amount > 0) {
	                        
	       if (getBalance() >= amount) {
	             super.withdraw(amount);
	             }
	                       
	       else if (getBalance() + this.overdraft - fee - amount >= 0) {
	            	 setBalance(getBalance() - (amount + fee));   
	                 } 
	       else {
	                System.out.println("Not enough in the account");        
	       }} 
	       else {
	                System.out.print(amount + " should be positive value");        
	                }
	        }
	//transfer
public void transfer(Account accttran, double amount) {
	if (amount<0) {
		System.out.println("Incorect amount");
	}
	else if(amount>getBalance()) {
		//checks if there is enough money in the balance
		if(overdraft>amount-this.getBalance()-fee) {
			System.out.println("Not enough in account to transfer");
		}
		else {
			 setBalance(getBalance()-amount-fee);
	          accttran.setBalance(amount+ accttran.getBalance());
		}
	}
	else {
		setBalance(getBalance()-amount);
         accttran.setBalance(amount+ accttran.getBalance());
	}
	
}

	  // displays the checking account 
	  @Override
	  public void displayInfo() {
	                System.out.println(this.toString());
	        }

	}
	
	
	

