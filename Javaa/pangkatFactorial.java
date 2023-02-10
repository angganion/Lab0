import java.util.Scanner;

public class pangkatFactorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan utama (n): ");
        int n = input.nextInt();
        System.out.print("Masukkan pemangkatan (m): ");
        int m = input.nextInt();

        int tempN = n;
        int hasilFact = 1;
        while (tempN >= 1) {
            hasilFact = hasilFact * tempN;
            tempN = tempN - 1;
        }

        int hasilPangkat = 1;
        for (int i = 0; i < m; i++) {
            hasilPangkat = hasilPangkat * n;
        }

        System.out.println("n factorial = " + hasilFact);
        System.out.println("n pangkat m = " + hasilPangkat);
    }
}