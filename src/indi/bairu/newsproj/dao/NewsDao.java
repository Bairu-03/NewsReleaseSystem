package indi.bairu.newsproj.dao;

import indi.bairu.newsproj.domain.News;

import java.util.List;

/**
 * 新闻的数据访问层接口
 */
public interface NewsDao {
    /**
     * 查询指定的新闻类型下包含的新闻信息
     * @param typeid 新闻类型编号
     * @return 指定的新闻类型下包含的新闻信息
     * */
    List<News> findByTypeid(int typeid);
}
