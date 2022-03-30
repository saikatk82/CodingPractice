import java.util.function.Function;

public class JavaFun2 {

    public static void main(String [] args){

        Function<String,Integer > func1 = x->x.length();

        Function<Integer,Integer > func2 = x-> x * 2;

        Integer result = func1.andThen(func2).apply("Saikat");
        System.out.println(result);
    }

}
