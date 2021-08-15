package Week5;

public class SpacedLogger implements Logger {
    @Override
    public void Log(String log) {
        char[] chars = log.toCharArray();
        StringBuilder logOut = new StringBuilder();
        for (char i : chars)
        {
            logOut.append(i).append(" ");
        }
        System.out.println(logOut);
    }

    @Override
    public void Error(String error) {
        char[] chars = error.toCharArray();
        StringBuilder logOut = new StringBuilder();
        for (char i : chars)
        {
            logOut.append(" ").append(i);
        }
        System.out.println("ERROR:"+ logOut);
    }
}

