public class spaceCount {
    public static void main(String[] args) {
        String str = "Mr John Smith";
        str =str.replaceAll(" ","%20");
        System.out.println(str);
    }


    void replaceSpaces(char[] str,int trueLength){
        int spaceCount =0, index ,i =0;
        for(i=0;i< trueLength;i++){
            if(str[i] == ' '){
                spaceCount++;
            }
        }
    }
}