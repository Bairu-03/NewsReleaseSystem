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

    /**
     * 根据新闻类型名获得指定对象
     * @param typename 新闻类型名
     * @return 新闻类型对象
     */
    NewsType findByName(String typename);

    /**
     * 添加新闻类型
     * @param nt 新闻类型对象
     * @return 数据库中受影响的行数
     */
    int save(NewsType nt);


    NewsType findById(int typeid);

    int update(NewsType nt);

    int delete(int typeid);
}
