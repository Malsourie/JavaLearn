package innerclasses.exercise.package3;

import innerclasses.exercise.package1.Motor;
import innerclasses.exercise.package2.MotorCycle;

public class SuperMotorCycle extends MotorCycle {
    public Motor getSmallMotor() {
        return SuperMotorCycle.this.new SmallMotor();
    }

    public static void main(String[] args) {
        SuperMotorCycle smc = new SuperMotorCycle();
        Motor m = smc.getSmallMotor();
        m.start();
        m.stop();
    }
}
