import java.util.*;
public class FairSequence {
    public static void main(String [] args){
    int n,i,sum=0;
    Boolean bool=true;
    Scanner in = new Scanner(System.in);
    n=in.nextInt();
    int num[]=new int[n];
    for(i=0;i<n;i++)
    {
    num[i] =in.nextInt();
    }
    in.close();

    if(num[0]>0){
        System.out.print(num[0]);
        for(i=0;i<n;i++)
        {
            if(num[i]>0){
                if(bool==true){
                    sum+=num[i];
                    
                    bool=false;
                }
            }
            else{
                if(bool==false){
                    sum+=num[i];
                   
                    bool=true;
                }
            }
        }
    }
    else{
        for(i=0;i<n;i++)
        {
            if(num[i]>0){
                if(bool==false){
                    sum+=num[i];
                    
                    bool=true;
                }
            }
            else{
                if(bool==true){
                    sum+=num[i];
                    
                    bool=false;
                }
            }
        }

    }
    System.out.print(sum);
}
}
