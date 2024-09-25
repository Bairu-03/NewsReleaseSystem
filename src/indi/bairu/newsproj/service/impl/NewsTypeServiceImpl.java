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

    /**
     * 获得所有的新闻类型的信息
     * @return 所有的新闻类型信息
     */
    @Override
    public List<NewsType> findAll() {
        return dao.findAll();
    }

    /**
     * 新增新闻类型
     * @param nt 新闻类型对象
     * @return 状态 1 - 成功 | 0 - 失败 | -1 - 已存在该新闻类型
     */
    @Override
    public int add(NewsType nt) {
        // 查询该新增的新闻类型是否存在
        NewsType nType = dao.findByName(nt.getTypename());
        if (nType == null){
            // 该新增的新闻类型不存在，可以添加
            int nResult = dao.save(nt);
            if (nResult > 0){
                return 1; // 成功
            } else {
                return 0; // 失败
            }
        }
        return -1; // 已存在该新闻类型
    }
}
