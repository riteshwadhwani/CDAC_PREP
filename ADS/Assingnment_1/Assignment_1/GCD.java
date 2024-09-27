import java.util.Scanner;

class GCD{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int itr;
		if(a>b){
			itr = a;
		}
		else{
			itr = b;
		}
		int value = 1;
		for(int i =2;i<itr;i++){
			if(a%i == 0 && b%i ==0){
				value *=i;
			}
		}
		System.out.println("value" + value);
	}
}