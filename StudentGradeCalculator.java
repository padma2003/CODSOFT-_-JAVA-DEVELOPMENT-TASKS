import java.util.Scanner;

public class StudentGradeCalculator {
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int no_of_subjects,i,total_marks=0,marks_obtained,total_marks_in_curriculum;
        double avg_percent;
        System.out.println("Enter the Number of Subjects in the Student's Curriculum");
        no_of_subjects = sc.nextInt();
        total_marks_in_curriculum = no_of_subjects * 100;

        for (i=1;i<=no_of_subjects;i++)
        {
            System.out.println("Enter the marks for the subject-"+i+" obtained by the Student");
            marks_obtained = sc.nextInt();
            total_marks = total_marks + marks_obtained;
        }

        avg_percent = (total_marks / no_of_subjects);

        if(avg_percent >= 90)
        {
            System.out.println();
            System.out.println("DISPLAYING THE STUDENT RESULTS : ");
            System.out.println("Total marks of the Student : "+total_marks+" out of "+total_marks_in_curriculum);
            System.out.println("The Average percentage scored by the student is : "+avg_percent);
            System.out.println("Grade obtained by the Student : A");
            System.out.println();
        }
        else if (avg_percent >= 80 && avg_percent < 90)
        {
            System.out.println();
            System.out.println("DISPLAYING THE STUDENT RESULTS : ");
            System.out.println("Total marks of the Student : "+total_marks+" out of "+total_marks_in_curriculum);
            System.out.println("The Average percentage scored by the student is : "+avg_percent);
            System.out.println("Grade obtained by the Student : B");
            System.out.println();
        }
        else if (avg_percent >= 70 && avg_percent < 80)
        {
            System.out.println();
            System.out.println("DISPLAYING THE STUDENT RESULTS : ");
            System.out.println("Total marks of the Student : "+total_marks+" out of "+total_marks_in_curriculum);
            System.out.println("The Average percentage scored by the student is : "+avg_percent);
            System.out.println("Grade obtained by the Student : C");
            System.out.println();
        }
        else if (avg_percent >= 60 && avg_percent < 70)
        {
            System.out.println();
            System.out.println("DISPLAYING THE STUDENT RESULTS : ");
            System.out.println("Total marks of the Student : "+total_marks+" out of "+total_marks_in_curriculum);
            System.out.println("The Average percentage scored by the student is : "+avg_percent);
            System.out.println("Grade obtained by the Student : D");
            System.out.println();
        }
        else if (avg_percent >= 50 && avg_percent < 60)
        {
            System.out.println();
            System.out.println("DISPLAYING THE STUDENT RESULTS : ");
            System.out.println("Total marks of the Student : "+total_marks+" out of "+total_marks_in_curriculum);
            System.out.println("The Average percentage scored by the student is : "+avg_percent);
            System.out.println("Grade obtained by the Student : E");
            System.out.println();
        }
        else
        {
            System.out.println();
            System.out.println("DISPLAYING THE STUDENT RESULTS : ");
            System.out.println("Total marks of the Student : "+total_marks+" out of "+total_marks_in_curriculum);
            System.out.println("The Average percentage scored by the student is : "+avg_percent);
            System.out.println("Grade obtained by the Student : FAIL ");
            System.out.println();
        }
    }
}
