import org.example.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CalculatorTest {

    private final Calculator calculator = new Calculator();
    @BeforeEach
    @Test
    void check_if_add_method_return_positive_number() {

        Assertions.assertEquals(4, calculator.add(2,2));
    }
    @Test
    void check_if_sub_method_return_positive_number() {

        Assertions.assertEquals(2, calculator.sub(6,4));

    }

    @ParameterizedTest
    @MethodSource("argumentsStream")
    void adding(int a, int b, int c){
        Assertions.assertEquals(c,calculator.add(a,b));
    }
    private static Stream<Arguments> argumentsStream(){
        return Stream.of(
                  Arguments.of(2,2,4),
                  Arguments.of(5,5,10),
                  Arguments.of(30,15,45),
                  Arguments.of(20,10,30)
        );
    }

}
