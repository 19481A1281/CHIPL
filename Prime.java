class Prime{
public static void main(String...args){
int n=19,c=0;
for(int i=2;i<n;i++){
if(n%i==0){
c++;
break;
}
}
System.out.println(c==0?"Prime Number":"Not a Prime Number");
}
}
