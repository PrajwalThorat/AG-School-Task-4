import java.util.Scanner;
public class AGSchoolTask4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Number Of Student : ");
        int noOfStudent = scanner.nextInt();


        String[] Name = new String[noOfStudent];
        String[] rollNumber = new String[noOfStudent];
        int[] Math = new int[noOfStudent];
        int[] Science = new int[noOfStudent];
        int[] English = new int[noOfStudent];
        int[] Language = new int[noOfStudent];
        int[] socialStudies = new int[noOfStudent];
        double[] totalMarks = new double[noOfStudent];
        double[] average = new double[noOfStudent];

        for(int i=0 ; i<noOfStudent ; i++){
            System.out.println("Enter the "+(i+1)+" Student Details");
            System.out.print("Enter the Name       : ");
            Name[i] = scanner.next();
            System.out.print("Enter the Roll Number : ");
            rollNumber[i] = scanner.next();
            System.out.println("Enter the Marks of the Student out of 100");
            System.out.println("Subject    Max. Marks       Marks Obtains");
            System.out.print(" Math           100                ");
            Math[i] = scanner.nextInt();
            System.out.print("Science         100                ");
            Science[i] = scanner.nextInt();
            System.out.print("English         100                ");
            English[i] = scanner.nextInt();
            System.out.print("Language        100                ");
            Language[i] = scanner.nextInt();
            System.out.print("Social Studies  100                ");
            socialStudies[i] = scanner.nextInt();
            System.out.println("--------------------------------------");
            totalMarks[i] = Math[i] + Science[i] + English[i] + Language[i] + socialStudies[i];
            System.out.println("Total           600                "+totalMarks[i]);
            average[i] = totalMarks[i]/5;
            System.out.println("Average        : "+average[i]);
        }
        for(int avg=100 ; avg>=10 ; avg=avg-10){
            System.out.print(avg+" ");
            for(int i=0 ; i<noOfStudent ; i++){
                if(avg<average[i]){
                    System.out.print(" * ");
                }
            }System.out.println();
        }
        System.out.println("---------------------------------");
        for(int i=1;i<=noOfStudent;i++)
        {
             System.out.print(i+"  ");
        }

    }    
}