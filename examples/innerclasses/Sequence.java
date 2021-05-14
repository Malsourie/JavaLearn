//: innerclasses/Sequence.java
// Holds a sequence of Objects.

package innerclasses;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Sequence {
  private List items;
  private int next = 0;
  public Sequence(int size) { items = new ArrayList(); }
  public void add(Object x) {
      items.add(x);
  }
//  private class SequenceSelector implements Selector {
//    private int i = 0;
//    public boolean end() { return i == items.size(); }
//    public Object current() { return items.get(i); }
//    public void next() { if(i < items.size()) i++; }
//    public Sequence getSequence() { return Sequence.this; }
//  }
  private class SequenceSelector implements Iterator {
    private int i = 0;
    @Override
    public boolean hasNext() {
      return i != items.size();
   }

    @Override
    public Object next() {
      return items.get(i++);
    }

    public Sequence getSequence() { return Sequence.this; }
  }
  private class ReverseSelector implements Selector {
      private int i = items.size() - 1;
    @Override
    public boolean end() {
      return i == -1;
    }

    @Override
    public Object current() {
      return items.get(i);
    }

    @Override
    public void next() {
      if (i >= 0) i--;
    }

    public Sequence getSequence() {
      return Sequence.this;
    }
  }
  public Iterator selector() {
    return new SequenceSelector();
  }
  public Selector reverseSelector() {return new ReverseSelector(); }
  public static void main(String[] args) {
    Sequence sequence = new Sequence(10);
    for(int i = 0; i < 10; i++)
      sequence.add(Integer.toString(i));
    Iterator selector = sequence.selector();
    while(selector.hasNext()) {
      System.out.print(selector.next() + " ");
    }
    System.out.println();
    Selector reverseselector = sequence.reverseSelector();
    while(!reverseselector.end()) {
      System.out.print(reverseselector.current() + " ");
      reverseselector.next();
    }
  }
} /* Output:
0 1 2 3 4 5 6 7 8 9
*///:~
