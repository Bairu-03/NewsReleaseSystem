package indi.bairu.newsproj.service.impl;

import indi.bairu.newsproj.dao.NewsDao;
import indi.bairu.newsproj.dao.NewsTypeDao;
import indi.bairu.newsproj.dao.impl.NewsDaoImpl;
import indi.bairu.newsproj.dao.impl.NewsTypeDaoImpl;
import indi.bairu.newsproj.domain.News;
import indi.bairu.newsproj.domain.NewsType;
import indi.bairu.newsproj.service.NewsTypeService;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * 新闻类型业务逻辑层接口实现类
 */
public class NewsTypeServiceImpl implements NewsTypeService {
    // 依赖关系
    private NewsTypeDao dao = new NewsTypeDaoImpl();
    private NewsDao nDao = new NewsDaoImpl();

    /**
     * 获得所有的新闻类型的信息
     * @return 所有的新闻类型信息
     */
    @Override
    public List<NewsType> findAll() {
        return dao.findAll();
    }

    @Override
    public List<NewsType> findAllIncludeNewsList() {
        return dao.findAllIncludeNewsList();
    }

    /**
     * 新增新闻类型
     * @param nt 新闻类型对象
     * @return 状态 1 - 成功 | 0 - 失败 | -1 - 已存在该新闻类型
     */
    @Override
    public int add(NewsType nt) {
        if(Objects.equals(nt.getTypename(), "")){
            return 0; // 失败
        }
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

    @Override
    public NewsType findById(int typeid) {
        return dao.findById(typeid);
    }

    @Override
    public int update(NewsType nt) {
        if(Objects.equals(nt.getTypename(), "")){
            return 0;
        }
        //判断修改成的新闻类型名是否已存在
        NewsType nType = dao.findByName(nt.getTypename());
        if (nType == null){
            int nResult = dao.update(nt);
            if (nResult > 0){
                return 1;
            } else {
                return 0;
            }
        }
        //已存在
        return -1;
    }

    /**
     * 删除指定的新闻类型
     * @param typeid 新闻类型编号
     * @return 状态 1 - 成功 | 0 - 失败 | -1 - 还有属于该类型的新闻
     */
    @Override
    public int delete(int typeid) {
        List<News> newsList = nDao.findByTypeid(typeid);
        if (newsList.size() == 0){
            int nResult = dao.delete(typeid);
            if (nResult > 0){
                return 1;
            } else {
                return 0;
            }
        }
        return -1;
    }
}
