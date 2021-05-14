package innerclasses.exercise.package2;

import innerclasses.exercise.package1.Motor;

public class MotorCycle {
    protected class SmallMotor implements Motor {
        public SmallMotor() {}
        @Override
        public void start() {
            System.out.println("Motor Start.");
        }

        @Override
        public void stop() {
            System.out.println("Motor Stop.");
        }
    }
}
