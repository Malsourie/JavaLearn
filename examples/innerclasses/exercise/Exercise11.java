package innerclasses.exercise;

interface Inner {
    void hello();
}

public class Exercise11 {
    public static void main(String[] args) {
        SubExercise11 se11 = new SubExercise11();
        Inner i = se11.getInner();
        i.hello();
    }
}

class SubExercise11 {
    private class TestInner implements Inner {
        @Override
        public void hello() {
            System.out.println("Hello!");
        }
    }

    public Inner getInner() {
        return new TestInner();
    }
}
