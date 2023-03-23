import java.util.*;
public class Complete {
    public static void main(String [] args){
        int n,i,k,j;
        char tmp='\0',tmp1='\0';
        Scanner in = new Scanner(System.in);
        char wr1[]=new char[25];
        wr1=in.next().toCharArray();
        n=wr1.length;
        char wr3[]=new char[50];
        char wr2[]=new char[25];
        wr2=in.next().toCharArray();
        in.close();
        k=wr2.length;
        for(i=0;i<k;i++){
            if(wr1[i]!=wr2[i]){
                wr3[i]=wr2[i];
                tmp=wr1[i];
                wr1[i]=wr2[i];
                for(j=i+1;j<=n;j++){
                    tmp1=wr1[j];
                    wr1[j]=tmp;
                    tmp=tmp1;

                }
            }
            else{
                wr3[i]=wr1[i];
            }
        }
        boolean cmp=Arrays.equals(wr1,wr2);
        if(cmp==true){
            System.out.print("Possible");
        }
        else{
            System.out.print("Not Possible");
        }
    }
}
