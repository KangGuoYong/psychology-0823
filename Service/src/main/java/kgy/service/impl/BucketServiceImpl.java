package kgy.service.impl;

import entity.Bucket;
import kgy.mapper.BucketMapper;
import kgy.service.BucketService;
import org.springframework.stereotype.Service;
import java.util.List;
import javax.annotation.Resource;

/**
 * (Bucket)表服务实现类
 *
 * @author 康康
 * @since 2022-08-25 12:08:52
 */
@Service("bucketService")
public class BucketServiceImpl implements BucketService {
    @Resource
    private BucketMapper bucketMapper;

    /**
     * 查询所有数据
     *
     * @return 实例对象集合
     */
    @Override
    public List<Bucket> queryAll() {
        return this.bucketMapper.queryAll();
    }
    
    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Bucket queryById(Integer id) {
        return this.bucketMapper.queryById(id);
    }

    /**
     * 新增数据
     *
     * @param bucket 实例对象
     * @return 实例对象
     */
    @Override
    public Bucket insert(Bucket bucket) {
        this.bucketMapper.insert(bucket);
        return bucket;
    }

    /**
     * 修改数据
     *
     * @param bucket 实例对象
     * @return 实例对象
     */
    @Override
    public Bucket update(Bucket bucket) {
        this.bucketMapper.update(bucket);
        return this.queryById(bucket.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.bucketMapper.deleteById(id) > 0;
    }
}
