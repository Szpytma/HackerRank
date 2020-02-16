import java.util.Scanner;

/*
* Two strings, a and b, are called anagrams if they contain all the same characters in the same frequencies.
* For example, the anagrams of CAT are CAT, ACT, TAC, TCA, ATC, and CTA.
* Complete the function in the editor.
* If  and  are case-insensitive anagrams, print "Anagrams"; otherwise, print "Not Anagrams" instead.
* */

public class Solution {

    static boolean isAnagram(String a, String b) {
        if(a==null && b== null) return false;
        assert a != null;
        String aa = a.toLowerCase().trim();
        String bb = b.toLowerCase().trim();

        boolean rtn = true;

        while(!aa.isEmpty()){
            char temp = aa.charAt(0);
            aa = aa.replaceFirst(temp+"","");
            bb = bb.replaceFirst(temp+"","");
            if (aa.length()!=bb.length()){
                rtn = false;
                break;
            }

        }
        return rtn;
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}


