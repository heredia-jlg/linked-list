package collections.list.generics;

public class LinkedListTester
{
   public static void main(String[] args)
   {
      LinkedList<Integer> myList = new LinkedList<>();

      for( int i=10; i>0; i-- ) 
      {
         myList.add(i);
      }
      myList.print();
      myList.sort();
      myList.print();
      
      LinkedList<Student> students = new LinkedList<>();
      Student s = new Student("Joe", "322");
      students.add(s);
      s = new Student("Sam", "50A");
      students.add(s);
      s = new Student("Sue", "903");
      students.add(s);
      s = new Student("Peter", "201");
      students.add(s);
      
      students.print();
      students.sort();
      students.print();
            
   }
}
class Student implements Comparable<Student>
{
   String name;
   String id;
   public Student(String n, String i)
   {
      name = n; 
      id = i;
   }
   public String toString()
   {
      return name + ", " + id;
   }
   public int compareTo( Student s )
   {
      /* can you write this code for comparing ids in one line? */
      //if( s.id > this.id ) return -1;
      //if( s.id < this.id ) return 1;
      //return 0;
      return this.name.compareTo(s.name);
   }
}