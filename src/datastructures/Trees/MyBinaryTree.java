package datastructures.Trees;

public class MyBinaryTree<Key extends Comparable<Key>, Value> {
  private Node root;

  private class Node {
    private Key key;
    private Value value;
    private Node left; // left link to subtree
    private Node right; // right link to subtree
    private int N; // number of nodes in subtrees

    public Node(Key key, Value value, int N) {
      this.key = key;
      this.value = value;
      this.N = N;
    }
  }

  public Value get(Key key) {
    return get(root, key);
  }

  public Value get(Node node, Key key) {
    if (node == null) {
      return null;
    }

    int compare = key.compareTo(node.key);

    if (compare < 0) {
      return get(node.left, key);
    } else if (compare > 0) {
      return get(node.right, key);
    } else {
      return node.value;
    }
  }

  public void set(Key key, Value value) {
    // update root node
    root = set(root, key, value);
  }

  public Node set(Node node, Key key, Value value) {
    if (root == null) {
      return new Node(key, value, 1);
    }

    int compare = key.compareTo(node.key);

    if (compare < 0) {
      node.left = set(node.left, key, value);
    } else if (compare > 0) {
      node.right = set(node.right, key, value);
    } else {
      node.value = value;
    }

    node.N = size(node.left) + size(node.right) + 1;
    return node;
  }

  public int size() {
    return size(root);
  }

  public int size(Node node) {
    if (node == null) {
      return 0;
    }

    return node.N;
  }


}
