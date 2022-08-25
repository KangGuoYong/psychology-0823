package controller;

import entity.RoleMenu;
import kgy.service.RoleMenuService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import javax.annotation.Resource;

/**
 * (RoleMenu)表控制层
 *
 * @author 康康
 * @since 2022-08-25 12:09:01
 */
@RestController
@RequestMapping("roleMenu")
public class RoleMenuController {
    /**
     * 服务对象
     */
    @Resource
    private RoleMenuService roleMenuService;

    /**
     * 查询所有数据
     *
     * @return 实例对象集合
     */
    @GetMapping("queryAll")
    public ResponseEntity<List> queryAll() {
        return ResponseEntity.ok(this.roleMenuService.queryAll());
    }
    
    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/queryById/{id}")
    public ResponseEntity<RoleMenu> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.roleMenuService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param roleMenu 实体
     * @return 新增结果
     */
    @PostMapping("add")
    public ResponseEntity<RoleMenu> add(RoleMenu roleMenu) {
        return ResponseEntity.ok(this.roleMenuService.insert(roleMenu));
    }

    /**
     * 编辑数据
     *
     * @param roleMenu 实体
     * @return 编辑结果
     */
    @PutMapping("edit")
    public ResponseEntity<RoleMenu> edit(RoleMenu roleMenu) {
        return ResponseEntity.ok(this.roleMenuService.update(roleMenu));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping("deleteById")
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.roleMenuService.deleteById(id));
    }

}

