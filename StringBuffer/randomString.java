package StringBuffer;
import java.util.Random ;

public class randomString {

    static void main() {

        StringBuffer sb = new StringBuffer();
        Random rnd = new Random();

        for(int i = 0 ; i < 20 ; i++){
            int randChar = 97 + (int)(rnd.nextFloat() * 26) ;
            sb.append((char)randChar);
        }
        System.out.println(sb.toString());
    }
}
