package com.jspmodel2.daos;

import com.jspmodel2.db.DBConnection;
import com.jspmodel2.models.Employee;

import java.sql.*;

public class EmployeeDAO {
    public static Connection conn = DBConnection.getConnection();
    public static ResultSet getAll(){
        ResultSet rs = null;
        try {
            Statement st = conn.createStatement();
            rs = st.executeQuery("select * from employee");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        finally {
            return rs;
        }
    }
    public static Employee getEmployee(int id){
        try {
            PreparedStatement ps = conn.prepareStatement("select * from employee where id=?");
            ps.setInt(1,id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Employee employee = new Employee();
                employee.setId(rs.getInt("id"));
                employee.setFullName(rs.getString("full_name"));
                employee.setBirthday(rs.getString("birthday"));
                employee.setAddress(rs.getString("address"));
                employee.setPosition(rs.getString("position"));
                employee.setDepartment(rs.getString("department"));
                return employee;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        finally {
            return null;
        }
    }
    public static int updateEmployee(Employee emp) {
        try {
            PreparedStatement ps = conn.prepareStatement("UPDATE employee set full_name=?, birthday=?, address=?, position=?, department=?  where id=?");
            ps.setString(1, emp.getFullName());
            ps.setString(2, emp.getBirthday());
            ps.setString(3, emp.getAddress());
            ps.setString(4, emp.getAddress());
            ps.setString(5, emp.getDepartment());
            ps.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        finally {
            return 0;
        }
    }
    public static int addEmployee(Employee emp){
        int rs=0;
        try {
            PreparedStatement ps = conn.prepareStatement("insert into employee(full_name,birthday,address,position,department) values (?,?,?,?,?)");
            ps.setString(1,emp.getFullName());
            ps.setString(2,emp.getBirthday());
            ps.setString(3,emp.getAddress());
            ps.setString(4,emp.getPosition());
            ps.setString(5,emp.getDepartment());
            rs = ps.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        finally {
            return rs;
        }
    }
}
