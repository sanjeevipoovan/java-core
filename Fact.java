import java.util.Scanner;
public class Fact{
public static void main(String[]args){
Scanner in=new Scanner(System.in);
int n=in.nextInt();
int fact=1;
for(int i=1;i<=n;i++){
 fact *=i;
}
System.out.println(fact);
}
}