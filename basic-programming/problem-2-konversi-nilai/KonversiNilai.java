public class konversiNilai {
    public static void main(String[] args) {
        //input
        int studentScore = 80;
        String convert = "";

        //Process
        if (studentScore >= 80 && studentScore <= 100){
            convert = "A";
        }else if (studentScore >= 65 && studentScore <= 79){
            convert = "B+";
        }else if (studentScore >= 50 && studentScore <= 64){
            convert = "B";
        }else if (studentScore >= 35 && studentScore <= 49){
            convert = "C";
        }else if (studentScore >= 0 && studentScore <= 34){
            convert = "D";
        }else {
            convert = "invalid";
        }

        // output
        System.out.println("Nilai = " + convert);
    }
}
