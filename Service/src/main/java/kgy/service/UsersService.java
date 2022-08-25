package kgy.service;

import entity.Users;
import java.util.List;

/**
 * (Users)表服务接口
 *
 * @author 康康
 * @since 2022-08-25 12:09:04
 */
public interface UsersService {

    /**
     * 查询所有数据
     *
     * @return 实例对象集合
     */
    List<Users> queryAll();
    
    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Users queryById(Integer id);

    /**
     * 新增数据
     *
     * @param users 实例对象
     * @return 实例对象
     */
    Users insert(Users users);

    /**
     * 修改数据
     *
     * @param users 实例对象
     * @return 实例对象
     */
    Users update(Users users);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
