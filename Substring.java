import java.util.*;
public class Substring
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        String s=in.next();
        String s1="";
        String temp="";
        int i,j,len=0;
        for(i=0;i<s.length();i++)
        {
            for(j=i+1;j<=s.length();j++)
            {
                s1=s1+s.substring(i,j)+" ";                //Forms substring and appends each substring in s1
            }
        }
        String[] s3=s1.split(" ");                           //Splits the appended string s1
        for(i=0;i<s3.length;i++)
        {
            for(j=0;j<s3[i].length();j++)
            {
                if(temp.indexOf(s3[i].charAt(j))==-1)
                {
                   temp=temp+s3[i].charAt(j);       //Checks for duplicate charracters
                }
            }
            if(temp.length()>len)
            {
                len=temp.length();                       //Checks for maximum length 
            }
        }
        System.out.print(len);                          //Prints the maximum length
   }
}