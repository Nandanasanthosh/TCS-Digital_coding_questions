import java.util.*;
public class Palindrome {
    public static void main(String [] args)throws Exception{

        int i,resl=0;
        Scanner in = new Scanner(System.in);
        char [] arr = new char[20];
        arr=in.next().toCharArray();
        in.close();
        int len=arr.length;
        Palindrome obj=new Palindrome();
        for(i=0;i<len;i++){
            resl=resl + obj.res(arr,i,i);
            resl=resl + obj.res(arr,i,i+1);
        }
        System.out.println(resl);
    }
    int res(char [] ar,int l,int r){
        int resl=0;
        while(l>=0 && r<ar.length && ar[l]==ar[r]){
            resl+=1;
            l-=1;
            r+=1;
        }
        return resl;
    }
}
class Result{
   
}
