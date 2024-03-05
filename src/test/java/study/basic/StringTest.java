package study.basic;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void splitTest1() {
        //given
        String actual = "a,b";
        //when
        String[] ret = actual.split(",");
        //then
        //배열로 반환하는 경우, containsExactly() 활용해 반환 값이 맞는지 검증
        assertThat(ret).contains("a");
        assertThat(ret).containsExactly("a","b");
    }

    @Test
    void splitTest2() {
        //given
        String actual = "b";
        //when
        String[] ret = actual.split(",");
        //then
        assertThat(ret).contains("b");
        assertThat(ret).containsExactly("b");
    }

    @Test
    void splitTest3() {
        //given
        String actual = "abc";
        int index = 1;
        char result = 'b';
        //when
        char character = actual.charAt(index);
        //then
        assertThat(character).isEqualTo(result);
    }

    @Test
    void splitTest4() {
        //given
        String actual = "abc";
        int index = 5;

        //when
       assertThatThrownBy(() -> {
           actual.charAt(index);
       }).isInstanceOf(IndexOutOfBoundsException.class).hasMessageContaining("String index out of range: 5");
        //then
        assertThatThrownBy(() -> {
            actual.charAt(index);
        }).isInstanceOf(IndexOutOfBoundsException.class).hasMessageContaining("String index out of range: 5");
    }
}
