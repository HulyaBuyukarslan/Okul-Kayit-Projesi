package okulkayit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
    public  class Okul {
        static String  okulAdi = "*******  MUSTAFA KEMAL İLKÖĞRETİM OKULU  *******";
        static List<String> ogrenciListesi = new ArrayList<>();
        static Scanner input = new Scanner(System.in);

        public static void ogrenciKayit() {
            System.out.println(okulAdi);
            int maxOgrenciSayisi = 0;
            String isim ;
            String soyisim;
            String yas;

            do {
                System.out.println("Lutfen ogrencinin adini giriniz");
                isim = input.nextLine().toUpperCase();
                System.out.println("Lutfen ogrencinin soyadini giriniz");
                soyisim = input.nextLine().toUpperCase();
                System.out.println("Lutfen ogrencinin yasini giriniz");
                yas = input.nextLine();
                int sayiYas = Integer.parseInt(yas);

                if (sayiYas < 15) {
                    OgrenciPojo ogrenci = new OgrenciPojo(isim, soyisim, yas);
                    ogrenciListesi.add(ogrenci.getOgrenciAdi()+" "+ogrenci.getOgrenciSoyadi()+" "+ ogrenci.getOgrenciYasi());
                    System.out.println(ogrenciListesi);
                    maxOgrenciSayisi++;
                } else {
                    System.out.println("Ogrencinin yasi 15'den buyuk olamaz!");
                }
                if (maxOgrenciSayisi == 3) {
                    break;
                }

            } while (true);

        }
    }
