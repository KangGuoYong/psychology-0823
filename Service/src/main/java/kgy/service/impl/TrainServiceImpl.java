package kgy.service.impl;

import entity.Train;
import kgy.mapper.TrainMapper;
import kgy.service.TrainService;
import org.springframework.stereotype.Service;
import java.util.List;
import javax.annotation.Resource;

/**
 * (Train)表服务实现类
 *
 * @author 康康
 * @since 2022-08-25 12:09:02
 */
@Service("trainService")
public class TrainServiceImpl implements TrainService {
    @Resource
    private TrainMapper trainMapper;

    /**
     * 查询所有数据
     *
     * @return 实例对象集合
     */
    @Override
    public List<Train> queryAll() {
        return this.trainMapper.queryAll();
    }
    
    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Train queryById(Integer id) {
        return this.trainMapper.queryById(id);
    }

    /**
     * 新增数据
     *
     * @param train 实例对象
     * @return 实例对象
     */
    @Override
    public Train insert(Train train) {
        this.trainMapper.insert(train);
        return train;
    }

    /**
     * 修改数据
     *
     * @param train 实例对象
     * @return 实例对象
     */
    @Override
    public Train update(Train train) {
        this.trainMapper.update(train);
        return this.queryById(train.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.trainMapper.deleteById(id) > 0;
    }
}
