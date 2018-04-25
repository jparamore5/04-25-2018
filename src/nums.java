import java.util.Scanner; 
public class nums {
public static void main(String[]args){

Scanner scan = new Scanner (System.in);
System.out.println("Enter 5 numbers ?");
int num [] = new int [4];
 num[0] = scan.nextInt();
 num[1] = scan.nextInt();
 num[2]  = scan.nextInt();
 num[3]  = scan.nextInt();
 num[4] = scan.nextInt();

for (int i=0;i<5;i++) {
	if (num[i]% 5 ==0 && num[i]%4==0 && num[i]<10) {
System.out.println(num[i]);
}else {
	System.out.println("Not divisiable by 5 or greater than 10");
}
	


	
}
}
}