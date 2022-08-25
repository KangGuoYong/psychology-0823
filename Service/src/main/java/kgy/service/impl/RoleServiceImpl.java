package kgy.service.impl;

import entity.Role;
import kgy.mapper.RoleMapper;
import kgy.service.RoleService;
import org.springframework.stereotype.Service;
import java.util.List;
import javax.annotation.Resource;

/**
 * (Role)表服务实现类
 *
 * @author 康康
 * @since 2022-08-25 12:09:01
 */
@Service("roleService")
public class RoleServiceImpl implements RoleService {
    @Resource
    private RoleMapper roleMapper;

    /**
     * 查询所有数据
     *
     * @return 实例对象集合
     */
    @Override
    public List<Role> queryAll() {
        return this.roleMapper.queryAll();
    }
    
    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Role queryById(Integer id) {
        return this.roleMapper.queryById(id);
    }

    /**
     * 新增数据
     *
     * @param role 实例对象
     * @return 实例对象
     */
    @Override
    public Role insert(Role role) {
        this.roleMapper.insert(role);
        return role;
    }

    /**
     * 修改数据
     *
     * @param role 实例对象
     * @return 实例对象
     */
    @Override
    public Role update(Role role) {
        this.roleMapper.update(role);
        return this.queryById(role.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.roleMapper.deleteById(id) > 0;
    }
}
