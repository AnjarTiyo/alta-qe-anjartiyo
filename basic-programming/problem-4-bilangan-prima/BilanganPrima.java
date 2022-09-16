public class bilanganPrima {
    public static boolean primeNumber(int number){
        boolean status = true;
        for (int i = 2; i < number; ++i) {
            if (number % i == 0) {
                status = false;
            }
        }
        return status;
    }

    public static void main(String[] args) {
        System.out.println(primeNumber(11));
        System.out.println(primeNumber(13));
        System.out.println(primeNumber(17));
        System.out.println(primeNumber(20));
    }
}