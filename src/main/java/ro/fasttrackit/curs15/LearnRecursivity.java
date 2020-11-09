package ro.fasttrackit.curs15;

public class LearnRecursivity {
    public int sum(int n) {
        if (n == 0) {
            return 0;
        } else {
            return sum(n - 1) + n;
        }
    }

    public int length(String word) {
        //EXIT
        if (word == null) {
            return 0;
        } else if (word.isEmpty()) {
            return 0;
        } else {
            //RE-ENTRY
            return length(word.substring(1)) + 1;
        }
    }

    public String reverse(String word) {
        if (word == null || word.isEmpty()) {
            return "";
        } else {
            char ultimaLitera = word.charAt(word.length() - 1);
            String restul = word.substring(0, word.length() - 1);
            return ultimaLitera + reverse(restul);
        }
    }
}


