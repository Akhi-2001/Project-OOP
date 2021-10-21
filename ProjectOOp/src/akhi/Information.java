package akhi;
import java.util.Scanner;
public class Information {
    public void InformationInput()
    {
        for (int i=0; i<3; i++)
            System.out.println();

        System.out.println("Carefully enter valid information");

        Scanner input= new Scanner(System.in);
        System.out.print("Your name: ");
        String name = input.nextLine();
        System.out.print("Your date of birth: ");
        String dateOfBirth = input.nextLine();
        System.out.print("Your school name: ");
        String schoolName = input.nextLine();
        System.out.print("Your college name: ");
        String  collegeName = input.nextLine();
        System.out.print("Your division: ");
        String  division = input.nextLine();
        System.out.print("Your SSC passing year: ");
        int sscYear = input.nextInt();
        System.out.print("Your HSC passing year: ");
        int hscYear = input.nextInt();
        System.out.print("Your SSC GPA: ");
        double  sscGPA = input.nextDouble();
        System.out.print("Your HSC GPA: ");
        double  hscGPA = input.nextDouble();

    }

}
