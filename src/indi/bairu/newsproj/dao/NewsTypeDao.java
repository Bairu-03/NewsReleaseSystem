package indi.bairu.newsproj.dao;

import indi.bairu.newsproj.domain.NewsType;
import java.util.List;

/**
 * 数据访问层接口 - 新闻类型数据访问层
 */
public interface NewsTypeDao {
    /**
     * 获得所有的新闻类型的信息
     * @return 所有的新闻类型信息
     */
    List<NewsType> findAll();
}
