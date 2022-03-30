import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class JavaFunc3 {
    public static void main(String[] args){

        JavaFunc3 javaFunc3 = new JavaFunc3();

        List<String>  list = Arrays.asList("Java","Python","javascript");

        Map<String,Integer> map = javaFunc3.convertListToMap(list,x ->x.length());
        System.out.println(map);
        Map<String,Integer> map2 = javaFunc3.convertListToMap(list,javaFunc3::getLength);
        System.out.println(map2);
    }

    public <String,Integer> Map<String,Integer>convertListToMap(List<String> list, LengthFunc<String,Integer> func){

        Map<String,Integer> result = new HashMap<>();
        for(String t : list){
            result.put(t,func.say(t));
        }
        return result;
    }

     interface LengthFunc<String,Interger>{
        Interger say(String msg);

     }

     public Integer getLength(String str){
        return str.length();
     }
}
