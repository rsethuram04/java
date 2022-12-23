import java.util.Scanner;
import java.util.LinkedList;
import java.util.ArrayList;
class sethu
{
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str =sc.nextLine();
       // mano mo = new mano();
        mano.splitting(str);
    }
}

class mano
{
    public static void splitting(String str)
    {
        LinkedList<String> lnk = new LinkedList<String>();
        str =str+">";
        int len = str.length();
        int i;
        String str1="";
        for(i=0;i<len;i++)
        {
            if((str.charAt(i)>=65 && str.charAt(i)<=90) || (str.charAt(i)>=97 && str.charAt(i)<=122) )
            {
                str1=str1+str.charAt(i);


            }
            else
            {
                if(str1.isEmpty()!=true)
                lnk.add(str1);
                str1="";
            }

        }
        int y;
        
        System.out.println(y=lnk.size());
        for (String string : lnk) {
            System.out.println(string);
        }


    }
}