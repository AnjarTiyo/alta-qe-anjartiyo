public class faktorBilangan {
    public static void faktorkan(int bilangan) {
    System.out.println(
            "Faktor dari " + bilangan + " adalah: ");
    //process
        for (int i = 1; i <= bilangan; i++){
            if (bilangan % i ==0){
                System.out.println(i);
                
            }
        }
    System.out.println("\n");
    }
    public static void main(String[] args) {
        // soal
        int soal1 = 6;
        int soal2 = 20;

        faktorkan(soal1);
        faktorkan(soal2);
    }
}
