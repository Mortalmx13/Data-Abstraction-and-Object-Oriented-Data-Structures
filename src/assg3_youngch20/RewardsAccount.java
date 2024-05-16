package assg3_youngch20;

public class RewardsAccount extends StudentAccount {
double rewards;

/**
 *  general constructor when no input is given
 */
public RewardsAccount() {
	super();
	rewards = 0;
}
/**
 * constructor used when there is an value inputed
 * @param balance
 */
public RewardsAccount(double balance) {
	super(balance);
	if(balance > 100) {
		rewards = rewards + balance*.04;
		
	}
}
/**
 * gets rewards value
 * @return
 */
public double getRewards() {
	return rewards;
}
/**
 * adds the value of rewards with the account balance
 */
public void redeemRewards() {
	if(this.rewards < 20) {
		System.out.println("rewards has to be 20+ ");
	}else {
		this.deposit(rewards);
		rewards = 0;
	}
}
@Override
/**
 * prints acct num and balance and rewards
 */
	public String toString() {
       return  super.toString()+ "\n Rewards balance: " + rewards;
}
@Override
/**
 * deposits an amount into another account
 */
public void deposit(double amount) {
    
    if (amount > 0) {
    	if(amount >100) {
    		rewards = rewards + amount*.04;
    	
    	}
    }
    else {
            System.out.println("Deposit amount must be a positive value.");
    }
}
@Override
/**
 * prints acct num and balance and rewards
 */
public void printInfo() {
	super.printInfo();
    System.out.println( " Rewards balance: " + rewards );
}

}
