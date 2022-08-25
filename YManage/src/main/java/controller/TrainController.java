package controller;

import entity.Train;
import kgy.service.TrainService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import javax.annotation.Resource;

/**
 * (Train)表控制层
 *
 * @author 康康
 * @since 2022-08-25 12:09:01
 */
@RestController
@RequestMapping("train")
public class TrainController {
    /**
     * 服务对象
     */
    @Resource
    private TrainService trainService;

    /**
     * 查询所有数据
     *
     * @return 实例对象集合
     */
    @GetMapping("queryAll")
    public ResponseEntity<List> queryAll() {
        return ResponseEntity.ok(this.trainService.queryAll());
    }
    
    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/queryById/{id}")
    public ResponseEntity<Train> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.trainService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param train 实体
     * @return 新增结果
     */
    @PostMapping("add")
    public ResponseEntity<Train> add(Train train) {
        return ResponseEntity.ok(this.trainService.insert(train));
    }

    /**
     * 编辑数据
     *
     * @param train 实体
     * @return 编辑结果
     */
    @PutMapping("edit")
    public ResponseEntity<Train> edit(Train train) {
        return ResponseEntity.ok(this.trainService.update(train));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping("deleteById")
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.trainService.deleteById(id));
    }

}

