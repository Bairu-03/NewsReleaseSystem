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
 * 新闻类型添加控制器
 */
@WebServlet("/NewsTypeAddController")
public class NewsTypeAddController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    // 依赖关系
    private NewsTypeService service = new NewsTypeServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        String typename = request.getParameter("typename");
        int nResult = service.add(new NewsType(typename));

        String msg = "";
        if (nResult == 1) {
            msg = "添加成功";
        } else if (nResult == 0) {
            msg = "添加失败，输入不能为空";
        } else {
            msg = "该新闻类型已存在";
        }

        // 提示并跳转到列表信息显示页
        out.println("<script>alert('" + msg + "');location='NewsTypeController';</script>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
