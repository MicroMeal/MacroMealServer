import java.sql.*;

public class DBHandler {
    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";

    private  static  String url, user, pass;
    private Connection connection;
    private Statement statement;

    // Singleton pattern
    private  static  DBHandler instance;

    private DBHandler(String url, String user, String pass){
        this.url = url;
        this.user = user;
        this.pass = pass;
    }

    public static synchronized DBHandler getInstance(String url, String user, String pass){
        if(instance == null){
            instance = new DBHandler(url, user, pass);
        }
        return instance;
    }

    public void connect(){
        connection = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Connecting to database...");
            connection = DriverManager.getConnection(url, user, pass);
        }catch(SQLException se){
            //Handle errors for JDBC
            se.printStackTrace();
        }catch(Exception e){
            //Handle errors for Class.forName
            e.printStackTrace();
        }
    }

    public void disconnect(){
        try{
            if(statement!=null)
                statement.close();
            if(connection!=null)
                connection.close();
        }catch(SQLException se){
            se.printStackTrace();
        }catch(Exception e){
        //Handle errors for Class.forName
        e.printStackTrace();
    }
    }

    public ResultSet statment(String sqlQuery){
        try{
            statement = null;
            statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sqlQuery);
            //statement.close();
            return rs;
        } catch (SQLException e) {
            e.printStackTrace();
        }catch(Exception e){
            //Handle errors for Class.forName
            e.printStackTrace();
        }
        return null;
    }

}
