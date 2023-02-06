import java.util.Random;
import java.util.Iterator;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    protected int min;
    protected int max;

    public Randoms(int min, int max) {
        this.random = new Random();
        this.min = min;
        this.max = max;
    }

    public Iterator<Integer> iterator(){
        return new returnIterator();
    }
    private class returnIterator implements Iterator<Integer>{


        @Override
        public boolean hasNext() {
            return true;
        }

        @Override
        public Integer next() {
            return random.nextInt(max - min) + min;
        }
    }

}
