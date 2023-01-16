import java.util.Scanner;

public class NumberSelect {
    public static int get(int first, int last)
    {
        int number;
        Scanner scanner = new Scanner(System.in);
        while(true)
        {
            System.out.print("Select the number: ");
            if(scanner.hasNextInt()) {
                number = scanner.nextInt();
                if(number >= first && number <= last) {
                    break;
                }
                else {
                    System.out.println("Invalid, try again");
                }
                scanner.nextLine();
            }else {
                System.out.println("Invalid, try again");
                scanner.nextLine();
            }
        }
        return number;
        //scanner.close();
    }
}
