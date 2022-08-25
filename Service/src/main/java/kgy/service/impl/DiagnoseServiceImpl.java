package kgy.service.impl;

import entity.Diagnose;
import kgy.mapper.DiagnoseMapper;
import kgy.service.DiagnoseService;
import org.springframework.stereotype.Service;
import java.util.List;
import javax.annotation.Resource;

/**
 * (Diagnose)表服务实现类
 *
 * @author 康康
 * @since 2022-08-25 12:08:56
 */
@Service("diagnoseService")
public class DiagnoseServiceImpl implements DiagnoseService {
    @Resource
    private DiagnoseMapper diagnoseMapper;

    /**
     * 查询所有数据
     *
     * @return 实例对象集合
     */
    @Override
    public List<Diagnose> queryAll() {
        return this.diagnoseMapper.queryAll();
    }
    
    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Diagnose queryById(Integer id) {
        return this.diagnoseMapper.queryById(id);
    }

    /**
     * 新增数据
     *
     * @param diagnose 实例对象
     * @return 实例对象
     */
    @Override
    public Diagnose insert(Diagnose diagnose) {
        this.diagnoseMapper.insert(diagnose);
        return diagnose;
    }

    /**
     * 修改数据
     *
     * @param diagnose 实例对象
     * @return 实例对象
     */
    @Override
    public Diagnose update(Diagnose diagnose) {
        this.diagnoseMapper.update(diagnose);
        return this.queryById(diagnose.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.diagnoseMapper.deleteById(id) > 0;
    }
}
