import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Integer n = sc.nextInt();
		for(int i=1;i<10;i++){
			System.out.println("%d x %d = %d",i,n,i*n);
		}
	}
}
