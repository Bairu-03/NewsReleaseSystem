package indi.bairu.newsproj.controller;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/AdminLoginController")
public class AdminLoginController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        String password = request.getParameter("passward");

        if(password == null){
            out.println("<script>alert('请输入密码');location='admin.jsp';</script>");
        } else if(password.equals("admin")){
            out.println("<script>location='NewsTypeController';</script>");
        } else {
            out.println("<script>alert('密码错误');location='admin.jsp';</script>");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        doGet(request, response);
    }
}
