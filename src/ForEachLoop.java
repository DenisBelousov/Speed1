public class ForEachLoop {
    public static void main(String[] args) {
        int[] nums = new int[100];
        for (int i = 0; i<nums.length; i++) {
            nums [i] = i*5;
        }
        for (int i: nums) {
            System.out.println(i);
        }

    }
}
