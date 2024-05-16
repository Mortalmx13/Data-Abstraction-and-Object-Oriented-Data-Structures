package assg3_youngch20;

public class StudentAccountDemo {

	public static void main(String[] args) {
		StudentAccount c1 = new StudentAccount();
		StudentAccount c2 = new StudentAccount(54);
		StudentAccount c3 = new StudentAccount(345);
		
		System.out.println(	c1.getAcctNo());
		System.out.println( c2.getBalance());
		System.out.println(c3.getCounter());
		
		c2.setBalance(32);
		System.out.println();
		c3.deposit(100);
		c3.deposit(-3);
		
		System.out.println();
		c2.charge(5);
		c3.charge(-6);
		System.out.println();
		c2.transfer(c3, 4);
		c2.transfer(c3, 45);
		c2.transfer(c3, -5);
		System.out.println();
		
		c3.printInfo();
		System.out.println();
		System.out.println(c2.toString());
		
		System.out.println();
		System.out.println(c3.compareTo(c1));
		c1.setBalance(500);
		System.out.println(c3.compareTo(c1));
		
		System.out.println();
		RewardsAccount z1 = new RewardsAccount();
		RewardsAccount z2 = new RewardsAccount(56);
		RewardsAccount z3 = new RewardsAccount(5000);
		System.out.println("RewardAccounts:");
		System.out.println(z3.getRewards());
		
		System.out.println(z2.getBalance());
		z2.redeemRewards();
		System.out.println(z2.getBalance());
		
		z3.redeemRewards();
		System.out.println(z3.getBalance());
		
		System.out.println();
		System.out.println(z3.toString());
		z3.deposit(46);
		z3.deposit(400);
		
		z3.printInfo();
		
		
	}

}
