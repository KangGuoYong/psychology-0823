package kgy.service;

import entity.Question;
import java.util.List;

/**
 * (Question)表服务接口
 *
 * @author 康康
 * @since 2022-08-25 12:09:00
 */
public interface QuestionService {

    /**
     * 查询所有数据
     *
     * @return 实例对象集合
     */
    List<Question> queryAll();
    
    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Question queryById(Integer id);

    /**
     * 新增数据
     *
     * @param question 实例对象
     * @return 实例对象
     */
    Question insert(Question question);

    /**
     * 修改数据
     *
     * @param question 实例对象
     * @return 实例对象
     */
    Question update(Question question);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
