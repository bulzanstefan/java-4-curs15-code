package ro.fasttrackit.curs15;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTest {
    Calculator calculator;

    @BeforeEach
    void setup() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("WHEN add two numbers THEN their sum is returned")
    void testAdd() {
        //GIVEN
        //WHEN
        int received = calculator.add(3, 5);
        //THEN
        assertThat(received).isEqualTo(8);
    }

    @Test
    @DisplayName("WHEN add two numbers THEN their sum is returned")
    void testAdd2() {
        //GIVEN
        //WHEN
        int received = calculator.add(31, 55);
        //THEN
        assertThat(received).isEqualTo(86);
    }

    @Test
    @DisplayName("WHEN two numbers substract THEN their difference is returned")
    void testSub() {
        //GIVEN
        //WHEN
        int received = calculator.substract(10, 3);
        //THEN
        assertThat(received).isEqualTo(7);
    }

    @Test
    @DisplayName("WHEN two numbers substract THEN their difference is returned")
    void testSub2() {
        //GIVEN
        //WHEN
        int received = calculator.substract(100, 3);
        //THEN
        assertThat(received).isEqualTo(97);
    }

    //div(a,b) : "<catul> rest:<restul>"  div(7,4)="1 rest:3"
    @Test
    @DisplayName("WHEN two numbers div THEN <div> rest:<remaining> is returned")
    void testDiv() {
        //GIVEN
        //WHEN
        String received = calculator.divString(7, 4);
        //THEN
        assertThat(received).isEqualTo("1 rest: 3");
    }

    @Test
    @DisplayName("WHEN two numbers div THEN <div> rest:<remaining> is returned")
    void testDiv2() {
        //GIVEN
        //WHEN
        String received = calculator.divString(17, 4);
        //THEN
        assertThat(received).isEqualTo("4 rest: 1");
    }

    @Test
    @DisplayName("WHEN a number is divided by 0 then NaN is returned")
    void testDiv3() {
        //GIVEN
        //WHEN
        String received = calculator.divString(324, 0);
        //THEN
        assertThat(received).isEqualTo("NaN");
    }
}
