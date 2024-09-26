package indi.bairu.newsproj.controller;

import indi.bairu.newsproj.service.NewsTypeService;
import indi.bairu.newsproj.service.impl.NewsTypeServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 删除新闻类型的控制器
 */
@WebServlet("/NewsTypeDeleteController")
public class NewsTypeDeleteController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private NewsTypeService service = new NewsTypeServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        String strId = request.getParameter("typeid");
        int nResult = service.delete(Integer.parseInt(strId));
        String msg = "";
        if (nResult == 1) {
            msg = "删除成功";
        } else if (nResult == 0) {
            msg = "删除失败";
        } else {
            msg = "仍有属于该类型的新闻，不允许删除";
        }

        // 显示提示并跳转回新闻类型列表页
        out.println("<script>alert('" + msg + "');location='NewsTypeController';</script>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        doGet(request, response);
    }
}
