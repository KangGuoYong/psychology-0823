package kgy.service.impl;

import entity.Log;
import kgy.mapper.LogMapper;
import kgy.service.LogService;
import org.springframework.stereotype.Service;
import java.util.List;
import javax.annotation.Resource;

/**
 * (Log)表服务实现类
 *
 * @author 康康
 * @since 2022-08-25 12:08:58
 */
@Service("logService")
public class LogServiceImpl implements LogService {
    @Resource
    private LogMapper logMapper;

    /**
     * 查询所有数据
     *
     * @return 实例对象集合
     */
    @Override
    public List<Log> queryAll() {
        return this.logMapper.queryAll();
    }
    
    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Log queryById(Integer id) {
        return this.logMapper.queryById(id);
    }

    /**
     * 新增数据
     *
     * @param log 实例对象
     * @return 实例对象
     */
    @Override
    public Log insert(Log log) {
        this.logMapper.insert(log);
        return log;
    }

    /**
     * 修改数据
     *
     * @param log 实例对象
     * @return 实例对象
     */
    @Override
    public Log update(Log log) {
        this.logMapper.update(log);
        return this.queryById(log.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.logMapper.deleteById(id) > 0;
    }
}
