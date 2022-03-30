import java.util.HashSet;
import java.util.Set;

public class TestEpam {
    public static void main(String args[]) {
        Set set = new HashSet();

        Customer cust1 = new Customer("1234567");
        Customer cust2 = new Customer("1234567");
        set.add(cust1);
        set.add(cust2);

        System.out.println(set.size());
        System.out.println(cust1.hashCode());
        System.out.println(cust2.hashCode());

    }


}
