package String;

public class ToLowerCase {
    public static void main(String[] args) {
        String s="JAVA";
        String s1="";
        for (int i = 0; i < s.length(); i++) {
            int num=s.charAt(i);
            if(num>64&&num<73){
                num+=32;


            }
            s1+=(char)num;

        }
        System.out.println(s1);
    }
}
