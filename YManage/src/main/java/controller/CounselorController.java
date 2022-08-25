package controller;

import entity.Counselor;
import kgy.service.CounselorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import javax.annotation.Resource;

/**
 * (Counselor)表控制层
 *
 * @author 康康
 * @since 2022-08-25 12:08:54
 */
@RestController
@RequestMapping("counselor")
public class CounselorController {
    /**
     * 服务对象
     */
    @Resource
    private CounselorService counselorService;

    /**
     * 查询所有数据
     *
     * @return 实例对象集合
     */
    @GetMapping("queryAll")
    public ResponseEntity<List> queryAll() {
        return ResponseEntity.ok(this.counselorService.queryAll());
    }
    
    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/queryById/{id}")
    public ResponseEntity<Counselor> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.counselorService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param counselor 实体
     * @return 新增结果
     */
    @PostMapping("add")
    public ResponseEntity<Counselor> add(Counselor counselor) {
        return ResponseEntity.ok(this.counselorService.insert(counselor));
    }

    /**
     * 编辑数据
     *
     * @param counselor 实体
     * @return 编辑结果
     */
    @PutMapping("edit")
    public ResponseEntity<Counselor> edit(Counselor counselor) {
        return ResponseEntity.ok(this.counselorService.update(counselor));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping("deleteById")
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.counselorService.deleteById(id));
    }

}

