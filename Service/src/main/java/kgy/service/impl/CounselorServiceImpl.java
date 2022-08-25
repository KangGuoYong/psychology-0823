package kgy.service.impl;

import entity.Counselor;
import kgy.mapper.CounselorMapper;
import kgy.service.CounselorService;
import org.springframework.stereotype.Service;
import java.util.List;
import javax.annotation.Resource;

/**
 * (Counselor)表服务实现类
 *
 * @author 康康
 * @since 2022-08-25 12:08:55
 */
@Service("counselorService")
public class CounselorServiceImpl implements CounselorService {
    @Resource
    private CounselorMapper counselorMapper;

    /**
     * 查询所有数据
     *
     * @return 实例对象集合
     */
    @Override
    public List<Counselor> queryAll() {
        return this.counselorMapper.queryAll();
    }
    
    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Counselor queryById(Integer id) {
        return this.counselorMapper.queryById(id);
    }

    /**
     * 新增数据
     *
     * @param counselor 实例对象
     * @return 实例对象
     */
    @Override
    public Counselor insert(Counselor counselor) {
        this.counselorMapper.insert(counselor);
        return counselor;
    }

    /**
     * 修改数据
     *
     * @param counselor 实例对象
     * @return 实例对象
     */
    @Override
    public Counselor update(Counselor counselor) {
        this.counselorMapper.update(counselor);
        return this.queryById(counselor.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.counselorMapper.deleteById(id) > 0;
    }
}
