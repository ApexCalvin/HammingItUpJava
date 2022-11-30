package src.main.zipcode;

public class Hamming {
    String s;
    String s1;

    public Hamming(String s, String s1) {
        //if the length of two strings don't equal
        if(s.length() != s1.length()) {
            //sout error message
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        } else {
            //if they do equal, set
            this.s = s;
            this.s1 = s1;
        }
    }

    public int getHammingDistance() {
        int count = 0;
        //iterate through both strings and compare chars
        for (int i = 0; i < s.length(); i++) {
            //if they're not the same, count it
            if (s.charAt(i) != s1.charAt(i)) {
                count++;
            }
        }
        return count;
    }
}