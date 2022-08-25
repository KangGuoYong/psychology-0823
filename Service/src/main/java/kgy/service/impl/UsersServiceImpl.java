package kgy.service.impl;

import entity.Users;
import kgy.mapper.UsersMapper;
import kgy.service.UsersService;
import org.springframework.stereotype.Service;
import java.util.List;
import javax.annotation.Resource;

/**
 * (Users)表服务实现类
 *
 * @author 康康
 * @since 2022-08-25 12:09:05
 */
@Service("usersService")
public class UsersServiceImpl implements UsersService {
    @Resource
    private UsersMapper usersMapper;

    /**
     * 查询所有数据
     *
     * @return 实例对象集合
     */
    @Override
    public List<Users> queryAll() {
        return this.usersMapper.queryAll();
    }
    
    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Users queryById(Integer id) {
        return this.usersMapper.queryById(id);
    }

    /**
     * 新增数据
     *
     * @param users 实例对象
     * @return 实例对象
     */
    @Override
    public Users insert(Users users) {
        this.usersMapper.insert(users);
        return users;
    }

    /**
     * 修改数据
     *
     * @param users 实例对象
     * @return 实例对象
     */
    @Override
    public Users update(Users users) {
        this.usersMapper.update(users);
        return this.queryById(users.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.usersMapper.deleteById(id) > 0;
    }

    @Override
    public Users queryUser(Users user) {
        return this.usersMapper.queryUser(user);
    }
}
