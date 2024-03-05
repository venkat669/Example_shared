import java.util.*;

public class leetcode75_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the strings : ");
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        int i = 0;
        StringBuilder str = new StringBuilder();
        while (i < str1.length() || i < str2.length()) {
            if (i < str1.length())
                str = str.append(str1.charAt(i));
            if (i < str2.length())
                str = str.append(str2.charAt(i));
            i++;
        }
        System.out.print(str.toString());
    }

}

/*
 * Input: word1 = "abcd", word2 = "pq"
 * Output: "apbqcd"
 * Explanation: Notice that as word1 is longer, "cd" is appended to the end.
 * word1: a b c d
 * word2: p q
 * merged: a p b q c d
 */