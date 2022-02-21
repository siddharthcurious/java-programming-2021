package test;

class CountMap {

    private char ch;
    private int count;

    public CountMap(char ch, int count) {
        this.ch = ch;
        this.count = count;
    }

    public char getCh() {
        return ch;
    }

    public void setCh(char ch) {
        this.ch = ch;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "CountMap{" +
                "ch=" + ch +
                ", count=" + count +
                '}';
    }
}

public class test {
}
