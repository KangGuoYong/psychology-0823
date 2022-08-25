package kgy.service;

import entity.Log;
import java.util.List;

/**
 * (Log)表服务接口
 *
 * @author 康康
 * @since 2022-08-25 12:08:58
 */
public interface LogService {

    /**
     * 查询所有数据
     *
     * @return 实例对象集合
     */
    List<Log> queryAll();
    
    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Log queryById(Integer id);

    /**
     * 新增数据
     *
     * @param log 实例对象
     * @return 实例对象
     */
    Log insert(Log log);

    /**
     * 修改数据
     *
     * @param log 实例对象
     * @return 实例对象
     */
    Log update(Log log);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
