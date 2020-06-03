import java.util.function.Predicate;
public class PredicateBasicExample {
    // predicate to funtion
    static void funWithPredArguement(int number, Predicate<Integer> predicate){
        System.out.println("Result according to predicate argument condition is: "+ predicate.test(number));
    }

    //predicate string and or operation
    public static Predicate<String> hasLengthOf10 = new Predicate<String>() {
        @Override
        public boolean test(String s) {
            return s.length()>10;
        }
    } ;

    public static void predicate_or() {
        Predicate<String > containLeeterA = p -> p.contains("A");
        String containsA = "And";
        boolean result = hasLengthOf10.or(containLeeterA).test(containsA);
        System.out.println(result);

    }
    public static void main(String[] args) {

        //simple example
        Predicate<Integer> lesserthan = i -> (i < 18);
        System.out.println(lesserthan.test(100));

        //predicate chaining
        Predicate<Integer> greaterthan10 = i->(i>10);
        Predicate<Integer> lessthan20 = i -> (i<20);
        boolean result = greaterthan10.and(lessthan20).test(34);
        System.out.println("Chaining result is : " + result);

        ////predicate to function example
        funWithPredArguement(10, i-> (i<5));

        ///predicate or & overriding predicate test function
        System.out.println("result of predicate of string type doing or : ");
        predicate_or();




    }
}
