import java.util.*;

public class StringArrayTest {
    public static void main(String [] args){
        String a[] = {"Saikat","Pablo","Pooja","Saikat"};
        for(int i=0; i < a.length;i++){
            System.out.println(a[i]);
        }
        List<String>   arr = new ArrayList<String>(Arrays.asList(a));
        HashSet<String> set = new HashSet<>(arr);
        HashMap<Integer,String> map = new HashMap<Integer,String>();
        }

    }

