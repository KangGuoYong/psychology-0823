package kgy.service.impl;

import entity.AdminUser;
import kgy.mapper.AdminUserMapper;
import kgy.service.AdminUserService;
import org.springframework.stereotype.Service;
import java.util.List;
import javax.annotation.Resource;

/**
 * (AdminUser)表服务实现类
 *
 * @author 康康
 * @since 2022-08-25 12:08:51
 */
@Service("adminUserService")
public class AdminUserServiceImpl implements AdminUserService {
    @Resource
    private AdminUserMapper adminUserMapper;

    /**
     * 查询所有数据
     *
     * @return 实例对象集合
     */
    @Override
    public List<AdminUser> queryAll() {
        return this.adminUserMapper.queryAll();
    }
    
    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public AdminUser queryById(Integer id) {
        return this.adminUserMapper.queryById(id);
    }

    /**
     * 新增数据
     *
     * @param adminUser 实例对象
     * @return 实例对象
     */
    @Override
    public AdminUser insert(AdminUser adminUser) {
        this.adminUserMapper.insert(adminUser);
        return adminUser;
    }

    /**
     * 修改数据
     *
     * @param adminUser 实例对象
     * @return 实例对象
     */
    @Override
    public AdminUser update(AdminUser adminUser) {
        this.adminUserMapper.update(adminUser);
        return this.queryById(adminUser.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.adminUserMapper.deleteById(id) > 0;
    }
}
