package collections.list.generics;

public class Node<T>
{
   T  val;
   Node<T> next;
   
   public Node()
   {
   }
   public Node(T val)
   {
      this.val = val;
   }
   public String toString()
   {
      return String.valueOf(val);
   }
}