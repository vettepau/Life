public class TextRunner {

    public static void main(String[] args) {
        LifeGrid lg = new LifeGrid(15,10);

        lg.place(2,1);
        lg.place(2,2);
        lg.place(2,3);


        lg.place(0,5);
        lg.place(0,6);
        lg.place(0,7);
        lg.place(0,8);

        System.out.println(lg);
        lg.next();
        System.out.println(lg);
    }
}
