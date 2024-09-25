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
     * 新增新闻类型
     * @param nt 新闻类型对象
     * @return 状态 1 - 成功 | 0 - 失败 | -1 - 已存在该新闻类型
     */
    int add(NewsType nt);
}
