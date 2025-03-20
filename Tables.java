import java.util.Scanner;
class Tables{
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
int n=in.nextInt();
int e=in.nextInt();
int t=in.nextInt();
while(n<=e){
System.out.println(n+" * "+t+" = "+(n*t));
n++;
        }
    }
}