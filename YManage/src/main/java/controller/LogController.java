package controller;

import entity.Log;
import kgy.service.LogService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import javax.annotation.Resource;

/**
 * (Log)表控制层
 *
 * @author 康康
 * @since 2022-08-25 12:08:57
 */
@RestController
@RequestMapping("log")
public class LogController {
    /**
     * 服务对象
     */
    @Resource
    private LogService logService;

    /**
     * 查询所有数据
     *
     * @return 实例对象集合
     */
    @GetMapping("queryAll")
    public ResponseEntity<List> queryAll() {
        return ResponseEntity.ok(this.logService.queryAll());
    }
    
    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/queryById/{id}")
    public ResponseEntity<Log> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.logService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param log 实体
     * @return 新增结果
     */
    @PostMapping("add")
    public ResponseEntity<Log> add(Log log) {
        return ResponseEntity.ok(this.logService.insert(log));
    }

    /**
     * 编辑数据
     *
     * @param log 实体
     * @return 编辑结果
     */
    @PutMapping("edit")
    public ResponseEntity<Log> edit(Log log) {
        return ResponseEntity.ok(this.logService.update(log));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping("deleteById")
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.logService.deleteById(id));
    }

}

