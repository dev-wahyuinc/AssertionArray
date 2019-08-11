import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class ArrayViewTest {

    @Test
    void getNumbersList() {
        ArrayView arr = new ArrayView();
        List<Integer> numbersListTest = Arrays.asList(1, 2, 3, 4, 5, 6);
        assertEquals(numbersListTest, arr.getNumbersList());
    }
}