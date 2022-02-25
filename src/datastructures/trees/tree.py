class Tree:
  def __init__(self, value) -> None:
    self.value = value
    self.children = []

    """create a new node
    Time complexity: O(1)
    """
  def insertChild(self, value):
    # create a new node
    node = Tree(value=value)
    self.children.append(node)
    return node

    """remove a node
    Time complexity: O()
    """
  def removeChild(self, value):
    for child in self.children:
      if (child.value == value):
        self.children.remove(child)

myTree = Tree(value=1)
myTreeChild = myTree.insertChild(value=2)
