
import java.util.StringTokenizer;
public class Main {
    public static String cleanSentence(String sentence){
        StringBuilder cleaned=new StringBuilder();
        StringTokenizer tokenizer=new StringTokenizer(sentence,",.!?;:-_'\"");
        while(tokenizer.hasMoreTokens()){
            String word= tokenizer.nextToken().toLowerCase();
            cleaned.append(word);
        }
        return cleaned.toString();

    }
    public static boolean isPalindrome(String sentence){
        String cleanedSentence=cleanSentence(sentence);
        int left=0;
        int right=cleanedSentence.length()-1;
        while (left<right){
            if(cleanedSentence.charAt(left)!=cleanedSentence.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args){
        String sentence="A man,a plan,a canal,Panama!";
        if(isPalindrome(sentence)){
            System.out.println("The sentence is a palindrome");
        }else{
            System.out.println("The sentence is not a palindrome");

        }
    }

}