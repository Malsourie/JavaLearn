package holding.exercise;

import net.mindview.util.Stack;

public class Exercise15 {
    public static void main(String[] args) {
        final String s = "+U+n+c---+e+r+t---+a-+i-+n+t+y---+-+r+u--+l+e+s---";
        Stack<Character> cs = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char symbol = s.charAt(i);
            if (symbol == '+') {
                cs.push(s.charAt(++i));
            }
            else if (symbol == '-') {
                System.out.print(cs.pop());
            }
        }
    }
}
