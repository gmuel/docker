import java.sql.Timestamp;
public class Testy {
    public static void main (String[] args){
        Timestamp ts = new Timestamp(System.currentTimeMillis());
        System.out.println(String.format("Hello World - it is '%s'",ts));
    }
}
