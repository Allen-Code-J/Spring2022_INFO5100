package src.Assignment4;

import java.util.LinkedList;
import java.util.Queue;

public class Assignment4 {
    public class curQueue<T> {
        private Queue<T> queue;
        private Object Lock = new Object();

        public curQueue() {
            queue = new LinkedList<>();
        }

        public void add(T data) {
            synchronized (Lock) {
                queue.add(data);
            }
        }

        public T remove() {
            T data;
            synchronized (Lock) {
                data = queue.remove();
            }
            return data;
        }

        public T peek() {
            T data;
            synchronized (Lock) {
                data = queue.peek();
            }
            return data;
        }

        public boolean isEmpty() {
            synchronized (Lock) {
                return queue.isEmpty();
            }
        }
    }
}