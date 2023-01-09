abstract class car {
    abstract void run();
}

class Montero extends car {
    public void run() {
        System.out.println();
        System.out.println();
        System.out.println(" Montero has a new Model !");
        System.out.println();
        System.out.println();
    }
}

public class abstractionFinals {

    public static void main(String[] args) {
        Montero m = new Montero();
        m.run();
    }
}