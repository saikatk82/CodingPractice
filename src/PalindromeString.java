public class PalindromeString {
    public static void main(String args[]) {
        String str = "malayalam";
        String strRev = "";
        for(int i = (str.length())-1; i>=0 ;--i){
            strRev = strRev + str.charAt(i);

        }
        if(str.equals(strRev)){
            System.out.println("String is Palindrome");
        }
        else
        {
            System.out.println("String is not Palindrome");
        }
    }
}