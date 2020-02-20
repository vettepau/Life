import java.util.Scanner;

public class TextRunner {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Width: ");
        int width = scan.nextInt();
        System.out.print("Height: ");
        int height = scan.nextInt();

        LifeGrid lg = new LifeGrid(width,height);

        while(true)
        {
            System.out.println(lg);
            System.out.println("Enter an option:");
            System.out.println("0: exit");
            System.out.println("1: change");
            System.out.println("2: next");
            System.out.println("3: back");
            int option = scan.nextInt();
            if(option == 0)
                break;
            else if (option == 1) {
                System.out.print("Enter a row: ");
                int row = scan.nextInt();
                System.out.print("Enter a col: ");
                int col = scan.nextInt();
                lg.change(row,col);
            } else if (option == 2) {
                lg.next();
            }
            else if (option == 3) {
                lg.back();
            }
        }
        System.out.println("Goodbye.");


    }


}
