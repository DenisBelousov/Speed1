public class OOP {
    public static void main(String[] args) {
        Box myBox = new Box();
        myBox.height = 10.2;
        myBox.length = 15;
        myBox.width = 11.3;
        Box box2 = new Box();
        Box box3 = new Box();
        box2.width = 5;
        box2.length = 5;
        box2.height = 5;
        box3.width = 10;
        box3.length = 10;
        box3.height = 10;
        double volume3 = box3.height* box3.width* box3.length;
        double volume2 = box2.height* box2.width* box2.length;
        double volume = myBox.height* myBox.length* myBox.width;
        System.out.println("Объём коробки 1 = " + volume);
        System.out.println("Объём коробки 2 = " +volume2);
        System.out.println("Объём коробки 3 = " +volume3);

    }
}
