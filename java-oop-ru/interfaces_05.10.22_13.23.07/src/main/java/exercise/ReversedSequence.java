package exercise;

// BEGIN
public class ReversedSequence implements CharSequence {

    private final char[] charArray;

    public ReversedSequence(String str) {
        charArray = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            charArray[str.length() - i - 1] = str.charAt(i);
        }
    }

    @Override
    public int length() {
        return charArray.length;
    }

    @Override
    public char charAt(int index) {
        return charArray[index];
    }

    public String toString() {
        var i = 0;
        var rezult = "";
        while (i < length()) {
            rezult = rezult + charArray[i];
            i++;
        }
        return rezult;
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        var i = start;
        var rezult = "";
        while (i < end) {
            rezult = rezult + charArray[i];
            i++;
        }
        return rezult;
    }
}
// END
