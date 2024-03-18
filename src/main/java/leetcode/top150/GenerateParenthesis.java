package leetcode.top150;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
 * Example 1:
 *
 * Input: n = 3
 * Output: ["((()))","(()())","(())()","()(())","()()()"]
 * Example 2:
 *
 * Input: n = 1
 * Output: ["()"]
 *
 * 1 <= n <= 8
 *
 */
public class GenerateParenthesis {
    public static void main(String[] args) {
        int n= 3;
        System.out.println("input = "+n);
        List<String> list = generateParenthesis(n);
        System.out.println(list);
        System.out.println("=========================");

        n = 1;
        System.out.println("input = "+n);
        list= generateParenthesis(n);
        System.out.println(list);
        System.out.println("=========================");
    }
    public static List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        String open ="(";
        String close = ")";
        Stack<String> pStrings = new Stack<>();
        for(int i = 0 ; i< n; i++){
            pStrings.push(open);
        }

        return list;
    }
}
