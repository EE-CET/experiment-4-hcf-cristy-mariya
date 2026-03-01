import java.util.Scanner;
public class HCF {
    
        private static int hcf(int a,int b){
              if(b==0)
                 { return a;}
              return hcf(b,a%b);
    }
      public static void main(String[] args){
               Scanner sc=new Scanner(System.in);
               int a=sc.nextInt();
               int b=sc.nextInt();
               System.out.print(hcf(a,b));
}
      
}
