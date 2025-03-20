import java.util.Scanner;
public class Sum_num{
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
int n=in.nextInt();
int result=0;
for(int i=1;i<=n;i++){
if(i%2==0)
result=result+i;
}
System.out.println(result);  
}
}