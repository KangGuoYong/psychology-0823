package controller;

import entity.Role;
import kgy.service.RoleService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import javax.annotation.Resource;

/**
 * (Role)表控制层
 *
 * @author 康康
 * @since 2022-08-25 12:09:00
 */
@RestController
@RequestMapping("role")
public class RoleController {
    /**
     * 服务对象
     */
    @Resource
    private RoleService roleService;

    /**
     * 查询所有数据
     *
     * @return 实例对象集合
     */
    @GetMapping("queryAll")
    public ResponseEntity<List> queryAll() {
        return ResponseEntity.ok(this.roleService.queryAll());
    }
    
    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/queryById/{id}")
    public ResponseEntity<Role> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.roleService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param role 实体
     * @return 新增结果
     */
    @PostMapping("add")
    public ResponseEntity<Role> add(Role role) {
        return ResponseEntity.ok(this.roleService.insert(role));
    }

    /**
     * 编辑数据
     *
     * @param role 实体
     * @return 编辑结果
     */
    @PutMapping("edit")
    public ResponseEntity<Role> edit(Role role) {
        return ResponseEntity.ok(this.roleService.update(role));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping("deleteById")
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.roleService.deleteById(id));
    }

}

