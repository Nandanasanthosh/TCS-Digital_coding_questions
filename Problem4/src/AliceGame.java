import java.util.*;
public class AliceGame {
    public static void main(String [] args){
        int n,i,j,point=0;
        Scanner in = new Scanner(System.in);
        n=in.nextInt();
        int num[]=new int[n];
        int numscore[]=new int[n];
        for(i=0;i<n;i++)
        {
        num[i] =in.nextInt();
        }
        in.close();
        for(i=0;i<n;i++){
            point=0;
            for(j=i+1;j<n;j++){
                if(num[i]<num[j]){
                    point+=1;
                }
            }
            numscore[i]=point+1;;
        }
        Arrays.sort(numscore);
        int max=numscore[n-1];
        System.out.print(max);
    }
    
}
