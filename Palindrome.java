public class Palindrome {
    public static void main(String [] args){

        int num =5335;
        int reversedNum = 0;
        int r;
        int originalNum = num;

        while(num!=0){
            r =num % 10;
            reversedNum = reversedNum * 10 + r;
            num /= 10;

        }
        if (originalNum == reversedNum) {
            System.out.println(originalNum + " is Palindrome.");
        }
        else {
            System.out.println(originalNum + " is not Palindrome.");
        }
    }

}

