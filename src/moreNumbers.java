import java.util. Scanner;
public class moreNumbers {
public static void main (String[]args) {
Scanner scan = new Scanner(System.in);
System.out.print("Enter 9 numbers");
int num []= new int [9];
num[0] = scan.nextInt();
num[1] = scan.nextInt();
num[2] = scan.nextInt();
num[3] = scan.nextInt();
num[4] = scan.nextInt();
num[5] = scan.nextInt();
num[6] = scan.nextInt();
num[7] = scan.nextInt();
num[8] = scan.nextInt();
int sum = 0; 


for (int i=0;i<9;i++) {
sum = sum + num[i];// add all the numbers to sum 
	
}
System.out.println(sum);
	
	
	
	
}


}
