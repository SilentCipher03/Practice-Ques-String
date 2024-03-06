import java.lang.reflect.Array;
import java.util.*;
import java.util.Arrays;

public class PractiseQuesStrings {

    // Ques1 Count how many times lowercase vowels occurred in a String entered by the user
    public static int lowercasevowelsoccurred (String str){
        int count =0;
        for(int i =0; i< str.length(); i++){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
                count++;
            }
        }
        return count;
    }
    
    // Ques2 Determine if 2 Strings areanagramsof each other
    public static void Anagrams (String str, String str2){
        str = str.toLowerCase();
        str2 = str2.toLowerCase();

        if(str.length()== str2.length()){
            char strArr[] = str.toCharArray();
            char str2Arr[] = str2.toCharArray();

            Arrays.sort(strArr);
            Arrays.sort(str2Arr);

            boolean result = Arrays.equals(strArr,str2Arr);
            if(result){
                System.out.println(" They are Anagrams");
            }else{
                System.out.println("They are not Anagrams");
            }
        }else{
            System.out.println(" Not Anagrams ");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //Ques 1
        System.out.println(" Enter the string ");
        String str = sc.nextLine();
        System.out.println(lowercasevowelsoccurred(str));

        //Ques 2
        System.out.println("Enter First string to check anagram");
        String str2 = sc.nextLine();
        System.out.println("Enter Second string to chek Anagram");
        String str3 = sc.nextLine();
        Anagrams(str2,str3);



    }
}
