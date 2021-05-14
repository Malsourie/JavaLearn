package interfaces;

import interfaces.interfaceprocessor.Apply;
import interfaces.interfaceprocessor.Processor;

public class StringProcessorAdapter implements Processor {
    StringProcessor sp;
    public StringProcessorAdapter(StringProcessor sp) {
        this.sp = sp;
    }

    @Override
    public String name() {
        return sp.name();
    }

    @Override
    public Object process(Object input) {
        return sp.process((String)input);
    }

    public static void main(String[] args) {
        String s = "abc";
        Apply.process(new StringProcessorAdapter(new StringProcessor()), s);
    }
}
