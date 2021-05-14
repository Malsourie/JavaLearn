package exercise;

public class CashTest {
    private Cash c;

    public CashTest(Cash c) {
        this.c = c;
    }

    public void describe() {
        System.out.print("This is ");
        switch (c) {
            case WU : System.out.println("5 yuan."); break;
            case SHI : System.out.println("10 yuan"); break;
            case ERSHI : System.out.println("20 yuan"); break;
            case WUSHI : System.out.println("50 yuan"); break;
            case YIBAI : System.out.println("100 yuan"); break;
            default : System.out.println("counterfeit money!");
        }
    }

    public static void main(String[] args) {
        for (Cash c : Cash.values()) {
            System.out.println(c + ", Ordinal " + c.ordinal());
        }
        CashTest c1 = new CashTest(Cash.WU);
        CashTest c2 = new CashTest(Cash.SHI);
        CashTest c3 = new CashTest(Cash.ERSHI);
        CashTest c4 = new CashTest(Cash.WUSHI);
        CashTest c5 = new CashTest(Cash.YIBAI);
        c1.describe();
        c2.describe();
        c3.describe();
        c4.describe();
        c5.describe();
    }
}
