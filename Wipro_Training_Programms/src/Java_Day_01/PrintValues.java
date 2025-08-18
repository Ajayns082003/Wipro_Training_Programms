package Java_Day_01;

public class PrintValues {
    public static void main(String[] args) {
        System.out.println("You passed " + args.length + " args.");
        for (int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "] = " + args[i]);
        }
    }


}
