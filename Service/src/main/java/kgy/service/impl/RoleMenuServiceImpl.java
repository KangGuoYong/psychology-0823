package kgy.service.impl;

import entity.RoleMenu;
import kgy.mapper.RoleMenuMapper;
import kgy.service.RoleMenuService;
import org.springframework.stereotype.Service;
import java.util.List;
import javax.annotation.Resource;

/**
 * (RoleMenu)表服务实现类
 *
 * @author 康康
 * @since 2022-08-25 12:09:01
 */
@Service("roleMenuService")
public class RoleMenuServiceImpl implements RoleMenuService {
    @Resource
    private RoleMenuMapper roleMenuMapper;

    /**
     * 查询所有数据
     *
     * @return 实例对象集合
     */
    @Override
    public List<RoleMenu> queryAll() {
        return this.roleMenuMapper.queryAll();
    }
    
    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public RoleMenu queryById(Integer id) {
        return this.roleMenuMapper.queryById(id);
    }

    /**
     * 新增数据
     *
     * @param roleMenu 实例对象
     * @return 实例对象
     */
    @Override
    public RoleMenu insert(RoleMenu roleMenu) {
        this.roleMenuMapper.insert(roleMenu);
        return roleMenu;
    }

    /**
     * 修改数据
     *
     * @param roleMenu 实例对象
     * @return 实例对象
     */
    @Override
    public RoleMenu update(RoleMenu roleMenu) {
        this.roleMenuMapper.update(roleMenu);
        return this.queryById(roleMenu.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.roleMenuMapper.deleteById(id) > 0;
    }
}
