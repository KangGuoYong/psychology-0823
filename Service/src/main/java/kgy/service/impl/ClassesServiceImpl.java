package kgy.service.impl;

import entity.Classes;
import kgy.mapper.ClassesMapper;
import kgy.service.ClassesService;
import org.springframework.stereotype.Service;
import java.util.List;
import javax.annotation.Resource;

/**
 * (Classes)表服务实现类
 *
 * @author 康康
 * @since 2022-08-25 12:08:53
 */
@Service("classesService")
public class ClassesServiceImpl implements ClassesService {
    @Resource
    private ClassesMapper classesMapper;

    /**
     * 查询所有数据
     *
     * @return 实例对象集合
     */
    @Override
    public List<Classes> queryAll() {
        return this.classesMapper.queryAll();
    }
    
    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Classes queryById(Integer id) {
        return this.classesMapper.queryById(id);
    }

    /**
     * 新增数据
     *
     * @param classes 实例对象
     * @return 实例对象
     */
    @Override
    public Classes insert(Classes classes) {
        this.classesMapper.insert(classes);
        return classes;
    }

    /**
     * 修改数据
     *
     * @param classes 实例对象
     * @return 实例对象
     */
    @Override
    public Classes update(Classes classes) {
        this.classesMapper.update(classes);
        return this.queryById(classes.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.classesMapper.deleteById(id) > 0;
    }
}
