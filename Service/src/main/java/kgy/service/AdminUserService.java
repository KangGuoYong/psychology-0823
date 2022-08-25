package kgy.service;

import entity.AdminUser;
import java.util.List;

/**
 * (AdminUser)表服务接口
 *
 * @author 康康
 * @since 2022-08-25 12:08:51
 */
public interface AdminUserService {

    /**
     * 查询所有数据
     *
     * @return 实例对象集合
     */
    List<AdminUser> queryAll();
    
    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    AdminUser queryById(Integer id);

    /**
     * 新增数据
     *
     * @param adminUser 实例对象
     * @return 实例对象
     */
    AdminUser insert(AdminUser adminUser);

    /**
     * 修改数据
     *
     * @param adminUser 实例对象
     * @return 实例对象
     */
    AdminUser update(AdminUser adminUser);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
