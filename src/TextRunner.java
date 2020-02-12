public class TextRunner {

    public static void main(String[] args) {
        LifeGrid lg = new LifeGrid(15,15);

        for(int i = 0; i < 20; i++){
            lg.place((int)(Math.random() * lg.rows()), (int)(Math.random() * lg.cols()));
        }

        System.out.println(lg);
        lg.next();
        System.out.println(lg);
    }
}
