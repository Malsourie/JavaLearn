package holding.exercise;

import java.awt.desktop.SystemEventListener;
import java.util.ArrayList;
import java.util.List;

public class Exercise7 {
    private static int counter;
    private int id = counter++;

    public int getId() {
        return id;
    }

    public static void main(String[] args) {
        List<Exercise7> exercise7List = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            exercise7List.add(new Exercise7());
        }
        List<Exercise7> sub = exercise7List.subList(2, 6);
        exercise7List.removeAll(sub);
        for (Exercise7 e : exercise7List) {
            System.out.println(e.getId());
        }
    }
}
