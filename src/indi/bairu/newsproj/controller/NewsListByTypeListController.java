package indi.bairu.newsproj.controller;

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

/**
 *获得所有新闻类型及它包含的新闻列表的控制器
 **/
@WebServlet("/NewsListByTypeListController")
public class NewsListByTypeListController extends HttpServlet {
    private static final long serialVersionUID = 1L;
   //依赖关系
    private NewsTypeService ntService = new NewsTypeServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<NewsType> ntList = ntService.findAllIncludeNewsList();
        request.setAttribute("ntlist", ntList);
        request.getRequestDispatcher("newslistbytypelist.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        doGet(request, response);
    }
}