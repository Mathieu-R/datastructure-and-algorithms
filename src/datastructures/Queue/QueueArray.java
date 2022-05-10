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
    if (isFull()) {
      resize();
    }


  }

  @Override
  public Item dequeue() throws EmptyQueueException {
    return null;
  }

  public void resize() {
    Item[] temp = new Item[size * 2];

    for (int i = 0; i < data.length; i++) {
      temp[i] = data[i];
    }

    data = temp;
  }

  @Override
  public boolean isEmpty() {
    return size == 0;
  }

  public boolean isFull() {
    return data.length == size;
  }

  @Override
  public int size() {
    return 0;
  }
}
