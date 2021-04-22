public class FirstArray {
    public static void main(String[] args) {
       int [] daysInMonths = new int[12];
       daysInMonths [0] = 31;
       daysInMonths [1] = 28;
       daysInMonths [2] = 31;
       daysInMonths [3] = 30;
       daysInMonths [4] = 31;
       daysInMonths [5] = 30;
       daysInMonths [6] = 31;
       daysInMonths [7] = 31;
       daysInMonths [8] = 30;
       daysInMonths [9] = 31;
       daysInMonths [10] = 30;
       daysInMonths [11] = 31;
        for (int i = 0; i < daysInMonths.length; i++){
            System.out.println(daysInMonths[i]);
        }

    }
}
