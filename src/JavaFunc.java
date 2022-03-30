import java.util.function.Function;


public class JavaFunc {
    public static void main(String[] args){

        Function <String,Integer> func = x -> x.length();

       Integer fun = func.apply("Saikat");

       System.out.println(fun);



    }
}
