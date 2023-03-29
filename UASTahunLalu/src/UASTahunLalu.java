import java.util.ArrayList;
import java.util.Scanner;

public class UASTahunLalu {
	
	Scanner scan = new Scanner(System.in);

	public UASTahunLalu() {
		
		/*
		 * Encapsulation itu menggabungkan ebebrapa atribut dan method menjadi satu buat object
		 * Inheritance itu emngambil atribut yang ada di parent class.
		 * Polymorphism -> poly = banyak, morph = bentuk -> biasa dipakai di method, jadi satu method bisa dipakai untuk banyak macam kegunaan. Ada method yang namanya sama, taapi isinya beda
		 * Overriding, naam method sama, tapi isinya beda
		 * Kalau private, harus pake setter getter.
		 * 
		 * Encamsulation -> Konsep yang menggabungkan atribut dan method menjadi satu class untuk menjadi object
		 * Inhertitasnce -> Konsep yang mengenai pewarisan sifat dari parent class kepada childclass untuk digunakan atribut dan methodnya
		 * Poly-> konsep mengenai bentuk dari sbuah object yang dapat memiliki nama yang sama tetapi memiliki isi yang beda-> ada override dan overload
		 * Overload -> parameternya yang berbeda, isinya bisa sama atau beda.
		 * this. itu untuk blg kalo kita tuh ngerujuk ke class ini
		 * Beda method dan constructor, method ada void, int, string, yang bisa return valuenya.
		 * 
		 * Selection sort itu ngecek yang mana yang paling terendah atau yang tertinggi, baru dituker.
		 * Merge sort itu memisahkan vektor menjadi beberapa bagian
		 * 
		 * A. Bubble sort
		 * B. Selection sort
		 * C. Insertion Sort, tp bisa jg pake merge sort
		 * D. Merge sort
		 * 
		 */
		
		int jumlahSiswa;
		
		int[] score = new int[11];
		
		for (int i = 0; i < score.length; i++) {
			score[i] = 0;
		}
		
		do {
			System.out.print("Masukkan banyak siswa [min 10]: ");
			jumlahSiswa = scan.nextInt(); scan.nextLine();
		} while (jumlahSiswa < 10);
		
		for (int i = 0; i < jumlahSiswa; i++) {
			int Score;
			do {
				System.out.print("Masukkan nilai: ");
				Score = scan.nextInt(); scan.nextLine();
			} while (Score < 1 || Score > 10);
			
			score[Score]++;
		} 
		
		for (int i = 1; i < score.length; i++) {
			System.out.printf("Nilai %d: %d\n", i, score[i]);
		}
		
		int totalScore = 0;
		
		for (int i = 0; i < score.length; i++) {
			int temp = i * score[i];
			totalScore += temp;
		}
		
		double rata = (double)totalScore/(double)jumlahSiswa;
		
		System.out.println("Rata-rata: " + rata);
		
		int max = 0;
		
		for (int i = 0; i < score.length; i++) {
			if (max < score[i]) {
				max = score[i];
			}
 		}
		
		ArrayList<String> modus = new ArrayList<>();
		
		for (int i = 0; i < score.length; i++) {
			if (score[i] == max) {
				modus.add(String.valueOf(i));
			}
		}
		
		System.out.print("Modus: ");
		
		for (int i = 0; i < modus.size(); i++) {
			System.out.printf("%s", modus.get(i));
			if (i != modus.size()-1) {
				System.out.print(", ");
			}
		}
		
	}

	public static void main(String[] args) {
		new UASTahunLalu();

	}

}
