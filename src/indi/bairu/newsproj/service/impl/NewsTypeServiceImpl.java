package indi.bairu.newsproj.service.impl;

import indi.bairu.newsproj.dao.NewsTypeDao;
import indi.bairu.newsproj.dao.impl.NewsTypeDaoImpl;
import indi.bairu.newsproj.domain.NewsType;
import indi.bairu.newsproj.service.NewsTypeService;

import java.util.List;

/**
 * 新闻类型业务逻辑层接口实现类
 */
public class NewsTypeServiceImpl implements NewsTypeService {
    // 依赖关系
    private NewsTypeDao dao = new NewsTypeDaoImpl();
    @Override
    public List<NewsType> findAll() {
        return dao.findAll();
    }
}
