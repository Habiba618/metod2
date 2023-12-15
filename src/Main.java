import java.util.Scanner;

/** public class Main {
    static int quvvetHesablama (int a, int b){
             int netice=1;
       for(int i=1;i<=b;i++){
           netice=netice*a;
       }
        return netice;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Tabanı girin: ");
        int a = sc.nextInt();

        System.out.print("Üssü girin: ");
        int b = sc.nextInt();

        int sonuc = quvvetHesablama(a, b);

        System.out.println("Sonuç: " + sonuc);
    }
} */

/* public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();
        if (asalKontrol(sayi, 2)) {
            System.out.println(sayi + " sayısı bir asal sayıdır.");
        } else {
            System.out.println(sayi + " sayısı bir asal sayı değildir.");
        }
    }
   static boolean asalKontrol(int sayi, int bolen) {
        // Sayının 1'den büyük olması ve bolen'e kadar olan tüm değerlere bölünmemesi durumu kontrol edilir
        if (sayi > 1 && bolen <= Math.sqrt(sayi)) {
            // Eğer sayı bölendiğinde kalanı sıfırsa, asal değildir
            if (sayi % bolen == 0) {
                return false;
            } else {
                // Recursive olarak fonksiyonu kendisiyle çağır ve bolen değerini bir artır
                return asalKontrol(sayi, bolen + 1);
            }
        } else {
            // Sayı 1'den küçükse veya bolen değeri sayının karekökünden büyükse, asaldır
            return sayi > 1;
        }
    }
}
*/
public class Main {
    // Kontrol değişkeni
    private static boolean islemYapildi = false;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int n = scanner.nextInt();
        // Metodu sadece bir kere çağır
        recursiveIslem(n);
    }
    static void recursiveIslem(int sayi) {
        // Kontrol değişkenini kontrol et
        if (!islemYapildi) {
            System.out.print(sayi + " ");
            // Sayı 0 veya negatif olduğunda durumu kontrol et
            if (sayi <= 0) {
                // Negatif veya 0 ise, tekrar 5 ekleyerek işlemi devam ettir
                sayi += 5;
                System.out.print(sayi + " ");
                recursiveIslem(sayi);
                // Kontrol değişkenini true yap
                islemYapildi = true;
                return;
            } else {
                // Sayı pozitif ise, 5 çıkartarak işlemi devam ettir
                sayi -= 5;
                recursiveIslem(sayi);
            }
        }
    }
}
