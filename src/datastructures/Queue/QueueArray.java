package datastructures.Queue;

public class QueueArray<Item> implements QueueInterface<Item> {
  private Item[] data;
  private int size;

  private int headPointer;
  private int tailPointer;

  public QueueArray(int size) {
    this.data = new Item[size];
    this.size = size;

    this.tailPointer = 0;
    this.headPointer = size - 1;
  }

  @Override
  public void enqueue(Item item) {

  }

  @Override
  public Item dequeue() throws EmptyQueueException {
    return null;
  }

  @Override
  public boolean isEmpty() {
    return false;
  }

  @Override
  public boolean isFull() {
    return false;
  }

  @Override
  public int size() {
    return 0;
  }
}
