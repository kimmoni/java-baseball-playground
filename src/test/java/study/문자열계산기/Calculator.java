package study.문자열계산기;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.CsvSource;
import 문자열계산기.CalcInput;

import java.util.Random;
import java.util.Scanner;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static 문자열계산기.Calculator.*;

public class Calculator {
    int num1;
    int num2;
    int num3;
    int num4;
    int num5;

    String input;
    @BeforeEach
    void settingNumber() {
        num1 = (int) Math.random();
        num2 = (int) Math.random();
        num3 = (int) Math.random();
        num4 = (int) Math.random();
        num5 = (int) Math.random();

        input = num1 + " " + num2 + " " + num3 + " " + num4 + " " + num5;
    }

    @Test
    void 입력테스트(){
        Assertions.assertThat(CalcInput.splitText(input)).isNotEmpty();
    }

    @Test
    void 입력테스트2(){
        Assertions.assertThatThrownBy(() -> {
            CalcInput.splitText(null);
        }).isInstanceOf(NullPointerException.class);
    }

    @Test
    void 인풋테스트() {
        Assertions.assertThat(CalcInput.splitText(input)).containsExactly(input.split(" "));
    }

    @Test
    void 더하기테스트() {
        int answer = num1 + num2;

        double ret = plus(num1, num2);
        Assertions.assertThat(ret).isEqualTo(answer);
    }

    @Test
    void 빼기테스트() {
        int answer = num1 = num2;

        double ret = minus(num1, num2);
        Assertions.assertThat(ret).isEqualTo(answer);
    }

    @Test
    void 곱하기테스트() {
        int answer = num1 * num2;

        double ret = multiply(num1, num2);
        Assertions.assertThat(ret).isEqualTo(answer);
    }

    @Test
    void 나누기테스트() {
        int answer = 3 / 1;

        double ret = divide(3, 1);
        Assertions.assertThat(ret).isEqualTo(answer);
    }

    @Test
    void 나누기테스트_0() {
        assertThatThrownBy(() -> {
            divide(3, 0);
        }).isInstanceOf(ArithmeticException.class);

    }
}
