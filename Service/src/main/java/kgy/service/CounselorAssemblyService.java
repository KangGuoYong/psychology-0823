package kgy.service;

import entity.CounselorAssembly;
import java.util.List;

/**
 * (CounselorAssembly)表服务接口
 *
 * @author 康康
 * @since 2022-08-25 12:08:54
 */
public interface CounselorAssemblyService {

    /**
     * 查询所有数据
     *
     * @return 实例对象集合
     */
    List<CounselorAssembly> queryAll();
    
    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    CounselorAssembly queryById(Integer id);

    /**
     * 新增数据
     *
     * @param counselorAssembly 实例对象
     * @return 实例对象
     */
    CounselorAssembly insert(CounselorAssembly counselorAssembly);

    /**
     * 修改数据
     *
     * @param counselorAssembly 实例对象
     * @return 实例对象
     */
    CounselorAssembly update(CounselorAssembly counselorAssembly);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
