package kgy.service.impl;

import entity.Parameter;
import kgy.mapper.ParameterMapper;
import kgy.service.ParameterService;
import org.springframework.stereotype.Service;
import java.util.List;
import javax.annotation.Resource;

/**
 * (Parameter)表服务实现类
 *
 * @author 康康
 * @since 2022-08-25 12:08:59
 */
@Service("parameterService")
public class ParameterServiceImpl implements ParameterService {
    @Resource
    private ParameterMapper parameterMapper;

    /**
     * 查询所有数据
     *
     * @return 实例对象集合
     */
    @Override
    public List<Parameter> queryAll() {
        return this.parameterMapper.queryAll();
    }
    
    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Parameter queryById(Integer id) {
        return this.parameterMapper.queryById(id);
    }

    /**
     * 新增数据
     *
     * @param parameter 实例对象
     * @return 实例对象
     */
    @Override
    public Parameter insert(Parameter parameter) {
        this.parameterMapper.insert(parameter);
        return parameter;
    }

    /**
     * 修改数据
     *
     * @param parameter 实例对象
     * @return 实例对象
     */
    @Override
    public Parameter update(Parameter parameter) {
        this.parameterMapper.update(parameter);
        return this.queryById(parameter.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.parameterMapper.deleteById(id) > 0;
    }
}
