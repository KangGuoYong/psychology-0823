package kgy.service.impl;

import entity.FieldCounselor;
import kgy.mapper.FieldCounselorMapper;
import kgy.service.FieldCounselorService;
import org.springframework.stereotype.Service;
import java.util.List;
import javax.annotation.Resource;

/**
 * (FieldCounselor)表服务实现类
 *
 * @author 康康
 * @since 2022-08-25 12:08:57
 */
@Service("fieldCounselorService")
public class FieldCounselorServiceImpl implements FieldCounselorService {
    @Resource
    private FieldCounselorMapper fieldCounselorMapper;

    /**
     * 查询所有数据
     *
     * @return 实例对象集合
     */
    @Override
    public List<FieldCounselor> queryAll() {
        return this.fieldCounselorMapper.queryAll();
    }
    
    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public FieldCounselor queryById(Integer id) {
        return this.fieldCounselorMapper.queryById(id);
    }

    /**
     * 新增数据
     *
     * @param fieldCounselor 实例对象
     * @return 实例对象
     */
    @Override
    public FieldCounselor insert(FieldCounselor fieldCounselor) {
        this.fieldCounselorMapper.insert(fieldCounselor);
        return fieldCounselor;
    }

    /**
     * 修改数据
     *
     * @param fieldCounselor 实例对象
     * @return 实例对象
     */
    @Override
    public FieldCounselor update(FieldCounselor fieldCounselor) {
        this.fieldCounselorMapper.update(fieldCounselor);
        return this.queryById(fieldCounselor.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.fieldCounselorMapper.deleteById(id) > 0;
    }
}
