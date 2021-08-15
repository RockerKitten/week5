package Week5;

public class App {
    public static void main(String[] args){
        Logger aLog = new AsteriskLogger();
        aLog.Log("This is a Log");
        aLog.Error("This is an Error");

        Logger sLog = new SpacedLogger();
        sLog.Log("Logger");
        sLog.Error("ErrorError");
    }
}
