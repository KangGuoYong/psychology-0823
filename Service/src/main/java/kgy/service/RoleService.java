package kgy.service;

import entity.Role;
import java.util.List;

/**
 * (Role)表服务接口
 *
 * @author 康康
 * @since 2022-08-25 12:09:01
 */
public interface RoleService {

    /**
     * 查询所有数据
     *
     * @return 实例对象集合
     */
    List<Role> queryAll();
    
    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Role queryById(Integer id);

    /**
     * 新增数据
     *
     * @param role 实例对象
     * @return 实例对象
     */
    Role insert(Role role);

    /**
     * 修改数据
     *
     * @param role 实例对象
     * @return 实例对象
     */
    Role update(Role role);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
