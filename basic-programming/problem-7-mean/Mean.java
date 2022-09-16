public class Mean {
    private static float mean(float[] num){
        // define sum
        float sum = 0;
        int i = 0;

        while ( i < num.length ){
            sum += num[i];
            i++;
        }

        return sum / num.length;
    }

    public static void main(String[] args) {
        float[] value = {1, 2, 3, 4};
        System.out.println(mean(value));
    }
}
