public class Practice {
     public static void main(String [] args){
          int [] arr = new int[]{3,2,3,5,8,1,7};
         int  temp =0;
          for(int i=0 ; i < arr.length;i++){
               for(int j=i+1 ; j < (arr.length ); j++){
                    if(arr[i] > arr[j]){
                         temp = arr[i];
                         arr[i]= arr[j];
                         arr[j]=temp;
                    }
               }
               System.out.println(arr[i]);
          }
     }
}
