package kgy.service.impl;

import entity.Menu;
import kgy.mapper.MenuMapper;
import kgy.service.MenuService;
import org.springframework.stereotype.Service;
import java.util.List;
import javax.annotation.Resource;

/**
 * (Menu)表服务实现类
 *
 * @author 康康
 * @since 2022-08-25 12:08:58
 */
@Service("menuService")
public class MenuServiceImpl implements MenuService {
    @Resource
    private MenuMapper menuMapper;

    /**
     * 查询所有数据
     *
     * @return 实例对象集合
     */
    @Override
    public List<Menu> queryAll() {
        return this.menuMapper.queryAll();
    }
    
    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Menu queryById(Integer id) {
        return this.menuMapper.queryById(id);
    }

    /**
     * 新增数据
     *
     * @param menu 实例对象
     * @return 实例对象
     */
    @Override
    public Menu insert(Menu menu) {
        this.menuMapper.insert(menu);
        return menu;
    }

    /**
     * 修改数据
     *
     * @param menu 实例对象
     * @return 实例对象
     */
    @Override
    public Menu update(Menu menu) {
        this.menuMapper.update(menu);
        return this.queryById(menu.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.menuMapper.deleteById(id) > 0;
    }
}
