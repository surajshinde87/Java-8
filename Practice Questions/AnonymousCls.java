/* Convert this anonymous class to Lambda:
Runnable r = new Runnable() {
    public void run() {
        System.out.println("Hello");
    }
};
*/

public class AnonymousCls {

    public static void main(String[] args) {
        Runnable r = () -> System.out.println("Hello Suraj");
        r.run();

    }
    
}