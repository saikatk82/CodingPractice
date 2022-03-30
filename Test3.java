public class Test3 {
    public static void main(String args[]){
        int[] num = new int []{1,0,4,0,0,8,0};
        int temp =0 ;
        for(int i= 0;i< num.length-1 ;i++){
            if(num[i] != 0) {
                num[temp++] = num[i];
            }
            while (temp < num.length)
                num[temp++] = 0;
        System.out.print(num[i]+" ");
        }

    }

}
