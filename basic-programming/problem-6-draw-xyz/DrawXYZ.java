public class DrawXYZ {
    private static void drawXYZ(int input){
        String mainStr = "";
        int n = input * input;

        // define mainStr
        for (int i = 1; i <= n; ++i){
            if (i % 3 == 0)
                mainStr = mainStr + "X";
            else if (i % 2 == 0)
                mainStr = mainStr + "Z";
            else
                mainStr = mainStr + "Y";
        }

        // define strLen
        int strLen = mainStr.length();

        // insert "\n" every charLen of "input"
        String result = mainStr.replaceAll(
                "(.{" + input + "})", "$1\n").trim();

        // insert space every character
        result = result.replaceAll(".(?!$)","$0 ");

        // print result
        System.out.println(result + "\n");
    }

    public static void main(String[] args) {
        drawXYZ(3);
        drawXYZ(5);
        drawXYZ(1);
    }
}