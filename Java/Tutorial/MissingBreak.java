class MissingBreak{
public static void main(String args[]){
for(int i=0;i<6;i++){
switch(i){
case 0:
case 1: 
System.out.println("i is less than 2");
break;
case 2:
case 3:
System.out.println("i is less than 4");
break;
default:
System.out.println("i is 4 or more");
}
}
}
}