package kgy.service;

import entity.Counselor;
import java.util.List;

/**
 * (Counselor)表服务接口
 *
 * @author 康康
 * @since 2022-08-25 12:08:55
 */
public interface CounselorService {

    /**
     * 查询所有数据
     *
     * @return 实例对象集合
     */
    List<Counselor> queryAll();
    
    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Counselor queryById(Integer id);

    /**
     * 新增数据
     *
     * @param counselor 实例对象
     * @return 实例对象
     */
    Counselor insert(Counselor counselor);

    /**
     * 修改数据
     *
     * @param counselor 实例对象
     * @return 实例对象
     */
    Counselor update(Counselor counselor);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
