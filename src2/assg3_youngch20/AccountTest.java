package assg3_youngch20;
//Charles Young YOUNGCH20
public class AccountTest {
 
	public static void main(String[] args) {
        
		
        Account account1 = new Account("123");
        System.out.println("Information of Account 1");
        account1.displayInfo();

        System.out.println();
        account1.deposit(190);
        System.out.println("Account1 after depositing");
        account1.displayInfo();

        
        Account account2 = new Account("321", 1500);
        System.out.println("Account2");
        System.out.println(account2.toString());

        System.out.println();
        Account account3 = new Account("150", 1500);
        
        System.out.println("Account3");
        System.out.println(account3.toString());
        System.out.println();
      
        if (account1.equals(account2)) {
                System.out.println("Account1 and Account2 are equal.");
        } else {
                System.out.println("Account1 and Account2 are not equal.");
        }

        
        if (account1.equals(account3)) {
                System.out.println("Account1 and Account3 are equal.");
        } 
        else {
                System.out.println("Account1 and Account3 are not equal.");
        }

        System.out.println();
        
        CheckingAccount checkingAccount1 = new CheckingAccount("C1");
        System.out.println("Information of Checking Account1");
        checkingAccount1.displayInfo();

        System.out.println();
        checkingAccount1.deposit(100);
        System.out.println("Information of Checking Account1 after deposting 100");
        checkingAccount1.displayInfo();
        System.out.println();
        
        
    checkingAccount1.withdraw(300);
    
    checkingAccount1.displayInfo();

        System.out.println();
        CheckingAccount checkingAccount2 = new CheckingAccount("C2", 2500, 1000);
        System.out.println("Information of Checking Account2");
        checkingAccount2.displayInfo();

        System.out.println();
        CheckingAccount.setFee(5);

        System.out.println();
        checkingAccount2.withdraw(1500);
        System.out.println("Information of Checking Account2 after withdrawing 1500");
        
                checkingAccount2.displayInfo();
        

        System.out.println();
        
        System.out.println("Information of Checking Account2 after withdrawing 2500");
        checkingAccount2.withdraw(2500);
        checkingAccount2.displayInfo();

        System.out.println();
        if (checkingAccount1.equals(checkingAccount2)) {
               
        	System.out.println("CheckingAccount1 and CheckingAccount2 are equal.");
        }
        else {
                
        	System.out.println("CheckingAccount1 and CheckingAccount2 are not equal.");
        }
        System.out.println();
        checkingAccount1.deposit(1000);
      
        checkingAccount1.transfer(checkingAccount2, 200);
        System.out.println(checkingAccount1.toString());
        System.out.println();
        System.out.println(checkingAccount2.toString());
        System.out.println();
        
       
        SavingsAccount savingsAccount1 = new SavingsAccount("S1");
        System.out.println("Information of Saving Account1");
        savingsAccount1.displayInfo();

       
        savingsAccount1.deposit(100);
        System.out.println();
        System.out.println("Information of saving Account1 after deposting 100");
        savingsAccount1.displayInfo();

       
        savingsAccount1.withdraw(300);
        
        System.out.println("Information of saving Account1 after withdrawing 300");
        savingsAccount1.displayInfo();

       
        SavingsAccount savingsAccount2 = new SavingsAccount("S2", 2000, 0.2);
        System.out.println("Information of Saving Account2");
        savingsAccount2.displayInfo();
        savingsAccount2.addInterest();
        System.out.println();
        System.out.println("Information of saving Account2 after adding interest of 20%");
        System.out.println();
        savingsAccount2.displayInfo();

     
        System.out.println("Actual Account details \n" + checkingAccount1.toString());
        System.out.println(savingsAccount1.toString());
        
        checkingAccount1.transfer(savingsAccount1, 500);
        System.out.println(checkingAccount1.toString());
        System.out.println(savingsAccount1.toString());
        
        
        
        
        

        System.out.println("\n --Test tansfer from saving to checking--");
        
        savingsAccount1.transfer(checkingAccount1, 500);
        System.out.println(checkingAccount1.toString());
        System.out.println(savingsAccount1.toString());
}
}
	

