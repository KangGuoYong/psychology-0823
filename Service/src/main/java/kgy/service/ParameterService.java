package kgy.service;

import entity.Parameter;
import java.util.List;

/**
 * (Parameter)表服务接口
 *
 * @author 康康
 * @since 2022-08-25 12:08:59
 */
public interface ParameterService {

    /**
     * 查询所有数据
     *
     * @return 实例对象集合
     */
    List<Parameter> queryAll();
    
    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Parameter queryById(Integer id);

    /**
     * 新增数据
     *
     * @param parameter 实例对象
     * @return 实例对象
     */
    Parameter insert(Parameter parameter);

    /**
     * 修改数据
     *
     * @param parameter 实例对象
     * @return 实例对象
     */
    Parameter update(Parameter parameter);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
