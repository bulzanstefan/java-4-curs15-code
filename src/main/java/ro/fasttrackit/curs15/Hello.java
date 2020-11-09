package ro.fasttrackit.curs15;

public class Hello {

    public String sayHello() {
        return sayHello("");
    }

    public String sayHello(String name) {
        String result = "hello";
        if (name != null && !name.isEmpty()) {
            result += " " + name;
        }
        return result;
    }

    public String sayGoodbye() {
        return "goodbye";
    }
}
