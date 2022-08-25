package kgy.mapper;

import entity.Users;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

/**
 * (Users)表数据库访问层
 *
 * @author 康康
 * @since 2022-08-25 12:09:05
 */
@Mapper
public interface UsersMapper {

    /**
     * 查询所有数据
     *
     * @return 实例对象集合
     */
    List<Users> queryAll();
     
    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Users queryById(Integer id);
     
    /**
     * 统计总行数
     *
     * @param users 查询条件
     * @return 总行数
     */
    long count(Users users);

    /**
     * 新增数据
     *
     * @param users 实例对象
     * @return 影响行数
     */
    int insert(Users users);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Users> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Users> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Users> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Users> entities);

    /**
     * 修改数据
     *
     * @param users 实例对象
     * @return 影响行数
     */
    int update(Users users);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

