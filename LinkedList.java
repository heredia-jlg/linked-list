package collections.list.generics;

public class LinkedList<T extends Comparable<T>> implements List<T>
{
   Node<T> root;
   
   public void sort()
   {
      for( int i=0; i<size(); i++ ) 
      {
         Node<T> r = root;
         Node<T> r2 = r.next;
         while( r2 != null ) 
         {
            if( r.val.compareTo(r2.val) > 0 ) 
            {
               T temp = r2.val;
               r2.val = r.val;
               r.val = temp;
            }
            r2 = r2.next;
            r = r.next;
         }
      }
   }
   /* note: this method is not part of our List interface */
   public void print()
   {
      Node<T> r = root;
      while( r != null ) 
      {
         System.out.print( r.val + " " );
         r = r.next;
      }
      System.out.println();
   }
   public void add(T val)
   {
      Node<T> temp = new Node<>();
      temp.val = val;
      
      if( root == null ) 
      {
         root = temp;
      }
      else
      {
         Node<T> r = root;
         while( r.next != null )
         {
            r = r.next;
         }
         r.next = temp;         
      }
      
   }
   public int size()
   {
      int count = 0;
      Node<T> r = root;
      while( r != null )
      {
         count++;
         r = r.next;
      }
      return count;
   }
   public T remove(int idx) throws IndexOutOfBoundsException
   {
      if( idx >= size() || idx < 0 ) 
      {
         throw new IndexOutOfBoundsException(idx + " is out of bounds!");
      }
      T retVal;
      if( idx == 0 ) 
      {
         retVal = root.val;
         root = root.next;
      }
      else
      {
         Node<T> r = root;
         for( int i=0; i<idx-1; i++ ) 
         {
            r = r.next;
         }
         retVal = r.next.val;
         r.next = r.next.next;
      }
      return retVal;
   }
}