package interfaces.exercise;

public interface InterfaceMultiple {
}

interface InterfaceBase {
    void interfaceBase();
}

interface Interface1 extends InterfaceBase{
    void interface1();
}

interface Interface2 extends InterfaceBase{
    void interface2();
}

interface Interface3 extends Interface1, Interface2 {
    void interface3();
}


