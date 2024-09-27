package indi.bairu.newsproj.service;

import indi.bairu.newsproj.domain.News;
import java.util.List;

/**
 * 新闻业务逻辑接口
 */
public interface NewsService {
    List<News> findAll();

    /**
     * 查询指定的新闻类型下包含的新闻信息
     *
     * @param typeid 新闻类型编号
     * @return 指定的新闻类型下包含的新闻信息
     */
    List<News> findByTypeid(int typeid);

    /**
     * 根据新闻编号获得指定新闻详情
     *
     * @param newsid 新闻编号
     * @return 新闻信息
     */
    News findById(int newsid);
}
