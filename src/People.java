public class People {
    public static void main(String[] args) {
        Man girl = new Man();
        girl.age = 18;
        girl.name = "Julia";
        girl.weight = 62;

        Man girl2 = new Man();
        girl2.age = 22;
        girl2.name = "Sveta";
        girl2.weight = 58;

        Man girl3 = new Man();
        girl3.age = 25;
        girl3.name = "Vika";
        girl3.weight = 55;

        Man girl4 = new Man();
        girl4.age = 20;
        girl4.name = "Sasha";
        girl4.weight = 54;

        Man girl5 = new Man();
        girl5.age = 19;
        girl5.name = "Olga";
        girl5.weight = 59;

        double sumAge = girl.age + girl2.age + girl3.age+girl4.age+girl5.age;
        double count = 5;
        double result = sumAge/count;

        double sumWeight = girl.weight + girl2.weight + girl3.weight+girl4.weight+girl5.weight;
        double countWeight = 5;
        double resultWeight2 = sumWeight/countWeight;

        System.out.println(result);
        System.out.println(resultWeight2);





    }
}
