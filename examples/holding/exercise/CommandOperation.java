package holding.exercise;

import java.util.LinkedList;
import java.util.Queue;

public class CommandOperation {
    public static void operationAll(Queue<Command> c) {
        for (Command com : c) {
            System.out.println(com.operation());
        }
    }

    public static void main(String[] args) {
        Queue<Command> commands = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            CommandQueue.pushCommand(commands, new Command(Integer.toString(i)));
        }
        operationAll(commands);
    }
}

class Command {
    private String command;

    public Command(String s) {
        command = s;
    }

    public String operation(){
        return command;
    }
}

class CommandQueue {
    public static Queue<Command> pushCommand(Queue<Command> q, Command c) {
        q.offer(c);
        return q;
    }
}
