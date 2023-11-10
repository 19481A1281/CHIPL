class Armstrong{
public static void main(String...args){
int n=153,sum=0,k=n;
int c=(int)Math.floor(Math.log10(n)+1);
while(n>0){
sum+=(int)Math.pow(n%10,c);
n/=10;
}
System.out.println(sum==k?"Armstrong number":"Not an Armstrong number");
}
}