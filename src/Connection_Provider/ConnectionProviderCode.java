/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connection_Provider;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
/**
 *
 * @author jayad
 */
public class ConnectionProviderCode {
    public static Connection getcon(){
     try{ // checks jdbc present or not 
      Class.forName("com.mysql.cj.jdbc.Driver"); //what is jdbc driver--> connects GUI and jdbc(java data base connector)
       Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/SchoolDatabase", "root", "Jayadevjay@69");
       return con;
       }
       catch(Exception e){
       JOptionPane.showMessageDialog(null,e.toString());
       return null;
      }
    }
    public static void main(String[] args){
     ConnectionProviderCode con = new ConnectionProviderCode();
     Connection c = con.getcon();
    }
}
