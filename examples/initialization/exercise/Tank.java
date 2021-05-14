package exercise;

public class Tank {
    private boolean status;

    public Tank() {
        status = true;
    }

    public Tank(boolean status) {
        this.status = status;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean s) {
        status = s;
    }

    @Override
    protected void finalize() {
        if (status) System.out.println("exercise.Tank is full!!!");
    }

    public static void main(String[] args) {
        Tank tank1 = new Tank(false);
        Tank tank2 = new Tank(true);
        System.gc();
        System.gc();
        System.gc();
        System.gc();
        System.gc();
        System.gc();
    }

}
