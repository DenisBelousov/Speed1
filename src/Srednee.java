public class Srednee {
    public static void main(String[] args) {
        int summa = 0;
        int count = 1;
        while (count <=100) {
            summa+=count;
            count++;
        }
        float result= summa/(float)count;
        System.out.println(result);
    }
}
