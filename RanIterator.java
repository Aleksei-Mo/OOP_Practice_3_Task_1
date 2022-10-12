import java.util.Iterator;
import java.util.Random;

//1. Написать итератор, который будет выдавать N случайных целых чисел

public class RanIterator implements Iterable <Integer>{

    private final int start;
    private final int end;
    private final int N;

public RanIterator(int start, int end,int N) {
        this.start = start;
        this.end = end;
        this.N=N;
}

@Override
public Iterator<Integer> iterator() {
     return new Iterator<>() {
        private int counter=0;
        Random rndNumb = new Random();
        @Override
        public boolean hasNext(){
            return counter<N;
        }
        @Override
        public Integer next(){
            counter++;
            return rndNumb.nextInt(start, end);
        }
     };
   }
public static void main(String[] args) {
    RanIterator iterator=new RanIterator(0,10,3);
    for (Integer iterable_element : iterator) {
        System.out.println(iterable_element);
    }
}
}



