package kgy.service;

import entity.FieldCounselor;
import java.util.List;

/**
 * (FieldCounselor)表服务接口
 *
 * @author 康康
 * @since 2022-08-25 12:08:57
 */
public interface FieldCounselorService {

    /**
     * 查询所有数据
     *
     * @return 实例对象集合
     */
    List<FieldCounselor> queryAll();
    
    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    FieldCounselor queryById(Integer id);

    /**
     * 新增数据
     *
     * @param fieldCounselor 实例对象
     * @return 实例对象
     */
    FieldCounselor insert(FieldCounselor fieldCounselor);

    /**
     * 修改数据
     *
     * @param fieldCounselor 实例对象
     * @return 实例对象
     */
    FieldCounselor update(FieldCounselor fieldCounselor);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
