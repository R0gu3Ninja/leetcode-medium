package medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PhoneNumbers {
    static HashMap<String,String> phone = new HashMap<String,String>(){{
        put("2", "abc");
        put("3", "def");
        put("4", "ghi");
        put("5", "jkl");
        put("6", "mno");
        put("7", "pqrs");
        put("8", "tuv");
        put("9", "wxyz");
        }};
    static List<String> output = new ArrayList<String>();

    public static void generate(String combination,String remainingNumber){
        if(remainingNumber.length()==0)
            output.add(combination);
        else{
            String letters = phone.get(remainingNumber.substring(0,1));
            for(int i=0;i<letters.length();i++)
                generate(combination+letters.substring(i,i+1),remainingNumber.substring(1));
        }
    }

    public static void main(String[] args) {
        generate("","23");
        System.out.println(output);
    }
}
