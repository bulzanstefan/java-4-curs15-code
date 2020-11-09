package ro.fasttrackit.curs15;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LearnRecursivityTest {
    LearnRecursivity recursivity;

    @BeforeEach
    void setup() {
        recursivity = new LearnRecursivity();
    }

    @Test
    @DisplayName("WHEN sum(0) THEN return 0")
    void testSum0() {
        //GIVEN
        //WHEN
        int received = recursivity.sum(0);
        //THEN
        assertThat(received).isEqualTo(0);
    }

    @Test
    @DisplayName("WHEN sum(1) THEN return 1")
    void testSum1() {
        //GIVEN
        //WHEN
        int received = recursivity.sum(1);
        //THEN
        assertThat(received).isEqualTo(1);
    }

    @Test
    @DisplayName("WHEN sum(10) THEN return 55")
    void testSum10() {
        //GIVEN
        //WHEN
        int received = recursivity.sum(10);
        //THEN
        assertThat(received).isEqualTo(55);
    }

    @Test
    @DisplayName("WHEN sum(20) THEN return 55")
    void testSum20() {
        //GIVEN
        //WHEN
        int received = recursivity.sum(20);
        //THEN
        assertThat(received).isEqualTo(210);
    }

    @Test
    @DisplayName("WHEN lenght(Masa) THEN return 4")
    void testLength() {
        //GIVEN
        //WHEN
        int len = recursivity.length("Masa");
        //THEN
        assertThat(len).isEqualTo(4);
    }

    @Test
    void testReverse() {
        //GIVEN
        //WHEN
        String rev = recursivity.reverse("trac");
        //THEN
        assertThat(rev).isEqualTo("cart");
    }

}
