package controller;

import entity.CounselorAssembly;
import kgy.service.CounselorAssemblyService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import javax.annotation.Resource;

/**
 * (CounselorAssembly)表控制层
 *
 * @author 康康
 * @since 2022-08-25 12:08:53
 */
@RestController
@RequestMapping("counselorAssembly")
public class CounselorAssemblyController {
    /**
     * 服务对象
     */
    @Resource
    private CounselorAssemblyService counselorAssemblyService;

    /**
     * 查询所有数据
     *
     * @return 实例对象集合
     */
    @GetMapping("queryAll")
    public ResponseEntity<List> queryAll() {
        return ResponseEntity.ok(this.counselorAssemblyService.queryAll());
    }
    
    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/queryById/{id}")
    public ResponseEntity<CounselorAssembly> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.counselorAssemblyService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param counselorAssembly 实体
     * @return 新增结果
     */
    @PostMapping("add")
    public ResponseEntity<CounselorAssembly> add(CounselorAssembly counselorAssembly) {
        return ResponseEntity.ok(this.counselorAssemblyService.insert(counselorAssembly));
    }

    /**
     * 编辑数据
     *
     * @param counselorAssembly 实体
     * @return 编辑结果
     */
    @PutMapping("edit")
    public ResponseEntity<CounselorAssembly> edit(CounselorAssembly counselorAssembly) {
        return ResponseEntity.ok(this.counselorAssemblyService.update(counselorAssembly));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping("deleteById")
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.counselorAssemblyService.deleteById(id));
    }

}

