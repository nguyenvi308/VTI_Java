package backend;

import entity.Account;
import entity.Department;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DepartmentDAO {

    private Connection conn;

    public DepartmentDAO(Connection conn) {
        this.conn = conn;
    }

    // Question 1
    public List<Department> getDepartments() throws SQLException
    {
        List<Department> departments = new ArrayList<>();
        String sql = "SELECT * FROM department";
        Statement select = conn.createStatement();
        ResultSet rs = select.executeQuery(sql);
        while(rs.next())
        {
            int departmentID = rs.getInt(1);
            String name = rs.getString(2);
            Department department = new Department(departmentID,name);
            departments.add(department);

        }
            return departments;
    }

    // Question 2-3
    public Department getByDepartmentId(int id) throws Exception
    {
        Department department = null;
        String sql = "SELECT * FROM department";
        Statement select = conn.createStatement();
        ResultSet rs = select.executeQuery(sql);
        while(rs.next())
        {
            int departmentID = rs.getInt(1);
            String name = rs.getString(2);
            if (departmentID == id)
            {
              Department department1 = new Department(departmentID,name);
                return department1;
            }
        }
        throw new Exception("Cannot find Department which has id = " + id);
    }


    // Question 4
    public boolean isDepartmentNameExists(String name) throws SQLException {
        String sql = "SELECT * FROM department";
        Statement select = conn.createStatement();
        ResultSet rs = select.executeQuery(sql);
        while (rs.next()) {
            String name1 = rs.getString(2);
            if (name1.equals(name)) {

                return true;
            }
        }
        return false;
    }
    public boolean isDepartmentIdExists(int id) throws SQLException {
        String sql = "SELECT * FROM department";
        Statement select = conn.createStatement();
        ResultSet rs = select.executeQuery(sql);
        while (rs.next()) {
            int departmentID = rs.getInt(1);
            if (departmentID == id) {
                return true;
            }
        }
        return false;
    }

    // Question 6 Update
    public int createDepartment(String name) throws Exception {
        int a = 0;
        if (isDepartmentNameExists(name))
        {
            throw new Exception("Account Name is Exist !");
        }else
        {
            PreparedStatement preparedStatement = conn.prepareStatement("insert into department(DepartmentName) value (?)");
            preparedStatement.setString(1,name);
            a  = preparedStatement.executeUpdate();
        }
        return a;
    }

    // Question 7
    public int deleteDepartmentByID(int id) throws Exception {
        int a = 0;
        if (isDepartmentIdExists(id)) {
            PreparedStatement preparedStatement = conn.prepareStatement("delete from department where DepartmentID = ?");
            preparedStatement.setInt(1, id);
            a = preparedStatement.executeUpdate();
            return a;
        } else {
            throw new Exception("Cannot find Department which has id = " + id);
        }

    }


}
