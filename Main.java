import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String s = sc.nextLine();
            if (ifDeleteOneCharToPalindrome(s)){
                System.out.println("true");
            } else{
                System.out.println("false");
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

    public static boolean ifDeleteOneCharToPalindrome(String str){
        if(str==null||str.length()<=2){
            return true;
        }
        char[] ch = str.toCharArray();
        int start = 0;
        int end = str.length()-1;
        while(start<end){
            if(ch[start]==ch[end]){
                start++;
                end--;
            }else{

                return isPalindrome(ch,start+1,end)||isPalindrome(ch,start,end-1);
            }

        }
        return true;
    }
}
