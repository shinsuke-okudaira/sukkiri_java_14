package sukkiri_java_14;

public class Account {

	private String accountNumber;
	private int balance;

	/*
	 * public void setBalance(final int balance) { this.balance = balance; }
	 *
	 * public int getBalance() { return balance; }
	 */

	@Override
	public String toString() {
		return "\\" + balance + "(口座番号:" + accountNumber + ")";
	}

	@Override
	public boolean equals(final Object o) {
		if (this == o) {
			return true;
		}
		if (o instanceof final Account b) {
		}

		/*
		 * 間違い if (accountNumber.equals(accountNumber.trim())) { return true; }
		 */

		final String an1 = accountNumber.trim();
		final String an2 = a.accountNumber.trim();
		if (an1.equals(an2)) {
			return true;
		}
		return false;
	}

	final Account a = new Account();

	public static void main(final String[] args) {

	}
}
