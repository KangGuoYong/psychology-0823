package controller;

import entity.Field;
import kgy.service.FieldService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import javax.annotation.Resource;

/**
 * (Field)表控制层
 *
 * @author 康康
 * @since 2022-08-25 12:08:56
 */
@RestController
@RequestMapping("field")
public class FieldController {
    /**
     * 服务对象
     */
    @Resource
    private FieldService fieldService;

    /**
     * 查询所有数据
     *
     * @return 实例对象集合
     */
    @GetMapping("queryAll")
    public ResponseEntity<List> queryAll() {
        return ResponseEntity.ok(this.fieldService.queryAll());
    }
    
    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/queryById/{id}")
    public ResponseEntity<Field> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.fieldService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param field 实体
     * @return 新增结果
     */
    @PostMapping("add")
    public ResponseEntity<Field> add(Field field) {
        return ResponseEntity.ok(this.fieldService.insert(field));
    }

    /**
     * 编辑数据
     *
     * @param field 实体
     * @return 编辑结果
     */
    @PutMapping("edit")
    public ResponseEntity<Field> edit(Field field) {
        return ResponseEntity.ok(this.fieldService.update(field));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping("deleteById")
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.fieldService.deleteById(id));
    }

}

