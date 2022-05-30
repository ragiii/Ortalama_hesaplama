import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Degiskenleri olustur
        int mat, fizik, kimya, turkce, tarih, muzik;

        //Scanner sınıfımızı tanımladıkk
        Scanner inp = new Scanner(System.in);

        //Kullanıcıdan degerleri al
        System.out.println("Matematik Notunuz : ");
        mat = inp.nextInt();

        System.out.println("Fizik Notunuz : ");
        fizik = inp.nextInt();

        System.out.println("Kimya Notunuz : ");
        kimya = inp.nextInt();

        System.out.println("Türkce Notunuz");
        turkce = inp.nextInt();

        System.out.println("Tarih Notunuz");
        tarih = inp.nextInt();

        System.out.println("Müzik Notunuz");
        muzik = inp.nextInt();

        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        double ortalama = toplam / 6.0;
        System.out.println("Ortalamaniz : " + ortalama);


        boolean kosul1 = ortalama >= 60;
        String str = kosul1 ? "gectiniz" : "kaldiniz";
        System.out.println(str);

    }
   }
