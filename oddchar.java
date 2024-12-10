import java.util.*;
class oddchar{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String a=s.nextLine();
        String ans=" ";
        for(int i=1;i<a.length();i+=3)
        {
            ans+=a.charAt(i);
        }
        System.out.println(ans);
        }
    }/*  sumanth
           un    */ 