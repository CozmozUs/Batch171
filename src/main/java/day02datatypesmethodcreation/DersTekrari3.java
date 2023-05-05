package day02datatypesmethodcreation;

public class DersTekrari3 {


    /*

    Java'da method nasil olusturulur?

    1) main method un disinda , class in icinde olusturulur
    2) Access Modifier + return type + method ismi + () + {}

     Olusturulan method lar nasil kullanilir?
     1) Methodu olusturmak methodu calistirmak icin yeterli degildir, kullanilmak istenen method
     main method un icinden kullanilir.
     2) method un ismi + () yazin
         varsa islem yapacaginiz datalari parantezin icine koyun
         bu islem method call (method cagirma ) olarak adlandirilir
     3) method un ismi + parametreler ===> method signature
     */

    public static void main(String[] args) {

       int sonuc = toplamaYap(5,9);
        System.out.println(sonuc);


        long carpmaSonucu = multiply(4,5);
        System.out.println(carpmaSonucu);

        int carpToplaSonuc = carpTopla(4,5,6);
        System.out.println(carpToplaSonuc);


    }

    //Ornek 1: toplama islemi yapan bir method olusturunuz ve kullaniniz.

    public static int toplamaYap(int a, int b){
    //Bu kisimda method kapsaminda kullanilmasini ve islenmesini istedigimiz datalari deklare ediyoruz.

    return a+b;
    // return demek bu methodun cagrildigi yere bu degeri return et demek.

    }

    //Ornek: 2 sayiyi carpma islemi yapan bir method olusturun ve kullanin.
    protected static long multiply(int a, int b){
        return a*b;
    }


    //Ornek 3 : verilan 3 sayidan ilk ikisini carpan ve ucuncu sayi ile sonucu toplayan methodu olusturunuz ve kullaniniz

    public static int carpTopla(int a, int b , int c){
        return a*b+c;
    }






}
