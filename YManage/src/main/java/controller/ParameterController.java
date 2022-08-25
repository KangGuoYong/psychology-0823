package controller;

import entity.Parameter;
import kgy.service.ParameterService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import javax.annotation.Resource;

/**
 * (Parameter)表控制层
 *
 * @author 康康
 * @since 2022-08-25 12:08:59
 */
@RestController
@RequestMapping("parameter")
public class ParameterController {
    /**
     * 服务对象
     */
    @Resource
    private ParameterService parameterService;

    /**
     * 查询所有数据
     *
     * @return 实例对象集合
     */
    @GetMapping("queryAll")
    public ResponseEntity<List> queryAll() {
        return ResponseEntity.ok(this.parameterService.queryAll());
    }
    
    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/queryById/{id}")
    public ResponseEntity<Parameter> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.parameterService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param parameter 实体
     * @return 新增结果
     */
    @PostMapping("add")
    public ResponseEntity<Parameter> add(Parameter parameter) {
        return ResponseEntity.ok(this.parameterService.insert(parameter));
    }

    /**
     * 编辑数据
     *
     * @param parameter 实体
     * @return 编辑结果
     */
    @PutMapping("edit")
    public ResponseEntity<Parameter> edit(Parameter parameter) {
        return ResponseEntity.ok(this.parameterService.update(parameter));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping("deleteById")
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.parameterService.deleteById(id));
    }

}

