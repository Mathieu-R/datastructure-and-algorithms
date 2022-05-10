package datastructures.Queue;

public interface QueueInterface<Item> {
  public void enqueue(Item item);
  public Item dequeue() throws EmptyQueueException;
  public boolean isEmpty();
  public int size();
}
