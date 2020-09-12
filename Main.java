import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String s = sc.nextLine();
            String s0 = ifDeleteOneCharToPalindrome(s);
            if (s0.length() == 0){
                System.out.println("false");
            } else{
                System.out.println(s0);
            }
        }
    }

    public static boolean isPalindrome(char[] ch,int start, int end){
        while(start<end){
            if(ch[start] == ch[end]){
                start++;
                end--;
            }else{
                return false;
            }
        }
        return true;
    }

    public static String ifDeleteOneCharToPalindrome(String str){
        char[] ch = str.toCharArray();
        int start = 0;
        int end = str.length()-1;
        while(start<end){
            if(ch[start]==ch[end]){
                start++;
                end--;
            }else{
                if (isPalindrome(ch,start+1,end)){
                    return str.substring(0,start) + str.substring(start+1);
                }else if (isPalindrome(ch,start,end-1)){
                    return str.substring(0,end) + str.substring(end+1);
                } else return "";
            }
        }
        return str;
    }
}
