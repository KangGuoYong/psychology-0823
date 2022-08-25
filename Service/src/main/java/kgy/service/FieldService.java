package kgy.service;

import entity.Field;
import java.util.List;

/**
 * (Field)表服务接口
 *
 * @author 康康
 * @since 2022-08-25 12:08:56
 */
public interface FieldService {

    /**
     * 查询所有数据
     *
     * @return 实例对象集合
     */
    List<Field> queryAll();
    
    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Field queryById(Integer id);

    /**
     * 新增数据
     *
     * @param field 实例对象
     * @return 实例对象
     */
    Field insert(Field field);

    /**
     * 修改数据
     *
     * @param field 实例对象
     * @return 实例对象
     */
    Field update(Field field);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
