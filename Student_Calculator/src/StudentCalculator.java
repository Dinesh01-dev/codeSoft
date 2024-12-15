import java.util.Scanner;

public class StudentCalculator {

	public float cal(int s1,int s2,int s3,int s4,int s5,int s6) {
		float per=(float)(s1+s2+s3+s4+s5+s6)/6;
		return per;
	}
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		StudentCalculator stc=new StudentCalculator();
		System.out.println("------------------Student Marks Memo------------------");
		System.out.println("Enter the Marks of Subject 1::");
		
		int s1=s.nextInt();
		System.out.println("Enter the Marks of Subject 2::");
		int s2=s.nextInt();
		
		System.out.println("Enter the Marks of Subject 3::");
		int s3=s.nextInt();
		
		System.out.println("Enter the Marks of Subject 4::");
		int s4=s.nextInt();
		
		System.out.println("Enter the Marks of Subject 5::");
		int s5=s.nextInt();
		
		System.out.println("Enter the Marks of Subject 6::");
		int s6=s.nextInt();
		
		float sum=(s1+s2+s3+s4+s5+s6);
		System.out.println("----------Total Marks----------" + sum);
		
		System.out.println("===============================================");
		float percentage=stc.cal(s1, s2, s3, s4, s5, s6);
		System.out.println("Average percage of the Student : " + percentage);
		System.out.println("===============================================");
		
		
		if(percentage>50 && percentage<=59)
		{
			System.out.println("Grade C:"); 
		}
		else if(percentage>=60 && percentage<=69)
		{
			System.out.println("Grade B:"); 
		}
		else if(percentage>=70 && percentage<=79)
		{
			System.out.println("Grade B+:"); 
		}
		else if(percentage>=80 && percentage<=89)
		{
			System.out.println("Grade A:"); 
		}
		else if(percentage>=80 && percentage<=89)
		{
			System.out.println("Grade A+:"); 
		}
		else
		{
			System.out.println("FAIL........");
		}
		
		s.close();
	}
}
