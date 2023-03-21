import java.util.*;

public class Direction {
    public static void main(String [] args)throws Exception{

        int i,res=0,resl=0;
        Scanner in = new Scanner(System.in);
        char [] arr = new char[20];
        arr=in.next().toCharArray();
        in.close();
        int len=arr.length;
        for(i=0;i<len;i++){
            if(arr[i]=='N' || arr[i]=='n'){
                res=res+1;
            }
            if(arr[i]=='S' || arr[i]=='s'){
                res=res-1;
                
            }
            if(arr[i]=='E' || arr[i]=='e'){
                resl=resl+1;
            }
            if(arr[i]=='W' || arr[i]=='w'){
                resl=resl-1;
            }
        }
        if(res==0 && resl==0){
            System.out.print("Returned successfully");
        }
        else
        {
            System.out.print("Not returned successfully");
        }
    }
}
