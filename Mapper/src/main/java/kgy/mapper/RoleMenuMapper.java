package kgy.mapper;

import entity.RoleMenu;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

/**
 * (RoleMenu)表数据库访问层
 *
 * @author 康康
 * @since 2022-08-25 12:09:01
 */
@Mapper
public interface RoleMenuMapper {

    /**
     * 查询所有数据
     *
     * @return 实例对象集合
     */
    List<RoleMenu> queryAll();
     
    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    RoleMenu queryById(Integer id);
     
    /**
     * 统计总行数
     *
     * @param roleMenu 查询条件
     * @return 总行数
     */
    long count(RoleMenu roleMenu);

    /**
     * 新增数据
     *
     * @param roleMenu 实例对象
     * @return 影响行数
     */
    int insert(RoleMenu roleMenu);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<RoleMenu> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<RoleMenu> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<RoleMenu> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<RoleMenu> entities);

    /**
     * 修改数据
     *
     * @param roleMenu 实例对象
     * @return 影响行数
     */
    int update(RoleMenu roleMenu);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

