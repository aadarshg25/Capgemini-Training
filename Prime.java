import java.util.*;

class Prime{
	public static Boolean isPrime(int a){

	if(a <2){
		return false;
		}
	for(int i=2;i<=Math.sqrt(a);i++){
		if(a%i ==0){
			return false;
			}
		}
	return true;
	}
	public static void main(String[]args){
		int arr[] = new int[5];
		Scanner sc = new Scanner(System.in);
		for(int i =0;i<5;i++){
			arr[i] = sc.nextInt();
			}
	for(int i =0;i<5;i++){
		if(isPrime(arr[i])){
			System.out.println(arr[i]);
			}
		}
		
	}
}