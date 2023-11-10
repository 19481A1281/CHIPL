class Palindrome{
public static void main(String...args){
int n=131,sum=0,k=n;
while(n>0){
sum=sum*10+n%10;
n/=10;
}
System.out.println(sum==k?"Palindrome":"Not a Palindrome");
}
}