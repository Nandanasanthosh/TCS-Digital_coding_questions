import java.util.*;
public class Palindrome {
    public static void main(String [] args)throws Exception{

        int i;
        char [] resn=new char[20];
        Scanner in = new Scanner(System.in);
        char [] arr = new char[20];
        arr=in.next().toCharArray();
        in.close();
        int len=arr.length;
        Palindrome obj=new Palindrome();
        for(i=0;i<len;i++){
            resn= obj.res(arr,i,i);
            System.out.println(resn);
            resn= obj.res(arr,i,i+1);
            System.out.println(resn);
        }
        
    }
    char[] res(char [] ar,int l,int r){
        char [] resn=new char[20];int i,j=0;
        while(l>=0 && r<ar.length && ar[l]==ar[r]){
            for(i=l;i<=r;i++){
                j=0;
                resn[j]=ar[i];
                j++;
            }
            l-=1;
            r+=1;
        }
        return resn;
    }
}
class Result{
   
}
