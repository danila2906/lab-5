public class ExampleThird {
    public static void start() {
        OverloadDemo1 ob = new OverloadDemo1();
        int i=88;

        ob.test();
        ob.test(10,20);
        ob.test(i);
        ob.test(123.2);
    }
}
