package controller;

import entity.UserAssembly;
import kgy.service.UserAssemblyService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import javax.annotation.Resource;

/**
 * (UserAssembly)表控制层
 *
 * @author 康康
 * @since 2022-08-25 12:09:02
 */
@RestController
@RequestMapping("userAssembly")
public class UserAssemblyController {
    /**
     * 服务对象
     */
    @Resource
    private UserAssemblyService userAssemblyService;

    /**
     * 查询所有数据
     *
     * @return 实例对象集合
     */
    @GetMapping("queryAll")
    public ResponseEntity<List> queryAll() {
        return ResponseEntity.ok(this.userAssemblyService.queryAll());
    }
    
    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/queryById/{id}")
    public ResponseEntity<UserAssembly> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.userAssemblyService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param userAssembly 实体
     * @return 新增结果
     */
    @PostMapping("add")
    public ResponseEntity<UserAssembly> add(UserAssembly userAssembly) {
        return ResponseEntity.ok(this.userAssemblyService.insert(userAssembly));
    }

    /**
     * 编辑数据
     *
     * @param userAssembly 实体
     * @return 编辑结果
     */
    @PutMapping("edit")
    public ResponseEntity<UserAssembly> edit(UserAssembly userAssembly) {
        return ResponseEntity.ok(this.userAssemblyService.update(userAssembly));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping("deleteById")
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.userAssemblyService.deleteById(id));
    }

}

