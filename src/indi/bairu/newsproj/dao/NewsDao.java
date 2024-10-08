package indi.bairu.newsproj.dao;

import indi.bairu.newsproj.domain.News;

import java.util.List;

/**
 * 新闻的数据访问层接口
 */
public interface NewsDao {
    /**
     * 查询指定的新闻类型下包含的新闻信息
     *
     * @param typeid 新闻类型编号
     * @return 指定的新闻类型下包含的新闻信息
     */
    List<News> findByTypeid(int typeid);

    /**
     * 查询所有新闻
     *
     * @return 所有新闻
     */
    List<News> findAll();

    /**
     * 根据新闻编号获得指定新闻详情
     * @param newsid 新闻编号
     * @return 新闻信息
     */
    News findById(int newsid);
}