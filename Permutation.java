import java.util.*;

public class Permutation {

    public static void main(String args[]) throws Exception
    {
        String input = "aab";
        List<String> perms = getPermutations(input);

        printPermutations(perms);

    }

    static List<String> getPermutations(String input)
    {
        List<String> perms = new ArrayList<String>();

        if (input.length() == 1)
        {
            String perm = "" + input.charAt(0);
            //System.out.println(perm);
            perms.add(perm);
        }
        else
        {
            List<String> permsRecur = getPermutations(input.substring(1));

            for (String perm : permsRecur)
            {
                // Insert at every position of the string
                String permToAdd = input.charAt(0) + perm.substring(0);
                perms.add(permToAdd);
                for (int i=1; i<=perm.length(); i++)
                {
                    perms.add(perm.substring(0, i) + input.charAt(0) + perm.substring(i));
                }
            }
        }
        return perms;
    }

    static void printPermutations(List<String> perms)
    {
        for (String perm : perms)
        {
            System.out.println(perm);
        }
    }
}
