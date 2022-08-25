package controller;

import entity.Bucket;
import kgy.service.BucketService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import javax.annotation.Resource;

/**
 * (Bucket)表控制层
 *
 * @author 康康
 * @since 2022-08-25 12:08:51
 */
@RestController
@RequestMapping("bucket")
public class BucketController {
    /**
     * 服务对象
     */
    @Resource
    private BucketService bucketService;

    /**
     * 查询所有数据
     *
     * @return 实例对象集合
     */
    @GetMapping("queryAll")
    public ResponseEntity<List> queryAll() {
        return ResponseEntity.ok(this.bucketService.queryAll());
    }
    
    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/queryById/{id}")
    public ResponseEntity<Bucket> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.bucketService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param bucket 实体
     * @return 新增结果
     */
    @PostMapping("add")
    public ResponseEntity<Bucket> add(Bucket bucket) {
        return ResponseEntity.ok(this.bucketService.insert(bucket));
    }

    /**
     * 编辑数据
     *
     * @param bucket 实体
     * @return 编辑结果
     */
    @PutMapping("edit")
    public ResponseEntity<Bucket> edit(Bucket bucket) {
        return ResponseEntity.ok(this.bucketService.update(bucket));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping("deleteById")
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.bucketService.deleteById(id));
    }

}

