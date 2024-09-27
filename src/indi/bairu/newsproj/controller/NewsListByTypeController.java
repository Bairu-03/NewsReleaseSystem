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

@WebServlet("/NewsListByTypeController")
public class NewsListByTypeController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private NewsService service = new NewsServiceImpl();
    private NewsTypeService ntService = new NewsTypeServiceImpl();

    @Override
    protected void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        String strId = request.getParameter("typeid");
        List<News> newsList = service.findByTypeid(Integer.parseInt(strId));
        List<NewsType> ntList = ntService.findAll();
        request.setAttribute("newsList", newsList);
        request.setAttribute("newsTypeList", ntList);
        request.getRequestDispatcher("newslistbytype.jsp").forward(request, response);
    }

    @Override
    protected void doPost (HttpServletRequest request, HttpServletResponse response) throws
    ServletException, IOException {

        doGet(request, response);
    }
}
