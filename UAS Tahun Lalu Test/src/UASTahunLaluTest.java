import java.util.ArrayList;
import java.util.Scanner;

public class UASTahunLaluTest {

	Scanner scan = new Scanner(System.in);

	int jumlahSiswa, score;
	double total, rata, modus;

	ArrayList<Integer> score1 = new ArrayList<Integer>();
	ArrayList<Integer> score2 = new ArrayList<Integer>();
	ArrayList<Integer> score3 = new ArrayList<Integer>();
	ArrayList<Integer> score4 = new ArrayList<Integer>();
	ArrayList<Integer> score5 = new ArrayList<Integer>();
	ArrayList<Integer> score6 = new ArrayList<Integer>();
	ArrayList<Integer> score7 = new ArrayList<Integer>();
	ArrayList<Integer> score8 = new ArrayList<Integer>();
	ArrayList<Integer> score9 = new ArrayList<Integer>();
	ArrayList<Integer> score10 = new ArrayList<Integer>();

	public UASTahunLaluTest() {

		do {
			System.out.print("Masukkan jumlah siswa [min 10]: ");
			jumlahSiswa = scan.nextInt();
			scan.nextLine();
		} while (jumlahSiswa < 10);

		for (int i = 0; i < jumlahSiswa; i++) {
			do {
				System.out.print("Masukkan score siswa " + (i + 1) + " [1-10]: ");
				score = scan.nextInt();
				scan.nextLine();
			} while (score < 1 || score > 10);
			if (score == 1) {
				score1.add(score);
			} else if (score == 2) {
				score2.add(score);
			} else if (score == 3) {
				score3.add(score);
			} else if (score == 4) {
				score4.add(score);
			} else if (score == 5) {
				score5.add(score);
			} else if (score == 6) {
				score6.add(score);
			} else if (score == 7) {
				score7.add(score);
			} else if (score == 8) {
				score8.add(score);
			} else if (score == 9) {
				score9.add(score);
			} else if (score == 10) {
				score10.add(score);
			}
		}

//		for (int i = 0; i < scoreList.size(); i++) {
//			int score1 = scoreList.
//			System.out.printf("score %d: %d\n", (i+1), scoreList.equals(1));
//		}

		System.out.println("");
		System.out.println("============================");
		System.out.println("score 1: " + score1.size());
		System.out.println("score 2: " + score2.size());
		System.out.println("score 3: " + score3.size());
		System.out.println("score 4: " + score4.size());
		System.out.println("score 5: " + score5.size());
		System.out.println("score 6: " + score6.size());
		System.out.println("score 7: " + score7.size());
		System.out.println("score 8: " + score8.size());
		System.out.println("score 9: " + score9.size());
		System.out.println("score 10: " + score10.size());
		System.out.println("============================");

		total = ((score1.size()) + (score2.size() * 2) + (score3.size() * 3) + (score4.size() * 4) + (score5.size() * 5)
				+ (score6.size() * 6) + (score7.size() * 7) + (score8.size() * 8) + (score9.size() * 9)
				+ (score10.size() * 10));
		rata = (double) (total / jumlahSiswa);

//		int max = 0;
//
//			if (max < score1) {
//				max = score1;
//			}
//
//		ArrayList<String> modus = new ArrayList<>();
//
//		for (int i = 0; i < jumlahSiswa; i++) {
//			if (score[i] == max) {
//				modus.add(String.valueOf(i));
//			}
//		}
//		
//		System.out.println("Rata - rata: " + rata);
//		System.out.print("Modus: ");
//
//		for (int i = 0; i < modus.size(); i++) {
//			System.out.printf("%s", modus.get(i));
//			if (i != modus.size() - 1) {
//				System.out.print(", ");
//			}
//		}

	

	}

	public static void main(String[] args) {
		new UASTahunLaluTest();

	}

}
