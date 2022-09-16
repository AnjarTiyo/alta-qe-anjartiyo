public class Ongkir {
    public static int hitung(int panjang, int lebar, int tinggi, int berat){
        // input harga per kg dan pembagi kubikasi (dimensi minimal)
        int harga = 5000;
        int minDimensi = 50;

        // kubikasi kargo per 50 cm kubik, Math.ceil((float) a/100) digunakan untuk roundup
        int hargaBayar =
                (int) Math.ceil((float) (panjang * lebar * tinggi) / 100 / minDimensi) * harga;

        // print
        System.out.format("Ongkir kargo tersebut adalah Rp. %d,00", hargaBayar);
        return hargaBayar;
    }
}
