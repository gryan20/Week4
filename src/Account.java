
public class Account {
	static int numAccounts = 0;
	
	Account ()
	{
	numAccounts = numAccounts +1;
	}
	
	public static void main(String[] args) {
		// placed 2 accounts in here for example
		Account obj1 = new Account();
		Account obj2 = new Account();
		
		System.out.println("Number of Accounts: " + getNumAccounts());
	}

	private static int getNumAccounts() {

		return numAccounts;
		
	}
	
	

}
