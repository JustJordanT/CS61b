public class hw0 {

    static void isCompared() {
        if (x == 5 && y == 10 && k == 20 && j == 30) {
            System.out.println("Numbers are from - High to Low");
        } else {
            System.out.println("Numbers are from - Low To High");
        }
    }

    static void isLow(int p) throws Exception {
        if (p < 100) {
            System.out.println("You number is low");
        } else {
            throw new Exception("!!Number is not low!!");
        }
    }

    static void isHigh(int p) throws Exception {
        if (p > 100) {
            System.out.println("You number is high");
        } else {
            throw new Exception("!!Number is not high!!");
        }
    }

    static void Loop() {
        int q = 0;
        while (q < 4) {
            for (int i : myNums) {
                System.out.println(i);
            }
            q++;
        }
    }
}
