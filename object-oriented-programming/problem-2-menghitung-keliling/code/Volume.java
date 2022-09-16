public class Volume {
    public static void kubus(int sisi){
        int volumeKubus = (int) Math.pow(sisi, 3);
        System.out.println("Volume Kubus tersebut adalah: " + volumeKubus);
    }

    public static void balok(int lebar, int panjang, int tinggi){
        int volumeBalok = panjang * lebar * tinggi;
        System.out.println("Volume Balok tersebut adalah: " + volumeBalok);
    }

    public static void tabung(int jari2Alas, int tinggi){
        int volumeTabung = (int) (Math.PI * Math.pow(jari2Alas, 2) * tinggi);
        System.out.println("Volume Tabung tersebut adalah: " + volumeTabung);
    }
}
