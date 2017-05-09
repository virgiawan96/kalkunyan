//PERUBAHAN 7
import java.util.Scanner;

public class kalkujumlah
{
	public static void main(String args[])
	{
		double bil1,bil2,total;
		int i=0;
		Scanner inp=new Scanner(System.in);
		while(i==0){
			System.out.println("~~~~~~~~~~~KalkuJumlahNyan~~~~~~~~~~~");
			System.out.println("~~~~~~~~~~~Menu KalkuNyan~~~~~~~~~~~~");
			System.out.println("1. Penjumlahan ");
			System.out.println("2. Pengurangan ");
			System.out.println("3. Perkalian ");
			System.out.println("4. Pembagian ");
			System.out.println("5. (Bangundatar) Persegi Panjang ");
			System.out.println("6. (Turunan) ln x");
			System.out.println("*Pilih perhitungan  masukkan Nomor sesuai urutan pada menu");
			System.out.println("Masukkan Nomor Untuk perhitungan lainnya :");
			i=inp.nextInt();
			while(i==1){
				System.out.println("~~~~~~~~~~~PENJUMLAHAN~~~~~~~~~~~");
				System.out.println("Masukkan Bilangan 1 : ");
				bil1=inp.nextDouble();
				System.out.println("Masukkan Bilangan 2 : ");
				bil2=inp.nextDouble();
				total=bil1+bil2;
				System.out.println("Hasil penjumlahan : "+bil1+" + "+bil2+" = "+total);
				System.out.println("Ingin menghitung lagi ? tekan 1 jika iya ,jika tidak masukkan sembarang key untuk keluar dan masukkan angka 0 untuk kembali ke menu");
				i=inp.nextInt();
			}
			while(i==2){
				System.out.println("~~~~~~~~~~~PENGURANGAN~~~~~~~~~~~");
				System.out.println("Masukkan Bilangan 1 : ");
				bil1=inp.nextDouble();
				System.out.println("Masukkan Bilangan 2 : ");
				bil2=inp.nextDouble();
				total=bil1-bil2;
				System.out.println("Hasil pengurangan : "+bil1+" - "+bil2+" = "+total);
				System.out.println("Ingin menghitung lagi ? tekan 1 jika iya ,jika tidak masukkan sembarang key untuk keluar dan masukkan angka 0 untuk kembali ke menu");
				i=inp.nextInt();
			}
			while(i==3){
				System.out.println("~~~~~~~~~~~PERKALIAN~~~~~~~~~~");
				System.out.println("Masukkan Bilangan 1 : ");
				bil1=inp.nextDouble();
				System.out.println("Masukkan Bilangan 2 : ");
				bil2=inp.nextDouble();
				total=bil1*bil2;
				System.out.println("Hasil perkalian : "+bil1+" x "+bil2+" = "+total);
				System.out.println("Ingin menghitung lagi ? tekan 1 jika iya ,jika tidak masukkan sembarang key untuk keluar dan masukkan angka 0 untuk kembali ke menu");
				i=inp.nextInt();
			}
			while(i==4){
				System.out.println("~~~~~~~~~~~PEMBAGIAN~~~~~~~~~~");
				System.out.println("Masukkan Bilangan 1 : ");
				bil1=inp.nextDouble();
				System.out.println("Masukkan Bilangan 2 : ");
				bil2=inp.nextDouble();
				total=bil1/bil2;
				System.out.println("Hasil pembagian : "+bil1+" / "+bil2+" = "+total);
				System.out.println("Ingin menghitung lagi ? tekan 1 jika iya ,jika tidak masukkan sembarang key untuk keluar dan masukkan angka 0 untuk kembali ke menu");
				i=inp.nextInt();
			}
			while(i==5){
				double panjang,lebar,luas,kel;
				System.out.println("~~~~~~~~~~~(Bangundatar) Persegi Panjang~~~~~~~~~~");
				System.out.println("PERSEGI PANJANG DIKETAHUI");
				System.out.println("Masukkan nilai Panjang = ");
				panjang=inp.nextDouble();
				System.out.println("Masukkan nilai Lebar = ");
				lebar=inp.nextDouble();
				luas=panjang*lebar;
				System.out.println("LUAS PERSEGI PANJANG = panjang x lebar ="+panjang+" x "+lebar+" = "+luas);
				kel=(2*panjang)+(2*lebar);
				System.out.println("KELILING PERSEGI PANJANG = (2 x panjang)+(2 x Lebar) = ( 2 x " +panjang+ ")+( 2 x " +lebar+") = "+kel);
				System.out.println("Ingin menghitung lagi ? tekan 1 jika iya ,jika tidak masukkan sembarang key untuk keluar dan masukkan angka 0 untuk kembali ke menu");
				i=inp.nextInt();
			}
			while(i==5){
				double panjang,lebar,luas,kel;
				System.out.println("~~~~~~~~~~~(Bangundatar) Persegi Panjang~~~~~~~~~~");
				System.out.println("PERSEGI PANJANG DIKETAHUI");
				System.out.println("Masukkan nilai Panjang = ");
				panjang=inp.nextDouble();
				System.out.println("Masukkan nilai Lebar = ");
				lebar=inp.nextDouble();
				luas=panjang*lebar;
				System.out.println("LUAS PERSEGI PANJANG = panjang x lebar ="+panjang+" x "+lebar+" = "+luas);
				kel=(2*panjang)+(2*lebar);
				System.out.println("KELILING PERSEGI PANJANG = (2 x panjang)+(2 x Lebar) = ( 2 x " +panjang+ ")+( 2 x " +lebar+") = "+kel);
				System.out.println("Ingin menghitung lagi ? tekan 1 jika iya ,jika tidak masukkan sembarang key untuk keluar dan masukkan angka 0 untuk kembali ke menu");
				i=inp.nextInt();
			}
			while(i==6){
				double x,fx;
				System.out.println("~~~~~~~~~~~(Turunan) Ln x~~~~~~~~~~");
				System.out.println("Turunan dari Ln x = 1/x");
				System.out.println("Masukkan nilai x = ");
				x=inp.nextDouble();
				fx=1/x;
				System.out.println("f(x)= f("+x+") = ln "+x+" = 1/"+x+" = "+fx);
				System.out.println("Ingin menghitung lagi ? tekan 1 jika iya ,jika tidak masukkan sembarang key untuk keluar dan masukkan angka 0 untuk kembali ke menu");
				i=inp.nextInt();

			}
		}
		System.out.println("Have a Good Day");
 	}
}
