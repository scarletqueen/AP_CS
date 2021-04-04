public class CountClass implements Comparable<CountClass> {
    String letter;
    int counter;
    int index;

    public CountClass(int counter, String letter, int index) {
        this.letter = letter;
        this.counter = counter;
        this.index = index;
    }

    public String getLetter() {
        return letter;
    }

    public int getCounter() {
        return counter;
    }

    public String toString() {
        return letter + " " + counter;
    }
    @Override
    public int compareTo(CountClass o) {
        if (this.counter != o.counter) {
            return this.counter - o.counter;
        } else {
            return this.index - o.index;
        }
    }


}
