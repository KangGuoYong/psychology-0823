package kgy.service.impl;

import entity.UserAssembly;
import kgy.mapper.UserAssemblyMapper;
import kgy.service.UserAssemblyService;
import org.springframework.stereotype.Service;
import java.util.List;
import javax.annotation.Resource;

/**
 * (UserAssembly)表服务实现类
 *
 * @author 康康
 * @since 2022-08-25 12:09:03
 */
@Service("userAssemblyService")
public class UserAssemblyServiceImpl implements UserAssemblyService {
    @Resource
    private UserAssemblyMapper userAssemblyMapper;

    /**
     * 查询所有数据
     *
     * @return 实例对象集合
     */
    @Override
    public List<UserAssembly> queryAll() {
        return this.userAssemblyMapper.queryAll();
    }
    
    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public UserAssembly queryById(Integer id) {
        return this.userAssemblyMapper.queryById(id);
    }

    /**
     * 新增数据
     *
     * @param userAssembly 实例对象
     * @return 实例对象
     */
    @Override
    public UserAssembly insert(UserAssembly userAssembly) {
        this.userAssemblyMapper.insert(userAssembly);
        return userAssembly;
    }

    /**
     * 修改数据
     *
     * @param userAssembly 实例对象
     * @return 实例对象
     */
    @Override
    public UserAssembly update(UserAssembly userAssembly) {
        this.userAssemblyMapper.update(userAssembly);
        return this.queryById(userAssembly.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.userAssemblyMapper.deleteById(id) > 0;
    }
}
