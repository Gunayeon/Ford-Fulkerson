import java.util.Scanner;

public class Matrix  {
    public static int main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n= sc.nextInt();
        int[][]C=new int[50][50];
        int[]d=new int[30];

        for(int i=1;i<=n;i++){
            int[]A=new int[40];
            A[i]=d[i-1]*d[i];
        }
        System.out.print("연속된 행렬 입력:");
        for(int i=1;i<=n;i++){
            d[i-1]= sc.nextInt(); d[i]= sc.nextInt();
        }

       for(int i=1;i<=n;i++){
           C[i][i]=0;
       }
       for(int L=1;L<n;L++){
           for(int i=1;i<n;i++){
               int j=i+L;
               C[i][j]=987654321;
               for(int k=i;k<j;j++){
                   int temp=C[i][k]+C[k+1][j]+d[i-1]*d[k]*d[j];
                   if(temp<C[i][j])
                       C[i][j]=temp;
               }
           }
       }
       int op= C[1][n];

       System.out.println("최소 곱셈 횟수:"+op);
       return 0;
    }
}
