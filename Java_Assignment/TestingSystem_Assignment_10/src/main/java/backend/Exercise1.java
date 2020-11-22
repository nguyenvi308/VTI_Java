package backend;


import backend.utils.JdbcUtils;

import javax.swing.plaf.nimbus.State;
import java.sql.*;
import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) throws SQLException {


        // Delete From Database
        JdbcUtils jdbcUtils = JdbcUtils.getInstance();
        Connection conn = jdbcUtils.connect("testing_system", "root", "Abcds007");
        System.out.println(question5(conn,9));
        jdbcUtils.close();

        // Select * from table
        Connection conn1 = jdbcUtils.connect("testing_system", "root", "Abcds007");
        String sql1 = "select * from groupaccount ; ";
        Statement select = conn1.createStatement();
        ResultSet rs = select.executeQuery(sql1);
        while (rs.next())
        {
            int groupID = rs.getInt(1);
            int accountID = rs.getInt(2);
            System.out.println(groupID +"   " + accountID);

        }
        jdbcUtils.close();


            // Try to call procedure without parameter
            /*String p1 = "call testing_system.getNumberOfAccountOfEachGroup();";
            System.out.println(p1);
            CallableStatement cs = null;
            cs = connection.prepareCall(p1);
            ResultSet rs = cs.executeQuery();
            while (rs.next()) {
                String groupName = rs.getString(1);
                int count = rs.getInt(2);
                System.out.println(groupName + "   " + count);
            }*/
           // Call a procedure with one input
            /*String p2 = "call testing_system.getSomethingTooLong(?);";
            CallableStatement cs1 = null;
            cs1 = connection.prepareCall(p2);
            cs1.setString(1, "nguyenvi");
            ResultSet rs = cs1.executeQuery();
            while (rs.next()) {

                int number = rs.getInt(1);
                String groupName  = rs.getString(2);
                String name = rs.getString(3);
                System.out.println(number  + " " + groupName + "  " + name);
            }*/
            // Call a procedure with one parameter and one output
            /*String  p3 = "call testing_system.test_procedure(?, ?);";
            CallableStatement cs3 = null;
            cs3 = connection.prepareCall(p3);
            cs3.setString(1 , "Nguyen Vi");
            cs3.registerOutParameter(2, Types.INTEGER);
            // ResultSet rs3 = cs3.executeQuery();
            cs3.execute();
            // 2 is parameter index that return from sql

            System.out.println(cs3.getInt(2));*/

    }



    public void question2(Connection connection) throws SQLException
    {

        System.out.println("Before Insert : ");
        String statement = "SELECT * FROM testing_system.position;";
        Statement positionSelect = connection.createStatement();
        ResultSet positionList = positionSelect.executeQuery(statement);
        while (positionList.next()) {
            System.out.println(positionList.getInt("PositionID") + "   " + positionList.getString("PositionName"));
        }
    }

    public int question3(Connection connection) throws SQLException
    {

        String insertPosition = "INSERT INTO position (PositionName) values(?);";
        PreparedStatement insertPositionStatement = connection.prepareStatement(insertPosition);
        System.out.println("Enter position for insert : ");
        Scanner scanner = new Scanner(System.in);
        String position = scanner.nextLine();
        insertPositionStatement.setString(1, position);
        int a = insertPositionStatement.executeUpdate();
        return a;
    }

    public int question4(Connection connection) throws SQLException
    {
        String update = "update position set PositionName = 'DEV'  where  PositionID = 5; ";
        Statement updateStatement = connection.createStatement();
        int a = updateStatement.executeUpdate(update);
        return a;
    }

    public static int question5(Connection connection, int id) throws SQLException
    {
        String sql = "Delete from groupaccount where AccountID = ? ; ";
        PreparedStatement deleteGroupAccount = connection.prepareStatement(sql);
        deleteGroupAccount.setInt(1, id);
        int a = deleteGroupAccount.executeUpdate();
        return a;

    }


}
