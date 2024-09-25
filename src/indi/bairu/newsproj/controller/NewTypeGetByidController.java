package indi.bairu.newsproj.controller;

import indi.bairu.newsproj.domain.NewsType;
import indi.bairu.newsproj.service.NewsTypeService;
import indi.bairu.newsproj.service.impl.NewsTypeServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
/**
 *根据新闻类型编号获得指定新闻类型对象的控制器
 * */
@WebServlet("/NewTypeGetByidController")
public class NewTypeGetByidController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    //依赖关系
    private NewsTypeService service = new NewsTypeServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String strId = request.getParameter("typeid");
        NewsType nt=service.findById(Integer.parseInt(strId));
        request.setAttribute("nt", nt);
        request.getRequestDispatcher("newstypeupdate.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        doGet(request, response);
    }
}