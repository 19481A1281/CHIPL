class Automatic{
public static void main(String...args){
int n=6,sq=n*n,k=n,flag=1;
while(n>0){
if(sq%10!=n%10){
flag=1;
break;
}
else{
flag=0;
}
n/=10;
sq/=10;
}
System.out.println(flag==0?"Automatic":"Not an Automatic");
}
}