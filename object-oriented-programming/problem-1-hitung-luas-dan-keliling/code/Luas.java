public class Luas {
    public static void persegi(int sisi){
        int luasPersegi = sisi * sisi;
        System.out.println("Luas Persegi tersebut adalah: " + luasPersegi);
    }

    public static void segitiga(int alas, int tinggi){
        int luasSegitiga = (alas * tinggi) / 2;
        System.out.println("Luas Segitiga tersebut adalah: " + luasSegitiga);
    }

    public static void persegiPanjang(int panjang, int lebar){
        int luasPersegiPanjang = panjang * lebar;
        System.out.println("Luas Persegi Panjang tersebut adalah: " + luasPersegiPanjang);
    }
}
