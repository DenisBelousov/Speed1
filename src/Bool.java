public class Bool {
    public static void main(String[] args) {
        int temp = 33;
        boolean hot = temp > 25;
        int time = 23;
        boolean late = time >= 23;
        if (!late && hot  ){
            System.out.println( "кодней ВКЛ" );
        } else if(!hot || late) {
            System.out.println("кодней ВЫКЛ");
        }
    }
}
