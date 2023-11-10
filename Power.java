class Power{
public static void main(String...args){
int n=132,sum=0,p=1,r=0;
while(n>0){
r=n%10;
sum+=r;
p=p*r;
n/=10;
}
System.out.println(p==sum?"Power Number":"Not a power Number");
}
}