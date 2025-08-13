import java.util.Scanner;
public class task2 {
    public static void main(String[] args) {
        Scanner Scanner= new Scanner(System.in);
        System.out.println("Enter your marks in the subjects respectively:\n English:\n Physics:\n Chemistry:\n Maths:\n Art: ");
        int english= Integer.valueOf(Scanner.nextInt());
        int physics= Integer.valueOf(Scanner.nextInt());
        int chemistry= Integer.valueOf(Scanner.nextInt());
        int maths= Integer.valueOf(Scanner.nextInt());
        int art= Integer.valueOf(Scanner.nextInt());
        int marks= english+ physics+chemistry+maths+art;
        System.out.println("Total marks are: "+ marks);
        double average= marks/5.0;
        System.out.println("Percentage is: "+ average);
        if( average>=90){
            System.out.println("Grade A");
        }
        else if( average>=80){
            System.out.println("Grade B");
        }
        else if( average>= 70){
            System.out.println("Grade C");
        }
        else{
            System.out.println("Grade D");
        }
    }
}
