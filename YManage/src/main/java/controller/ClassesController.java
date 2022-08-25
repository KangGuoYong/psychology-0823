package controller;

import entity.Classes;
import kgy.service.ClassesService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import javax.annotation.Resource;

/**
 * (Classes)表控制层
 *
 * @author 康康
 * @since 2022-08-25 12:08:52
 */
@RestController
@RequestMapping("classes")
public class ClassesController {
    /**
     * 服务对象
     */
    @Resource
    private ClassesService classesService;

    /**
     * 查询所有数据
     *
     * @return 实例对象集合
     */
    @GetMapping("queryAll")
    public ResponseEntity<List> queryAll() {
        return ResponseEntity.ok(this.classesService.queryAll());
    }
    
    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/queryById/{id}")
    public ResponseEntity<Classes> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.classesService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param classes 实体
     * @return 新增结果
     */
    @PostMapping("add")
    public ResponseEntity<Classes> add(Classes classes) {
        return ResponseEntity.ok(this.classesService.insert(classes));
    }

    /**
     * 编辑数据
     *
     * @param classes 实体
     * @return 编辑结果
     */
    @PutMapping("edit")
    public ResponseEntity<Classes> edit(Classes classes) {
        return ResponseEntity.ok(this.classesService.update(classes));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping("deleteById")
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.classesService.deleteById(id));
    }

}

