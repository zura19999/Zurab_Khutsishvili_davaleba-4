package demo2;

public class Main {
    public static void main(String[] args) {

        Sumable cs = (x, y) -> x+y;
        System.out.println(cs.sum(3,4));

    }
}