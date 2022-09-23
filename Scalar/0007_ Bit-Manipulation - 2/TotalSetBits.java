public class TotalSetBits {
    public static void main(String[] args) {

        int n = 27;
        int count = 0;
        for (int i = 0; i < 32; i++) {

            count += n & 1;
            n = n >> 1;
        }
        System.out.println(count);
    }
}

class TotalSetBits2 {
    public static void main(String[] args) {

        int n = 27;
        int count = 0;
        while (n != 0) {
            count += n & 1;
            n = n >> 1;
        }
        System.out.println(count);
    }
}