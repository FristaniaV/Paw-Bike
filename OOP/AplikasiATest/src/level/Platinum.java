package level;

public class Platinum extends User{

	public Platinum(String username, String password, String email, String phone, String firstName, String lastName,
			String gender, String dOB, int poin, int jumlahTransaksi, int totalJumlahTransaksi) {
		super(username, password, email, phone, firstName, lastName, gender, dOB, poin, jumlahTransaksi, totalJumlahTransaksi);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void poinConversion() {
		setPoin((getMoneySpent()/10000)*3);
		
	}

}
