package com.zeratul;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

public class JDBCConnDemo {

	
	@Test
	public void TestLogin(){
			try {
				fixedLogin("zeratul", "1993");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		
		
	}
	
	
	public void login(String name,String password) throws ClassNotFoundException, SQLException{
		
		// 1. 注册驱动 ，mysql 驱动
		Class.forName("com.mysql.jdbc.Driver");
		
		// 2. 获取JDBC 链接
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:5465/bamboos?useSSL=false","root","william");
		
		// 3. 获取 sql 执行者
		Statement stmt=conn.createStatement();
		
		// 4. 执行SQL语句
		String sql="select * from tbl_user where uname = '"+name+"' and upassword = '"+password+"';";
		ResultSet rs=  stmt.executeQuery(sql);
		
		// 5. 处理返回结果
		if (rs.next()) {
			System.out.println("恭喜您，" + name + ",登录成功!");
			System.out.println(sql);
			StringBuffer result=new StringBuffer();
			result.append("id:"+rs.getInt(1)+"--");
			result.append("uname:"+rs.getString(2)+"--");
			result.append("upassword:"+rs.getString(3)+"--");
			result.append("uaddress:"+rs.getString(4)+"--");
			result.append("uemail:"+rs.getString(5)+"--");
			System.out.println(result.toString());
		} else {
			System.out.println("账号或密码错误!");
		}
		
		// 6. 关闭资源链接
		rs.close();
		stmt.close();
		conn.close();
		
	}
	
	
	public void fixedLogin(String name,String password) throws SQLException, ClassNotFoundException{
		// 1. 注册驱动 ，mysql 驱动
				Class.forName("com.mysql.jdbc.Driver");
				
				// 2. 获取JDBC 链接
				Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:5465/bamboos?useSSL=false","root","william");
				
				// 3. 获取 sql 执行者
				String sql="select * from tbl_user where uname = ? and upassword = ?;";
				PreparedStatement pstmt=conn.prepareStatement(sql);
				
				// 4. 执行SQL语句
				pstmt.setString(1, name);
				pstmt.setString(2, password);
				ResultSet rs=  pstmt.executeQuery();
				
				// 5. 处理返回结果
				if (rs.next()) {
					System.out.println("恭喜您，" + name + ",登录成功!");
					System.out.println(sql);
					StringBuffer result=new StringBuffer();
					result.append("id:"+rs.getInt(1)+"--");
					result.append("uname:"+rs.getString(2)+"--");
					result.append("upassword:"+rs.getString(3)+"--");
					result.append("uaddress:"+rs.getString(4)+"--");
					result.append("uemail:"+rs.getString(5)+"--");
					System.out.println(result.toString());
				} else {
					System.out.println("账号或密码错误!");
				}
				
				// 6. 关闭资源链接
				rs.close();
				pstmt.close();
				conn.close();
				
	}
	
}
