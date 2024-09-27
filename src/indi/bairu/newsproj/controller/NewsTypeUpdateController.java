package indi.bairu.newsproj.controller;

import indi.bairu.newsproj.domain.NewsType;
import indi.bairu.newsproj.service.NewsTypeService;
import indi.bairu.newsproj.service.impl.NewsTypeServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *修改新闻类型的控制器
 * */
@WebServlet("/NewsTypeUpdateController")
public class NewsTypeUpdateController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private NewsTypeService service=new NewsTypeServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    PrintWriter out=response.getWriter();
    String srID=request.getParameter("typeid");
    String typename=request.getParameter("typename");
    //调用
        int nResult=service.update(new NewsType(Integer.parseInt(srID),typename));
        String msg="";

        if(nResult==1){
            msg="修改成功";
        } else if (nResult==0) {
            msg="修改失败，输入不能为空";
        }else {
            msg="新闻类名已经存在";
        }
        //显示友好信息并跳转
        out.println("<script>alert('"+msg+"');location='NewsTypeController';</script>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        doGet(request, response);
    }
}