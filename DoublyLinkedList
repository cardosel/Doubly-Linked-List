
import java.io.PrintStream;

public class DoublyLinkedList<T>
  extends LinkedList<T>
{
  protected LinkedListNode<T> tail;
  
  // method to get end value of the list
  public T getEnd()
  {
    LinkedListNode<T> node = getEndNode();
    if (node != null) {
      return (T)getEndNode().getData();
    }
    return null;
  }
  
  // method to obtain the ending node of the list
  public LinkedListNode<T> getEndNode()
  {
    return this.tail;
  }
  
  
  // method which inserts the first value
  public void insertFirst(T data)
  {
    LinkedListNode<T> node = new DoublyLinkedListNode();
    
    node.setData(data);
    
    insertFirstNode(node);
  }
  
  // method which obtains the beginning node of the list
  public void insertFirstNode(LinkedListNode<T> node)
  {
    if ((node instanceof DoublyLinkedListNode))
    {
      if (isEmpty()) {
        this.tail = node;
      }
      ((DoublyLinkedListNode)node).setPrevious(null);
      
      super.insertFirstNode(node);
    }
    
    // if insertFirstNode isn't true then print error message,
    else
    {
      System.err.println("insertFirstNode must be used on DoublyLinkedListNode");
    }
  }
  
  // method to insert value after current node 
  public void insertAfter(LinkedListNode<T> currentNode, T data)
  {
    if ((currentNode instanceof DoublyLinkedListNode))
    {
      LinkedListNode<T> node = new DoublyLinkedListNode();
      
      node.setData(data);
      
      insertNodeAfter(currentNode, node);
    }
    
    // if insertAfter isn't true then print error message,
    else
    {
      System.err.println("Must invoke DoublyLinkedList's insertAfter method on a DoublyLinkedListNode");
    }
  }
  // method to insert node after current node 
  public void insertNodeAfter(LinkedListNode<T> currentNode, LinkedListNode<T> node)
  {
    if (((currentNode instanceof DoublyLinkedListNode)) && ((node instanceof DoublyLinkedListNode)))
    {
      ((DoublyLinkedListNode)currentNode).setPrevious(node);
      
      ((DoublyLinkedListNode)node).setPrevious(currentNode);
      
      super.insertNodeAfter(currentNode, node);
    }
    
    // if insertNodeAfter isn't true then print error message,
    else
    {
      System.err.println("Must invoke DoublyLinkedList's insertNodeAfter method on DoublyLinkedListNodes");
    }
  }
  
  //method to insert last value to list
  public void insertLast(T data)
  {
    LinkedListNode<T> newNode = new DoublyLinkedListNode();
    
    newNode.setData(data);
    
    insertLastNode(newNode);
  }
  
  //method to insert last node to list
  
  public void insertLastNode(LinkedListNode<T> newNode)
  {
    if ((newNode instanceof DoublyLinkedListNode))
    {
      if (isEmpty())
      {
        this.head = newNode;
      }
      else
      {
        ((DoublyLinkedListNode)newNode).setPrevious(this.tail);
        
        this.tail.setNext(newNode);
      }
      this.tail = newNode;
    }
    else
    {
      System.err.println("Must invoke DoublyLinkedList's insertLastNode method on a DoublyLinkedListNode");
    }
  }
  
  // method which deletes first value of list
  public void deleteFirst()
  {
    super.deleteFirst();
    
    ((DoublyLinkedListNode)this.head).setPrevious(null);
  }
  
  // method which deletes last value of list
  
  public void deleteLast()
  {
    this.tail = ((DoublyLinkedListNode)this.tail).getPrevious();
    
    this.tail.setNext(null);
  }
  
  // deletes value next to whatever node is being pointed to
  public void deleteNext(LinkedListNode<T> currentNode)
  {
    if ((currentNode instanceof DoublyLinkedListNode))
    {
      DoublyLinkedListNode<T> currentPrev = 
        (DoublyLinkedListNode)((DoublyLinkedListNode)currentNode).getPrevious();
      
      ((DoublyLinkedListNode)currentNode.getNext()).setPrevious(currentPrev);
      
      super.deleteNext(currentNode);
    }
    else
    {
      System.err.println("deleteNext can only be used on a DoublyLinkedListNode");
    }
  }
}
