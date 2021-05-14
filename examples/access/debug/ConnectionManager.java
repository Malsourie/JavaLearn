package debug;

public class ConnectionManager {
    private Connection[] connections;
    public ConnectionManager(int num) {
        connections = new Connection[num];
    }

    public Connection[] getConnections() {
        if (Connection.getCounter() != 0) return connections;
        else return null;
    }

    public void makeConnection() {
        int n = Connection.getCounter();
        connections[n] = Connection.makeConnection();
    }

    public String toString() {
        StringBuffer s = new StringBuffer();
        for (int i = 0; i < Connection.getCounter(); i++) {
            s.append(connections[i]);
        }
        return s.toString();
    }

    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        ConnectionManager cm = new ConnectionManager(10);
        for (int i=0; i< num; i++) {
            cm.makeConnection();
        }
        System.out.println(cm);


    }
}


class Connection {
    private static int counter;
    static {
        counter = 0;
    }
    private Connection() {
    }

    static Connection makeConnection() {
        counter++;
        return new Connection();
    }

    public String toString() {
        return "Connection established! ";
    }

    static int getCounter() {
        return counter;
    }
}
