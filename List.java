package collections.list.generics;

public interface List<T extends Comparable<T>>
{
   void add(T val);
   /*
   void add(int idx, T val) throws IndexOutOfBoundsException;
   */
   T remove(int idx) throws IndexOutOfBoundsException;
   
   
   void sort();
   /*
   boolean contains(T val);
   
   int indexOf(T val);
   
   int lastIndexOf(T val);
   
   T get(int idx) throws IndexOutOfBoundsException;
   
   void set(int idx, T val) throws IndexOutOfBoundsException;
   
   boolean isEmpty();
   
   boolean isFull();
   
   String toString();
   
   void clear();
   
   int size();
   */
}