class Evil{
public static void main(String...args){
int n=9,sq=n*n,sum=0;
while(sq>0){
sum+=sq%10;
sq/=10;
}
System.out.println(sum==n?"Evil number":"Not an Evil number");
}
}