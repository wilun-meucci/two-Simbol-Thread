public class App {
    public static void main(String[] args) throws Exception {
        thread1 t1 = new thread1("#", 15);
        thread1 t2 = new thread1("@", 23);
        System.out.println("----Main-----");
        t1.run();

        t2.run();
        System.out.println("\n----Main-----");
    }
}
