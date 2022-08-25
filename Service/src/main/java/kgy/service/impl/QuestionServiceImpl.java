package kgy.service.impl;

import entity.Question;
import kgy.mapper.QuestionMapper;
import kgy.service.QuestionService;
import org.springframework.stereotype.Service;
import java.util.List;
import javax.annotation.Resource;

/**
 * (Question)表服务实现类
 *
 * @author 康康
 * @since 2022-08-25 12:09:00
 */
@Service("questionService")
public class QuestionServiceImpl implements QuestionService {
    @Resource
    private QuestionMapper questionMapper;

    /**
     * 查询所有数据
     *
     * @return 实例对象集合
     */
    @Override
    public List<Question> queryAll() {
        return this.questionMapper.queryAll();
    }
    
    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Question queryById(Integer id) {
        return this.questionMapper.queryById(id);
    }

    /**
     * 新增数据
     *
     * @param question 实例对象
     * @return 实例对象
     */
    @Override
    public Question insert(Question question) {
        this.questionMapper.insert(question);
        return question;
    }

    /**
     * 修改数据
     *
     * @param question 实例对象
     * @return 实例对象
     */
    @Override
    public Question update(Question question) {
        this.questionMapper.update(question);
        return this.queryById(question.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.questionMapper.deleteById(id) > 0;
    }
}
