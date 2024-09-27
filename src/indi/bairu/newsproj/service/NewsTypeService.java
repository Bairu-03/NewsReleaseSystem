package indi.bairu.newsproj.service;

import indi.bairu.newsproj.domain.NewsType;
import java.util.List;

/**
 * 新闻类型的业务逻辑层接口
 */
public interface NewsTypeService {
    /**
     * 获得所有的新闻类型的信息
     * @return 所有的新闻类型信息
     */
    List<NewsType> findAll();


    /**
     * 获得所有的新闻类型的信息
     * @return 所有的新闻类型信息
     */
    List<NewsType> findAllIncludeNewsList();

    int add(NewsType nt);

    /**
     *根据新闻类型编号来获取指定的新闻类型
     */
    NewsType findById(int typeid);

    /**
     * 修改新闻信息
     * @return 返回行数
     */
    int update(NewsType nt);

    /**
     * 删除指定的新闻类型
     * @param typeid 新闻类型编号
     * @return 状态 1 - 成功 | 0 - 失败 | -1 - 还有属于该类型的新闻
     */
    int delete(int typeid);
}
