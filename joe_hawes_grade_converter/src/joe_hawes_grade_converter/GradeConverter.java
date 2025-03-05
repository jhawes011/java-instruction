package joe_hawes_grade_converter;

import java.util.Scanner;

public class GradeConverter {

	public static void main(String[] args) {
		System.out.println("-----Welcome to the grade converter--------\n");
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y"))
		{
		int numGrade = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter numerical grade: ");
		numGrade = sc.nextInt();
		
		
		sc.nextLine();
		
		
		if (numGrade <= 100 && numGrade >=90)
		{
			System.out.println("A");
		}
		else if (numGrade <= 89 && numGrade >=80)
		{
			System.out.println("B");
		}
		else if (numGrade <= 79 && numGrade >=70)
		{
			System.out.println("C");
		}
		else if (numGrade <= 69 && numGrade >=60)
		{
			System.out.println("D");
		}
		else 
		{
			System.out.println("F");
		}
		System.out.print("Go again?");
		choice = sc.nextLine();
		}
		
		System.out.println("----------Goodbye------------");
	}

}
