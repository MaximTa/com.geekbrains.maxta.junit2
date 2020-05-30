import com.geekbrains.maxta.junit2.MainApp;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainAppTests extends MainApp {
    private static Stream<Arguments> checkArrNumbers() {
        return Stream.of(
                Arguments.arguments(new int[] {1,1,1,4,4,1,4,1}, true),
                Arguments.arguments(new int[] {1,1,1,1,1,1}, false),
                Arguments.arguments(new int[] {4,4,4,4}, false),
                Arguments.arguments(new int[] {1,4,4,1,1,4,3}, false)
        );
    }
//hw4 task 2 (1&4)
    @ParameterizedTest
    @MethodSource (value = "checkArrNumbers")

     public void checkArrayNumbersTest (int[] arr, boolean res){
        assertEquals (res, arrayOnlyOnesAndFours(arr));
    }

}
