package BridgeLabz.OOPSJava;

public class PalindromeChecker {
    String text;
    public PalindromeChecker(String text){
        this.text=text;
    }
    public boolean checkPalindrome(){
        int left=0,right=text.length()-1;

        while(left<right){
            if(text.charAt(left)!=text.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
