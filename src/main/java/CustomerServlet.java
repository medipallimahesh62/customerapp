
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/CustomerServlet")
public class CustomerServlet extends GenericServlet {
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        String cid = req.getParameter("id");
        String cname = req.getParameter("name");
        String cdor = req.getParameter("dor");
        String cuser = req.getParameter("uid");
        String cpass = req.getParameter("pass");
        int cid1 = Integer.parseInt(cid);
        String url = "jdbc:mysql://localhost:3306?user=root&password=12345";
        String query = "insert into  customer.customerinfo values(?,?,?,?,?)";
        try {

            Connection connection = DriverManager.getConnection(url);
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, cid1);
            preparedStatement.setString(2, cname);
            preparedStatement.setString(3, cdor);
            preparedStatement.setString(4, cuser);
            preparedStatement.setString(5, cpass);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {

            e.printStackTrace();
        }
        PrintWriter pw = res.getWriter();
        pw.println("Customer Details are ::");
        pw.println("Customer ID::" + cid1);
        pw.println("Customer Name::" + cname);
        pw.println("Customer DOR::" + cdor);
        pw.println("Customer USerID ::" + cuser);
        pw.println("Customer Password::" + cpass);

    }

}