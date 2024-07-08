package Bank.database;

import java.sql.*;

public class DbCode {
    private static Connection con=null;
    private static PreparedStatement pst;
    private static ResultSet rs;
    private DbCode(){}
    public static Connection getConnection() throws SQLException {
        if(con==null){
            String url="jdbc:mysql://localhost:3306/demo";
            String user="root";
            String pass="satheesh";
            con= DriverManager.getConnection(url, user, pass);
        }
        return con;
    }

    public static boolean validate(long card, int pass){

        try {
            String q="select * from bank where card=? and password=?";
            con=getConnection();
            pst=con.prepareStatement(q);
            pst.setLong(1,card);
            pst.setInt(2, pass);
            rs=pst.executeQuery();
            if(rs.next()){
                if(rs.getInt("password")==pass)
                    return true;
            }
        }catch (Exception e){
            System.out.println(e);
        }
        return false;
    }
}
