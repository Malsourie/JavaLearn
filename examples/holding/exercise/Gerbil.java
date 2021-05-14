package holding.exercise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Gerbil {
    private static int counter;
    private final int id = counter++;

    public int getId() {
        return id;
    }

    public void hop() {
        System.out.println("Gerbil " + getId() + " is hopping!");
    }

    public static void main(String[] args) {
        ArrayList<Gerbil> gerbils = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            gerbils.add(new Gerbil());
        }
        Iterator<Gerbil> it = gerbils.iterator();
        while (it.hasNext()) {
            it.next().hop();
        }

        it = gerbils.iterator();
        Map<String, Gerbil> nameGerbils = new HashMap<>();
        Gerbil g;
        while (it.hasNext()) {
            g = it.next();
            nameGerbils.put(Integer.toString(g.getId()), g);
        }
        Iterator<String> its = nameGerbils.keySet().iterator();
        while (its.hasNext()) {
            String name = its.next();
            System.out.println(name);
            nameGerbils.get(name).hop();
        }
        System.out.println(nameGerbils);
    }
}
