public class NthSetBit {
    public static void main(String[] args) {
        int n = 21;
        int i = 2;

        n = n >> i;
        int res = n & 1;
        if (res == 1) {
            System.out.println("Set");
        } else {
            System.out.println("not set");
        }
    }
}
