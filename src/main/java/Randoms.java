import java.util.Random;
import java.util.Iterator;

public class Randoms implements Iterator<Integer> {
    protected Random random;
    protected int min;
    protected int max;

    public Randoms(int min, int max) {
        this.random = new Random();
        this.min = min;
        this.max = max;
    }

    public Iterator<Integer> iterator() {
        return new returnIterator(min, max);
    }
    protected class returnIterator implements Iterator<Integer>{

        protected int min;
        protected int max;

        public returnIterator(int min, int max) {
            this.min = min;
            this.max = max;
        }


        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public Integer next() {
            return null;
        }
    }
    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Integer next() {
        return random.nextInt(max - min) + min;
    }
}
