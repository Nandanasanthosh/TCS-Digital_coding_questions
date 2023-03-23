import java.util.*;
public class Stock {
    public static void main(String [] args){
        int n,i,k;
        Scanner in = new Scanner(System.in);
        n=in.nextInt();//no.of companies
        k=in.nextInt();//amount invested
        int stocks[]=new int[n];
       
        for(i=0;i<n;i++)
        {
        stocks[i] =in.nextInt();
        }
        in.close();
        Arrays.sort(stocks);
        for(i=0;i<n/2;i++){
          if(stocks[n-1-i]>stocks[i]){
            stocks[n-1-i]-=k;
            stocks[i]+=k;
          }
        }
        Arrays.sort(stocks);
        System.out.print(stocks[n-1]-stocks[0]);
    }
}
