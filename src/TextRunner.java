import java.util.Scanner;

public class TextRunner extends LifeGrid{

    TextRunner(int w, int h) {
        super(w, h);
    }

    @Override
    protected void update() {
        System.out.println(this);
    }

    public static void main(String[] args) {
        LifeGrid lg = new TextRunner(15,10);

        lg.place(2,1);
        lg.place(2,2);
        lg.place(2,3);


        lg.place(0,5);
        lg.place(0,6);
        lg.place(0,7);
        lg.place(0,8);

        Scanner scan = new Scanner(System.in);

        while (true)
        {
            System.out.println("Enter a command: ");
            String command = scan.next().toLowerCase();
            if(command.equals("start"))
                lg.start();
            else if (command.equals("stop"))
                lg.stop();
            else
                System.out.println("Command not recognized.");
        }
    }


}
