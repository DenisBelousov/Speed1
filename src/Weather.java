public class Weather {
    public static void main(String[] args) {
        int time = 10;
        boolean late = time >=23 || time <=5;
        boolean goodWeather = false;
        boolean walk = true;
        if (late){
            System.out.println( "ложимся спать");
        } if (!late && goodWeather){
            System.out.println("идём гулять");
        } if (!late && !goodWeather) {
            System.out.println( "сидим дома");
        }

        }
    }


