package indi.bairu.newsproj.service.impl;

import indi.bairu.newsproj.dao.NewsDao;
import indi.bairu.newsproj.dao.impl.NewsDaoImpl;
import indi.bairu.newsproj.domain.News;
import indi.bairu.newsproj.service.NewsService;

import java.util.List;

public class NewsServiceImpl implements NewsService {
    private NewsDao dao = new NewsDaoImpl();

    @Override
    public List<News> findAll() {
        return dao.findAll();
    }

    /**
     * 查询指定的新闻类型下包含的新闻信息
     *
     * @param typeid 新闻类型编号
     * @return 指定的新闻类型下包含的新闻信息
     */
    @Override
    public List<News> findByTypeid(int typeid) {
        return dao.findByTypeid(typeid);
    }

    /**
     * 根据新闻编号获得指定新闻详情
     *
     * @param newsid 新闻编号
     * @return 新闻信息
     */
    @Override
    public News findById(int newsid) {
        return dao.findById(newsid);
    }
}
