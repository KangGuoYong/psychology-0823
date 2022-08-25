package kgy.service;

import entity.RoleMenu;
import java.util.List;

/**
 * (RoleMenu)表服务接口
 *
 * @author 康康
 * @since 2022-08-25 12:09:01
 */
public interface RoleMenuService {

    /**
     * 查询所有数据
     *
     * @return 实例对象集合
     */
    List<RoleMenu> queryAll();
    
    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    RoleMenu queryById(Integer id);

    /**
     * 新增数据
     *
     * @param roleMenu 实例对象
     * @return 实例对象
     */
    RoleMenu insert(RoleMenu roleMenu);

    /**
     * 修改数据
     *
     * @param roleMenu 实例对象
     * @return 实例对象
     */
    RoleMenu update(RoleMenu roleMenu);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
