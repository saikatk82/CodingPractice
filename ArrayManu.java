import java.util.*;
import java.util.stream.Collectors;

public class ArrayManu {

    public static void main(String [] args) {
        Integer [] a = {5,2,4,7,9,10,4,7};
       int count =0;
        //iterate array as list  with for loop
        List arr = new ArrayList(Arrays.asList(a));
       for(int i =0 ; i<a.length;i++)
       {
           System.out.println(a[i]);
       }

        //iterate a list with foreach loop
        List<Integer> items = new ArrayList<Integer>();
        for (Integer item: new Integer[] {1, 2, 3}) {
            items.add(item);
        }

      //iterate a list with stream api
      List ar = new ArrayList();
       ar = Arrays.stream(a).collect(Collectors.toList());
       System.out.println(items);
        System.out.println(ar);

    // insert unique numbers in a set
        Set<Integer> uniqueNums = new HashSet<Integer>(arr);
        System.out.println("Unique Numbers:"+ uniqueNums);

        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(Integer  obj : a ){
            if(map.containsKey(obj)){
                count = map.get(obj);
                map.put(obj,count+1);
            }
            else
            map.put(obj,count);
        }
        System.out.println("Map:"+ map);

       for(Map.Entry<Integer,Integer> entry :  map.entrySet()){
           if(entry.getValue() ==1){
               System.out.println("duplicate :"+ entry.getKey() + " number of occurance :" +entry.getValue());
           }
       }

    }

}
