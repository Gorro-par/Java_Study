package api;

public class AccountEx {
	public static void main(String[] args) {
		Account account = new Account();
		
		account.deposit(1000);
		System.out.println("¿¹±Ý¾×" + account.getBalance());
		
		try {
			account.withdraw(900);
		} catch(Exception e) {
			String message = e.getMessage();
			System.out.println(message);
		}
		
		
	}
}
