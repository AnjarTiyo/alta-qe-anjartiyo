public class Calc {
    public static void penjumlahan(int num1, int num2){
        int result = num1 + num2;
        System.out.format("Hasil penjumlahan %d dan %d adalah %d%n", num1, num2, result);
    }

    public static void pengurangan(int num1, int num2){
        int result = num1 - num2;
        System.out.format("Hasil pengurangan %d dengan %d adalah %d%n", num1, num2, result);
    }

    public static void perkalian(int num1, int num2){
        int result = num1 * num2;
        System.out.format("Hasil perkalian %d dengan %d adalah %d%n", num1, num2, result);
    }

    public static void pembagian(int num1, int num2){
        int result = num1 / num2;
        System.out.format("Hasil pembagian %d dengan %d adalah %d%n", num1, num2, result);
    }

}
