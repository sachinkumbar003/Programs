import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter no");
	int no = sc.nextInt();
	int count = 0;
	for(int i =no; i<no; i++){
		if(i%no==0){
			count++;
		}
		
	}
	if(count==2){
		System.out.println(no + " is prime");
	}
	else{
		System.out.println(no + "not prime");
	}
	}
}

