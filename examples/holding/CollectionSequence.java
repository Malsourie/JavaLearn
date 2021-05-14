//: holding/CollectionSequence.java
package holding;

import typeinfo.pets.*;
import java.util.*;

public class CollectionSequence
implements Collection<Pet> {
  private Pet[] pets = Pets.createArray(8);
  public int size() { return pets.length; }

  @Override
  public boolean isEmpty() {
    for (Pet p : pets) {
      if (p != null) {
        return false;
      }
    }
    return true;
  }

  @Override
  public boolean contains(Object o) {
    for (int i = 0; i < pets.length; i++) {
      if (pets[i].equals(o)) {
        return true;
      }
    }
    return false;
  }

  public Iterator<Pet> iterator() {
    return new Iterator<Pet>() {
      private int index = 0;
      public boolean hasNext() {
        return index < pets.length;
      }
      public Pet next() { return pets[index++]; }
      public void remove() { // Not implemented
        throw new UnsupportedOperationException();
      }
    };
  }

  @Override
  public Object[] toArray() {
    return pets.clone();
  }

  @Override
  public <T> T[] toArray(T[] a) {
    return a.clone();
  }

  @Override
  public boolean add(Pet pet) {
    for (int i = 0; i < pets.length; i++) {
      if (pets[i] == null) {
        pets[i] = pet;
        return true;
      }
    }
    return false;
  }

  @Override
  public boolean remove(Object o) {
    for (int i = 0; i < pets.length; i++) {
      if (pets[i].equals(o)) {
        pets[i] = null;
        return true;
      }
    }
    return false;

  }

  @Override
  public boolean containsAll(Collection<?> c) {
    for (Object cs : c) {
      if (contains(cs)) {
        continue;
      }
      return false;
    }
    return true;
  }

  @Override
  public boolean addAll(Collection<? extends Pet> c) {
    for (Pet cs : c) {
      if (add(cs)) {
        continue;
      }
      return false;
    }
    return true;
  }

  @Override
  public boolean removeAll(Collection<?> c) {
    for (Object cs : c) {
      if (remove(cs)) {
        continue;
      }
      return false;
    }
    return true;
  }

  @Override
  public boolean retainAll(Collection<?> c) {
    if (!containsAll(c)) { return false; }
    Arrays.fill(pets, null);
    for (Object p : c) {
      add((Pet) p);
    }
    return true;
  }

  @Override
  public void clear() {
    Arrays.fill(pets, null);
  }

  public static void main(String[] args) {
    CollectionSequence c = new CollectionSequence();
    InterfaceVsIterator.display(c);
    InterfaceVsIterator.display(c.iterator());
  }
} /* Output:
0:Rat 1:Manx 2:Cymric 3:Mutt 4:Pug 5:Cymric 6:Pug 7:Manx
0:Rat 1:Manx 2:Cymric 3:Mutt 4:Pug 5:Cymric 6:Pug 7:Manx
*///:~
