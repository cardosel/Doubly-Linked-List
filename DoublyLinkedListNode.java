

public class DoublyLinkedListNode<T>
  extends LinkedListNode<T>
{
	// new LL node object called previous 
  protected LinkedListNode<T> prev;
  
  // constructor for DoublyLinkedListNode
  
  public DoublyLinkedListNode()
  {
    this.prev = null;
  }
  
  // method to get previous node
  public LinkedListNode<T> getPrevious()
  {
    return this.prev;
  }
  
  // method to set previous node
  public void setPrevious(LinkedListNode<T> node)
  {
    this.prev = node;
  }
}
