package kgy.mapper;

import entity.Diagnose;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

/**
 * (Diagnose)表数据库访问层
 *
 * @author 康康
 * @since 2022-08-25 12:08:56
 */
@Mapper
public interface DiagnoseMapper {

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
     * 统计总行数
     *
     * @param diagnose 查询条件
     * @return 总行数
     */
    long count(Diagnose diagnose);

    /**
     * 新增数据
     *
     * @param diagnose 实例对象
     * @return 影响行数
     */
    int insert(Diagnose diagnose);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Diagnose> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Diagnose> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Diagnose> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Diagnose> entities);

    /**
     * 修改数据
     *
     * @param diagnose 实例对象
     * @return 影响行数
     */
    int update(Diagnose diagnose);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

