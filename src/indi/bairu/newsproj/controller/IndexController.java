package indi.bairu.newsproj.controller;

import indi.bairu.newsproj.domain.News;
import indi.bairu.newsproj.domain.NewsType;
import indi.bairu.newsproj.service.NewsService;
import indi.bairu.newsproj.service.NewsTypeService;
import indi.bairu.newsproj.service.impl.NewsServiceImpl;
import indi.bairu.newsproj.service.impl.NewsTypeServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/IndexController")
public class IndexController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private NewsService service = new NewsServiceImpl();
    private NewsTypeService ntService = new NewsTypeServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<News> newsList = service.findAll();
        List<NewsType> newsTypeList = ntService.findAll();
        List<NewsType> ntList = ntService.findAllIncludeNewsList();
        request.setAttribute("ntlist", ntList);
        request.setAttribute("newsList", newsList);
        request.setAttribute("newsTypeList", newsTypeList);

        // 转发给index.jsp
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        doGet(request, response);
    }
}
