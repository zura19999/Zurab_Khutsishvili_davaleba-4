package demo3;

public class Main {
    public static void main(String[] args) {
        IphoneX iphonex = new IphoneX();
        SamsungNote samsungnote = new SamsungNote();
        Nokia nokia = new Nokia();
        Panasonic panasonic = new Panasonic();

        printSmartphone(iphonex);
        printSmartphone(samsungnote);
        printSimbian(nokia);
        printSimbian(panasonic);
    }

    public static<E extends Smartphone> void printSmartphone(E e) {
        System.out.println(e);
    }

    public static<E extends Simbian> void printSimbian(E e) {
        System.out.println(e);
    }
}