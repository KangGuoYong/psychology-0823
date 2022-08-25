package controller;

import entity.Diagnose;
import kgy.service.DiagnoseService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import javax.annotation.Resource;

/**
 * (Diagnose)表控制层
 *
 * @author 康康
 * @since 2022-08-25 12:08:55
 */
@RestController
@RequestMapping("diagnose")
public class DiagnoseController {
    /**
     * 服务对象
     */
    @Resource
    private DiagnoseService diagnoseService;

    /**
     * 查询所有数据
     *
     * @return 实例对象集合
     */
    @GetMapping("queryAll")
    public ResponseEntity<List> queryAll() {
        return ResponseEntity.ok(this.diagnoseService.queryAll());
    }
    
    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/queryById/{id}")
    public ResponseEntity<Diagnose> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.diagnoseService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param diagnose 实体
     * @return 新增结果
     */
    @PostMapping("add")
    public ResponseEntity<Diagnose> add(Diagnose diagnose) {
        return ResponseEntity.ok(this.diagnoseService.insert(diagnose));
    }

    /**
     * 编辑数据
     *
     * @param diagnose 实体
     * @return 编辑结果
     */
    @PutMapping("edit")
    public ResponseEntity<Diagnose> edit(Diagnose diagnose) {
        return ResponseEntity.ok(this.diagnoseService.update(diagnose));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping("deleteById")
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.diagnoseService.deleteById(id));
    }

}

