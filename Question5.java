import java.util.Scanner;

public class Question5{
	public static void main(String[] args){
		Scanner Sc=new Scanner(System.in);
		System.out.print("Enter number: ");
			int n =Sc.nextInt();
			
			int x=n/2;
			
            for(int i=1; i<=n; i++){
                if(i<=x){
                    System.out.println((x-i+1)+" ");
                }
                else{
                    if(i==x+1){
                        System.out.println(i+" ");
                    }
                    else{
                        System.out.println((n-i+x+2)+" ");
                    }
                }
            }
	}
}
