package study.basic;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
    private Set<Integer> numbers;

    @BeforeEach
    void setUp() {
        numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
    }

    // Test Case 구현
    @Test
    void sizeTest() {
        //given
        int result = 3;
        //when
        int size = numbers.size();

        //then
        Assertions.assertThat(size).isEqualTo(result);
    }

    @Test
    void containNumbers() {
        numbers.forEach(item -> {
            Assertions.assertThat(numbers.contains(item)).isTrue();
        });
    }
    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    void parameterized(int number) {
        Assertions.assertThat(numbers.contains(number)).isTrue();
    }

    @ParameterizedTest
    @CsvSource(value = {"1:true", "2:true", "4:false"}, delimiter = ':')
    void toLowerCase_ShouldGenerateTheExpectedLowercaseValue(int input, boolean expected) {
        boolean result = numbers.contains(input);
        Assertions.assertThat(result).isEqualTo(expected);

    }
}
