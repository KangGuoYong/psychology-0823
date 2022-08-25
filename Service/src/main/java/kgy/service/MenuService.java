package kgy.service;

import entity.Menu;
import java.util.List;

/**
 * (Menu)表服务接口
 *
 * @author 康康
 * @since 2022-08-25 12:08:58
 */
public interface MenuService {

    /**
     * 查询所有数据
     *
     * @return 实例对象集合
     */
    List<Menu> queryAll();
    
    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Menu queryById(Integer id);

    /**
     * 新增数据
     *
     * @param menu 实例对象
     * @return 实例对象
     */
    Menu insert(Menu menu);

    /**
     * 修改数据
     *
     * @param menu 实例对象
     * @return 实例对象
     */
    Menu update(Menu menu);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
