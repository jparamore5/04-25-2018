
public class last {
public static void main(String[]args) {

int [] array = {5,2,8,23,14};
int [] array2 = {67,32,7,4,6};
int sum = 0; 
int [] answer = new int[4]; 


for (int i=0;i<5;i++) {
answer[i] = array[i]+ array2[i];
System.out.print(answer[i]);
}
}
}