package controller;

import entity.FieldCounselor;
import kgy.service.FieldCounselorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import javax.annotation.Resource;

/**
 * (FieldCounselor)表控制层
 *
 * @author 康康
 * @since 2022-08-25 12:08:57
 */
@RestController
@RequestMapping("fieldCounselor")
public class FieldCounselorController {
    /**
     * 服务对象
     */
    @Resource
    private FieldCounselorService fieldCounselorService;

    /**
     * 查询所有数据
     *
     * @return 实例对象集合
     */
    @GetMapping("queryAll")
    public ResponseEntity<List> queryAll() {
        return ResponseEntity.ok(this.fieldCounselorService.queryAll());
    }
    
    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/queryById/{id}")
    public ResponseEntity<FieldCounselor> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.fieldCounselorService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param fieldCounselor 实体
     * @return 新增结果
     */
    @PostMapping("add")
    public ResponseEntity<FieldCounselor> add(FieldCounselor fieldCounselor) {
        return ResponseEntity.ok(this.fieldCounselorService.insert(fieldCounselor));
    }

    /**
     * 编辑数据
     *
     * @param fieldCounselor 实体
     * @return 编辑结果
     */
    @PutMapping("edit")
    public ResponseEntity<FieldCounselor> edit(FieldCounselor fieldCounselor) {
        return ResponseEntity.ok(this.fieldCounselorService.update(fieldCounselor));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping("deleteById")
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.fieldCounselorService.deleteById(id));
    }

}

