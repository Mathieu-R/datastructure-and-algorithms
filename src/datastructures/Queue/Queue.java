package datastructures.Queue;

public interface Queue<E> {
  public void enqueue(E item);
  public E dequeue() throws EmptyQueueException;
  public boolean isEmpty();
  public int size();
}
