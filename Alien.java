//AlienNumber Program1 ok

class Alien{
public static void main(String...args){
int n1=12,sq1=n1*n1,n2=0,sq2=0,sq2rev=0;;
while(n1>0){
n2=n2*10+n1%10;
n1/=10;
}
sq2=n2*n2;
while(sq2>0){
sq2rev=sq2rev*10+sq2%10;
sq2/=10;
}
System.out.println(sq1==sq2rev?"Alien Number":"Not an Alien Number");
}
}