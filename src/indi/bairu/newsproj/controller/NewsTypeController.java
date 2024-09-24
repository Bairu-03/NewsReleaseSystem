package indi.bairu.newsproj.controller;

import indi.bairu.newsproj.domain.NewsType;
import indi.bairu.newsproj.service.NewsTypeService;
import indi.bairu.newsproj.service.impl.NewsTypeServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

/**
 * 新闻类型控制器类
 */
@WebServlet("/NewsTypeController")
public class NewsTypeController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    // 依赖关系
    private NewsTypeService service = new NewsTypeServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 调用
        List<NewsType> newsTypeList = service.findAll();
        // 保存到请求对象中
        request.setAttribute("list", newsTypeList);
        // 把信息转发给视图展示
        request.getRequestDispatcher("newstypelist.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
