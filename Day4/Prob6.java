public class Prob6 {
      public static void main(String[] args)
    {
        String s="Education";
        int c=0;
        for(char ch:s.toLowerCase().toCharArray())
            if("aeiou".indexOf(ch)!=-1) c++;
        System.out.println(c);
    }
}
