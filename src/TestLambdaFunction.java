public class TestLambdaFunction {
    interface interface1{
        int operation(int x, int y);
    }
    interface  interface2{
        void sayMessage(String message);
    }
    private int operate(int a, int b, interface1 fobj)
    {
        return fobj.operation(a, b);
    }

    public static void main(String[] args) {
        interface1 add = (int x, int y)-> x+y;
        interface1 multiply = (int x, int y) -> x*y;
        TestLambdaFunction test = new TestLambdaFunction();
        System.out.println("Addition is" + test.operate(4,5,add));
        System.out.println("Multiplication is" + test.operate(4,5,multiply));
        interface2 sayHello = message -> System.out.println("hello: " +  message);
        sayHello.sayMessage("Tathagat");

    }

}
