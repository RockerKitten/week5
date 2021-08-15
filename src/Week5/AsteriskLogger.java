package Week5;

public class AsteriskLogger implements Logger {
    @Override
    public void Log(String log) {
        System.out.println("***"+log+"***");
    }

    @Override
    public void Error(String error) {
    int x = error.length();
    System.out.println(("*".repeat(13))+("*".repeat(x)));
    System.out.println("***Error: "+error+"***");
    System.out.println(("*".repeat(13))+("*".repeat(x)));
    }

}
