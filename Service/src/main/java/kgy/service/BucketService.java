package kgy.service;

import entity.Bucket;
import java.util.List;

/**
 * (Bucket)表服务接口
 *
 * @author 康康
 * @since 2022-08-25 12:08:52
 */
public interface BucketService {

    /**
     * 查询所有数据
     *
     * @return 实例对象集合
     */
    List<Bucket> queryAll();
    
    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Bucket queryById(Integer id);

    /**
     * 新增数据
     *
     * @param bucket 实例对象
     * @return 实例对象
     */
    Bucket insert(Bucket bucket);

    /**
     * 修改数据
     *
     * @param bucket 实例对象
     * @return 实例对象
     */
    Bucket update(Bucket bucket);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
