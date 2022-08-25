package kgy.service;

import entity.Classes;
import java.util.List;

/**
 * (Classes)表服务接口
 *
 * @author 康康
 * @since 2022-08-25 12:08:53
 */
public interface ClassesService {

    /**
     * 查询所有数据
     *
     * @return 实例对象集合
     */
    List<Classes> queryAll();
    
    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Classes queryById(Integer id);

    /**
     * 新增数据
     *
     * @param classes 实例对象
     * @return 实例对象
     */
    Classes insert(Classes classes);

    /**
     * 修改数据
     *
     * @param classes 实例对象
     * @return 实例对象
     */
    Classes update(Classes classes);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
