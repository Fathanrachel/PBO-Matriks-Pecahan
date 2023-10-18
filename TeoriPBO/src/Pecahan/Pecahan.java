package Pecahan;
import java.util.Scanner;



public class Pecahan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input pecahan pertama
        System.out.println("Masukkan pecahan pertama (pembilang/penyebut):");
        Fraction fraction1 = readFraction(scanner);

        // Meminta input pecahan kedua
        System.out.println("Masukkan pecahan kedua (pembilang/penyebut):");
        Fraction fraction2 = readFraction(scanner);

        // Melakukan operasi penjumlahan
        Fraction additionResult = fraction1.add(fraction2);
        System.out.println("Hasil penjumlahan: " + additionResult);

        // Melakukan operasi pengurangan
        Fraction subtractionResult = fraction1.subtract(fraction2);
        System.out.println("Hasil pengurangan: " + subtractionResult);

        // Melakukan operasi perkalian
        Fraction multiplicationResult = fraction1.multiply(fraction2);
        System.out.println("Hasil perkalian: " + multiplicationResult);

        // Melakukan operasi pembagian
        Fraction divisionResult = fraction1.divide(fraction2);
        System.out.println("Hasil pembagian: " + divisionResult);
    }

    public static Fraction readFraction(Scanner scanner) {
        String fractionString = scanner.next();
        return Fraction.fromString(fractionString);
    }
}


