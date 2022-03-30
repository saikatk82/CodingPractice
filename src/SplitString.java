import java.util.Arrays;
import java.util.Collections;

public class SplitString {
    public static void main(String args[]) {
       String msg ="http://100.123.12.34:8080/test.do";
       msg.replaceAll("[]a-zA-Z0-9]","");
       String aa[] =msg.split("");
       for(int i=0;i<aa.length;i++){
           System.out.println(aa[i]);
       }
    }
}
