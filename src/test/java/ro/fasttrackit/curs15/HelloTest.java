package ro.fasttrackit.curs15;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HelloTest {
    Hello hello;

    @BeforeEach
    void setup() {
        hello = new Hello();
    }

    @Test
    @DisplayName("WHEN sayHello is called THEN hello is returned")
    void testSayHello() {
        //SETUP  - GIVEN
        //RUN    - WHEN
        String result = hello.sayHello();

        //ASSERT - THEN
        assertThat(result).isEqualTo("hello");
    }

    @Test
    @DisplayName("WHEN sayHello with name is called THEN hello <name> is returned")
    void testSayHelloName() {
        //GIVEN
        //WHEN
        String received = hello.sayHello("Marian");
        //THEN
        assertThat(received).isEqualTo("hello Marian");
    }

    @Test
    @DisplayName("WHEN sayHello is called with null THEN hello is returned")
    void testSayHelloNameNull() {
        //GIVEN
        //WHEN
        String received = hello.sayHello(null);
        //THEN
        assertThat(received).isEqualTo("hello");
    }

    @Test
    @DisplayName("WHEN sayGoodbye is called THEN goodbye is returned")
    void testSayGoodbye() {
        //GIVEN
        //WHEN
        String result = hello.sayGoodbye();

        //THEN
        assertThat(result).isEqualTo("goodbye");
    }
}
