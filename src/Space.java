import java.sql.Array;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Space {
    public static void main(String[] args) {
        String [] MyArray = {"day","night","morning","evening","noon","midnight","cool","hot","short","better","main"};
        for(int i=0; i<MyArray.length; i++);
        Collections.shuffle(Arrays.asList(MyArray));
        System.out.println(MyArray[0]);

    }
}
