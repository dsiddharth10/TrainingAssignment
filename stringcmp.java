import java.util.Scanner;
public class stringcmp {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s1 = new String();
        String s2 = new String();
        System.out.println("Enter two strings");
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        int len = 0,i,ch1=0,ch2=0,result=0;
        len = s1.length() < s2.length() ? s1.length() : s2.length();
        // System.out.println(len);
        for(i=0;i<len;i++) 
        {

            ch1 = s1.charAt(i);
            ch2 = s2.charAt(i);
            if(ch1>=65 && ch1<=90)
            {
                ch1+=32;
            }
            if(ch2>=65 && ch2<=90)
            {
                ch2+=32;
            }
            result = cmpTwoStrings(ch1,ch2);
            if(result == 0)
                continue;
            else
                break;
        }
        if(result==0) {
            if(s1.length()>s2.length())
                result=1;
            else if(s1.length()<s2.length())
                result=-1;
        }
        System.out.println(result);
    }
    static int cmpTwoStrings(int ch1, int ch2) {
        if(ch1<ch2)
            return -1;
        else if(ch1>ch2)
            return 1;
        else
            return 0;
    }
}