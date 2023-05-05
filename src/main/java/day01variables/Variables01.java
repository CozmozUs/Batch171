package day01variables;

public class Variables01 {

    public static void main(String[] args) {


        //java bu satiri okumaz, kendimize ve baskalarina aciklama satiridir
        /*
        java bu satirlari da okumaz
         */

        //Variable nasil olusturulur?
        //Data type + variable name + Assigment Operator{atama operatoru) + Variable degeri + noktali virgul

        int              age                 =                                    13              ;


        //java cumlesi ==> statement
        //Dilbilgisindeki nokta ne ise javadaki ";" ayni seydir, yani statement in bittigini gosterir.
        //Eger Variable declaration yapar, Assignment yapmazsaniz java kendi default degerlerini koyar
        //Default deger sayilar icin sifirdir.
        //Java da "=" assignment operator dir. ve java bu opratoru gordugu zaman once sag tarafi calistirir.
        //ve sagdaki degeri alir soldaki kutuya koyar
        //Java da esittir demek "==" Matematikte "="
        //Data type + VariableName ==> Variable declaration
        //Assignment Operator (=) + Variable degeri ==> Assignment

        /*
        Javada temelde iki tip data vardir
            1)primitive data type:
                char, boolean, byte, short, int, long, float, double
            2)non-primitive data type:
                String
         */

        //Ornek 1: Ogrenci ismi icin variable olusturup deger olarak Ali Can atayiniz
        //Data type + variable name + Assignment Operator (atama operatoru ) + Variable degeri + noktali virgul
        String         ogrenciAdi            =                                    "Ali Can"            ;


        //String lere verilen degerler daima cift tirnak icinde yazilmalidir
        //String ler icin "default value" (==>varsayilan deger) "null" dir
        /*
        String bir variable olusturdugumuzda cogu zaman ona bir deger atariz.
        Atama yapmazsak , java variable a varsayilan deger olarak null koyar
        -null demek 0 demek degildir, 0 da coding te bir degerdir, null hiclik demektir.
        -icinde variable yada method bulunmayan bos bir obje demektir.
         */


        //char data type
        //TEK karakterler icin kullanilir. Sayi , sembol yada harf farketmez
        //ornegin==> A,x ,? , 5 , ...
        //Ornek 2: char data type inde bir ismin ilk harfi olarak bir variable olusturunuz ve bir deger atayiniz

        char isminIlkHarfi = 'A' ;

        //Note: char data type inda degerler daima tek tirnak icinde yazilmalidir.

        char adiminIlkHarfi = 'F' ;

        //boolean data type
        //boolean lar sadece iki farkli deger alabilir; true (dogru) veya false(yanlis)
        //o yuzden isimlendirme yapilirken ingilizce olarak mi? soru eki anlaminda "is" konulur.
        //Ornek 3 : boolean data type inde emeklimisin sorusu icin bir variable olusturun ve false degerini atayin.

        boolean isRetired = false ;

        //byte data type
        //tam sayilar icin kullanilir , hafizada 1 byte yer kaplar.
        //byte : -128 den +127 e (dahil) tamsayi degerleri icin kullanilir.

        //Ornek 4: byte data type inde ogrenci yasi icin bir variable olusturunuz ve deger atayiniz

        byte ogrencininYasi =     9 ;
        byte studentAge     =     9 ;

        //short data type
        //tam sayilar icin kullanilir , hafizada 2 byte yer kaplar.
        //short : -32768 den +32767 e (dahil) tamsayi degerleri icin kullanilir.

        //Ornek 5: Site nufusu icin bir variable olusturup deger atayiniz.
        short siteNufusu = 1300 ;

        //int data type
        //tam sayilar icin kullanilir , hafizada 4 byte yer kaplar.
        //int : -2,147,483,648 den +2,147,483,647 e (dahil) tamsayi degerleri icin kullanilir.
        //Ornek 6: ulke nufuslari icin bir variable olusturunuz ve deger atamasi yapiniz.

        int ulkeNufusu = 52000000 ;

        //long data type
        //tam sayilar icin kullanilir , hafizada 8 byte yer kaplar.
        //long : -9223372036854775808 den +9223372036854775807 e (dahil) tamsayi degerleri icin kullanilir.

        //Ornek 7: Insan vucudundaki hucre sayisi icin variable olusturup deger atamasi yapiniz

        //Note: Bir deger long ise sonuna "L"(tavsiye edilir) veya "l" konulur

        long insanVucuduHucreSayisi = 658978456558854565L ;

        //Eger long a atadiginiz deger int lerin araliginda ise sonuna "L" koymaya gerek yok
        //long dememize ragmen sonuna L koymazsak eger int araliginda ise java onu int kabul eder.
        long weightOfSun = 121365544;

        //float data type:
        //float virgullu sayilar (Desimal number ==> ondalikli sayilar) icin kullanilir.(Fiyatlandirmalar - 9.99 $)

        // ornek 8 : Gomlek vew ayakkabi fiyatlari icin iki tane variable olusturunuz.

        //Java ondalikli sayilari otomatik olarak "double" kabul eder.
        //siz data type ini float yazarsaniz hata alirsiniz, float olmasinda israr ederseniz sonuna "F" , "f" koymalisiniz.

        float shirtPrice = 19.99F ;
        float shoesPrice = 24.49f ;

        //double data type:
        //ondalikli kismi icin daha fazla rakam alabilir . Hucre agirligi gibi bilimsel calismalarda kullanilabilir.

        //Ornek 9: Hucre agirligi ve Amip in agirligi icin iki tane variable olusturunuz.

        double hucreAgirligi = 0.0000256 ;
        double amipAgirligi = 0.00125 ;



        //Ornek 10: Ogrenci notlari icin iki adet variable olusturunuz ve toplamlarini ekrana yazdiriniz.

        byte note1 = 50;
        byte note2 = 70;

        //System.out.println(); ekrana yazdirir.

        System.out.println(note1);
        System.out.println(note2);
        System.out.println(note1+note2);


        //System.out.println(); ekrana yazdirir ve pointer i bir sonraki satira koyar.
        //System.out.print();   ekrana yazdirir ve pointer i ayni satirda tutar.

        //homework
        /*
        1) 3 farkli data type inda variable olusturun ve bunlari yazdirin.
        2) ulke ve sehir isimleri icin 2 variable olusturun ve bunlari yazdirin
        3) 2 tamsayi turunde variable olusturup toplamini yazdirin.
         */


        // Homework
        // 1)

        byte boxInApple = 16;
        System.out.println(boxInApple);

        char numberOfFingersOnAHand = '5';
        System.out.println(numberOfFingersOnAHand);

        int turkeysPopulation = 82000000;
        System.out.println(turkeysPopulation);


        // 2)

        String homeland = "Turkey";
        System.out.println(homeland);

        String suncity = "Florida";
        System.out.println(suncity);

        // 3)

        int americasPopulation = 331900000;
        System.out.println(americasPopulation);

        int tukeyPopulation = 82000000;
        System.out.println(tukeyPopulation);

        int totalPopulation = (americasPopulation + tukeyPopulation);
        System.out.println(totalPopulation);


        float humidityInTheAir = 51.6F;
        System.out.println(humidityInTheAir);

























    }

}