package kgy.service;

import entity.Diagnose;
import java.util.List;

/**
 * (Diagnose)表服务接口
 *
 * @author 康康
 * @since 2022-08-25 12:08:56
 */
public interface DiagnoseService {

    /**
     * 查询所有数据
     *
     * @return 实例对象集合
     */
    List<Diagnose> queryAll();
    
    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Diagnose queryById(Integer id);

    /**
     * 新增数据
     *
     * @param diagnose 实例对象
     * @return 实例对象
     */
    Diagnose insert(Diagnose diagnose);

    /**
     * 修改数据
     *
     * @param diagnose 实例对象
     * @return 实例对象
     */
    Diagnose update(Diagnose diagnose);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
