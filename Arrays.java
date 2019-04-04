import java.util.*;
class Arrays{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		
		System.out.print("Input number of students : " );
		final int N=input.nextInt();
		
		//1. Create an array named "marks" to to students marks
		int[] marks=new int[N];
		
		//2. Read marks (Random numbers 0 to 100)
		Random r=new Random();
		for (int i = 0; i < N; i++){
			marks[i]=r.nextInt(101);
		}
				
		//3. Find total marks
		int total=0;
		for (int i = 0; i < N; i++){
			total+=marks[i];
		}
		
		//4. Find maximum marks
		int max=marks[0];
		for (int i = 1; i < N; i++)	{
			if(marks[i]>max){
				max=marks[i];
			}
		}
		
		//5. find minimum marks
		int min=marks[0];
		for (int i = 1; i < N; i++){
			if(marks[i]<min){
				min=marks[i];
			}
		}
		
		//6. print marks 
		System.out.print("[");
		for (int i = 0; i < N; i++){
			System.out.print(marks[i]+", ");
		}
		System.out.println("\b\b]");
		
		
		System.out.println("Total : "+total);
		System.out.println("Max   : "+max);
		System.out.println("Min   : "+min);
	}
}
