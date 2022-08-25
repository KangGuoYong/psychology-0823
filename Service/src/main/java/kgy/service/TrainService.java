package kgy.service;

import entity.Train;
import java.util.List;

/**
 * (Train)表服务接口
 *
 * @author 康康
 * @since 2022-08-25 12:09:02
 */
public interface TrainService {

    /**
     * 查询所有数据
     *
     * @return 实例对象集合
     */
    List<Train> queryAll();
    
    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Train queryById(Integer id);

    /**
     * 新增数据
     *
     * @param train 实例对象
     * @return 实例对象
     */
    Train insert(Train train);

    /**
     * 修改数据
     *
     * @param train 实例对象
     * @return 实例对象
     */
    Train update(Train train);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
