package br.edu.ifpr.foz.ifprstore.connection;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    private static Connection connection;

    public static Connection getConnection() {

        String url = "jdbc:mysql://127.0.0.1/ifpr_store";
        String user = "felipe";
        String pass = "1234";

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, user, pass);
        }catch(SQLException e){
            System.out.println("Erro: "+e.getMessage());
        }catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }

    public static void closeConnection(){
//        try {
//            connection.close();
//        } catch (SQLException e) {
//            throw new DatabaseException("Unable to close connection: "+e.getMessage());
//        }
    }


}
