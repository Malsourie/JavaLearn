//: holding/NonCollectionSequence.java
package holding;

import typeinfo.pets.*;
import java.util.*;

class PetSequence {
  protected Pet[] pets = Pets.createArray(8);
}

public class NonCollectionSequence extends PetSequence {
  public Iterable<Pet> normal() {
    return new Iterable<Pet>() {
      @Override
      public Iterator<Pet> iterator() {
        return new Iterator<Pet>() {
          private int index = 0;

          public boolean hasNext() {
            return index < pets.length;
          }

          public Pet next() {
            return pets[index++];
          }

          public void remove() { // Not implemented
            throw new UnsupportedOperationException();
          }
        };
      }
    };
  }

  public Iterable<Pet> reversed() {
    return new Iterable<Pet>() {
      private int counter = pets.length - 1;
      @Override
      public Iterator<Pet> iterator() {
        return new Iterator<Pet>() {
          @Override
          public boolean hasNext() {
            return counter != 0;
          }

          @Override
          public Pet next() {
            return pets[counter--];
          }
        };
      }
    };
  }

  public Iterable<Pet> randomized() {
    return new Iterable<Pet>() {
      List<Pet> petsRand = new ArrayList<>(Arrays.asList(pets));
      @Override
      public Iterator<Pet> iterator() {
        Collections.shuffle(petsRand, new Random(415));
        return petsRand.iterator();
      }
    };
  }

  public static void display(Iterable<Pet> c) {
    InterfaceVsIterator.display(c.iterator());
  }

  public static void main(String[] args) {
    NonCollectionSequence nc = new NonCollectionSequence();
    display(nc.normal());
    display(nc.reversed());
    display(nc.randomized());
  }
} /* Output:
0:Rat 1:Manx 2:Cymric 3:Mutt 4:Pug 5:Cymric 6:Pug 7:Manx
*///:~
