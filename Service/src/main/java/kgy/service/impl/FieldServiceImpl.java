package kgy.service.impl;

import entity.Field;
import kgy.mapper.FieldMapper;
import kgy.service.FieldService;
import org.springframework.stereotype.Service;
import java.util.List;
import javax.annotation.Resource;

/**
 * (Field)表服务实现类
 *
 * @author 康康
 * @since 2022-08-25 12:08:56
 */
@Service("fieldService")
public class FieldServiceImpl implements FieldService {
    @Resource
    private FieldMapper fieldMapper;

    /**
     * 查询所有数据
     *
     * @return 实例对象集合
     */
    @Override
    public List<Field> queryAll() {
        return this.fieldMapper.queryAll();
    }
    
    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Field queryById(Integer id) {
        return this.fieldMapper.queryById(id);
    }

    /**
     * 新增数据
     *
     * @param field 实例对象
     * @return 实例对象
     */
    @Override
    public Field insert(Field field) {
        this.fieldMapper.insert(field);
        return field;
    }

    /**
     * 修改数据
     *
     * @param field 实例对象
     * @return 实例对象
     */
    @Override
    public Field update(Field field) {
        this.fieldMapper.update(field);
        return this.queryById(field.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.fieldMapper.deleteById(id) > 0;
    }
}
