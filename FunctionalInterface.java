import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

interface Drawable{
public void draw(int width);
}

public class FunctionalInterface 
{
    public static void main(String[] args) {

    List<String> names = Arrays.asList("Geek","GeeksQuiz","g1","QA","Geek2");
    Predicate<String> p = (s)->s.startsWith("G");
    BinaryOperator<Integer>
            op = BinaryOperator
                    .maxBy(
                        (a, b) -> (a > b) ? 1 : ((a == b) ? 0 : -1));

    System.out.println(op.apply(98, 11));

    for (String st:names)
    {
        if (p.test(st))
            System.out.println(st);
    }

    int width=10;
    Drawable d2 = (s)->{System.out.println("Draw width:"+width);};
    d2.draw(width);

    Function<Integer, Double> half = a -> a / 2.0;
    System.out.println(half.apply(10));

    }
}
