//TechnlogyNumber
import java.util.*;
class Technology{
public static void main(String...args){
Scanner s=new Scanner(System.in);
int n=9801,sum=0,r=0,t=n,sum2=0,n1=0,n2=0,c1=0,c=0;
System.out.println(n);
c=(int)Math.floor(Math.log10(n)+1);
while(n>0){
r=n%10;
sum=sum*10+r;
n/=10;
}
System.out.println(sum);

while(sum>0 && c1<c/2){
r=sum%10;
n1=n1*10+r;
sum/=10;
c1++;
}
System.out.println(n1);
c1=0;
while(sum>0 && c1<c/2){
r=sum%10;
n2=n2*10+r;
sum/=10;
c1++;
}
System.out.println(n2);
sum2=n1+n2;
System.out.println(sum2);
int sum2sq=sum2*sum2;
System.out.println(sum2sq);
System.out.println(t==sum2sq?"Technology Number":"Not a Technology Number");
}
}