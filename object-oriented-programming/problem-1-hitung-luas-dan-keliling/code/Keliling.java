public class Keliling {
    public static void persegi(int sisi){
        int kelilingPersegi = 4 * sisi;
        System.out.println("Keliling Persegi tersebut adalah: " + kelilingPersegi);
    }

    public static void segitiga(int alas, int tinggi){
        double A = alas;
        double B = (Math.sqrt(Math.pow(tinggi, 2) + Math.pow((alas / 2), 2)));
        double C = A + (2 * B);
        int kelilingSegitiga = (int) C;
        System.out.println("Keliling Segitiga tersebut adalah: " + kelilingSegitiga);
    }

    public static void persegiPanjang(int panjang, int lebar){
        int kelilingPersegiPanjang = (2 * panjang) + (2 * lebar);
        System.out.println("Keliling Persegi Panjang tersebut adalah: " + kelilingPersegiPanjang);
    }
}
