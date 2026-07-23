public class Prob7 {
    public static void main(String[] args)
    {
        String s="Hello";
        int c=0;
        for(char ch:s.toLowerCase().toCharArray())
            if(ch>='a'&&ch<='z'&&"aeiou".indexOf(ch)==-1) c++;
        System.out.println(c);
    }
    
}
