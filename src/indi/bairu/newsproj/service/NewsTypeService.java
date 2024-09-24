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
}
