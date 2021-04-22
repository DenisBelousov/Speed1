public class SredneeArifmet {
    public static void main(String[] args) {
        int sum = 0;
        int count = 1;
        while (count <= 100) {
            sum = sum + count;
            count++;
        }
        int result = sum / (int) count;
        System.out.println( result);

    }
}
