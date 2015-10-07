package LeetCode;

import java.io.IOException;
import java.util.*;

/**
 * Created by Samarth on 3/22/2015.
 */
public class ValidParenthesis {
    public static void main(String[] args) throws IOException {
        System.out.println(isValid("()"));
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("(){{}"));
        System.out.println(isValid("[()]"));
        System.out.println(isValid("[[[}}"));
    }

    static boolean isValid (String input)
    {
        Map<Character, Character> charMap = new HashMap<Character, Character>();
        charMap.put ('(', ')');
        charMap.put ('{', '}');
        charMap.put ('[', ']');

        Stack<Character> stack = new Stack<Character>();

        for (int i=0; i<input.length(); i++)
        {
            if (charMap.containsKey(input.charAt(i)) )
            {
                stack.push(input.charAt(i));
            }
            else
            {
                if (charMap.get(stack.peek()) != input.charAt(i))
                {
                    return false;
                }
                else
                {
                    stack.pop();
                }
            }
        }

        return stack.empty();
    }
}
