package level;

public class Level {

	private String username;
	private String password;
	private String email;
	private String phone;
	private String fName;
	private String lName;
	private String gender;
	private String dob;
	
	public Level(String username, String password, String email, String phone, String fName, String lName,
			String gender, String dob) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		this.phone = phone;
		this.fName = fName;
		this.lName = lName;
		this.gender = gender;
		this.dob = dob;
	}
	
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
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	
}
