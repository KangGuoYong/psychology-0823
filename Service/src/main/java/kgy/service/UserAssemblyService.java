package kgy.service;

import entity.UserAssembly;
import java.util.List;

/**
 * (UserAssembly)表服务接口
 *
 * @author 康康
 * @since 2022-08-25 12:09:03
 */
public interface UserAssemblyService {

    /**
     * 查询所有数据
     *
     * @return 实例对象集合
     */
    List<UserAssembly> queryAll();
    
    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UserAssembly queryById(Integer id);

    /**
     * 新增数据
     *
     * @param userAssembly 实例对象
     * @return 实例对象
     */
    UserAssembly insert(UserAssembly userAssembly);

    /**
     * 修改数据
     *
     * @param userAssembly 实例对象
     * @return 实例对象
     */
    UserAssembly update(UserAssembly userAssembly);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
