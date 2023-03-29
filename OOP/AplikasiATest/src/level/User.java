package level;

public abstract class User {

	private String username, password, email, phone, firstName, lastName, gender;
	private String DOB;
	private int poin, transactionCount, moneySpent;
	
	public User(String username, String password, String email, String phone, String firstName, String lastName,
			String gender, String dOB, int poin, int transactionCount, int moneySpent) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		this.phone = phone;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		DOB = dOB;
		this.poin = poin;
		this.transactionCount = transactionCount;
		this.moneySpent = moneySpent;
	}

	public abstract void poinConversion();

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String dOB) {
		DOB = dOB;
	}

	public int getPoin() {
		return poin;
	}

	public void setPoin(int poin) {
		this.poin = poin;
	}

	public int getTransactionCount() {
		return transactionCount;
	}

	public void setTransactionCount(int transactionCount) {
		this.transactionCount = transactionCount;
	}

	public int getMoneySpent() {
		return moneySpent;
	}

	public void setMoneySpent(int moneySpent) {
		this.moneySpent = moneySpent;
	}
	
	


	
	
	
}
