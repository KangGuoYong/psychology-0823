package kgy.service.impl;

import entity.CounselorAssembly;
import kgy.mapper.CounselorAssemblyMapper;
import kgy.service.CounselorAssemblyService;
import org.springframework.stereotype.Service;
import java.util.List;
import javax.annotation.Resource;

/**
 * (CounselorAssembly)表服务实现类
 *
 * @author 康康
 * @since 2022-08-25 12:08:54
 */
@Service("counselorAssemblyService")
public class CounselorAssemblyServiceImpl implements CounselorAssemblyService {
    @Resource
    private CounselorAssemblyMapper counselorAssemblyMapper;

    /**
     * 查询所有数据
     *
     * @return 实例对象集合
     */
    @Override
    public List<CounselorAssembly> queryAll() {
        return this.counselorAssemblyMapper.queryAll();
    }
    
    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public CounselorAssembly queryById(Integer id) {
        return this.counselorAssemblyMapper.queryById(id);
    }

    /**
     * 新增数据
     *
     * @param counselorAssembly 实例对象
     * @return 实例对象
     */
    @Override
    public CounselorAssembly insert(CounselorAssembly counselorAssembly) {
        this.counselorAssemblyMapper.insert(counselorAssembly);
        return counselorAssembly;
    }

    /**
     * 修改数据
     *
     * @param counselorAssembly 实例对象
     * @return 实例对象
     */
    @Override
    public CounselorAssembly update(CounselorAssembly counselorAssembly) {
        this.counselorAssemblyMapper.update(counselorAssembly);
        return this.queryById(counselorAssembly.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.counselorAssemblyMapper.deleteById(id) > 0;
    }
}
