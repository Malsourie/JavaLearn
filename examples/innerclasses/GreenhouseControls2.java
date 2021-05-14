package innerclasses;

import innerclasses.controller.Event;

public class GreenhouseControls2 extends GreenhouseControls{
    private boolean water = false;
    public class WaterOn extends GreenhouseControls.WaterOn {
        public WaterOn(long delayTime) { super(delayTime); }
        public void action() {
            water = true;
        }
        public String toString() { return "Water is on."; }
    }
    public class WaterOff extends GreenhouseControls.WaterOff {
        public WaterOff(long delayTime) { super(delayTime); }
        public void action() {
            water = false;
        }
        public String toString() {return "Water is off"; }
    }
}
