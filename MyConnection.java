    import java.sql.*;
    import javax.swing.JOptionPane;
public class MyConnection {
    static Connection con=null;
    static Statement stat=null;
    
    static Statement getConnection()
    {
        
          try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("JDBC Driver registered...");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employ","root","Root@123");
            if(con!=null){
                stat=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                System.out.println("Connection established...");
            }
            
            
        }
        catch(ClassNotFoundException e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage(),"JDBC Driver",JOptionPane.ERROR_MESSAGE);
            //e.printStackTrace();
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage(),"Connection Prob",JOptionPane.ERROR_MESSAGE);
           // e.printStackTrace();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage(),"Other Prob",JOptionPane.ERROR_MESSAGE);
            //e.printStackTrace();
        }
        
     return stat;
    }
    
    
}
