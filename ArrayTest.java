public class ArrayTest {
    public static void main(String[] args){
        int a[] = {1, 4 , 6 ,8, 3, 9 ,0 ,6};
        int temp = 0;
        for(int i=0; i< a.length; i++){
            for(int j= 1 ; j<a.length -i; j++){
                a[j-1] =a[j];
                temp = a[j-1];
                a[j] = temp;
            }
                for(  i=0;i<a.length-1; i++)
            System.out.println(a[i]);
        }
    }
}
