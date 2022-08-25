package controller;

import entity.AdminUser;
import kgy.service.AdminUserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import javax.annotation.Resource;

/**
 * (AdminUser)表控制层
 *
 * @author 康康
 * @since 2022-08-25 12:08:50
 */
@RestController
@RequestMapping("adminUser")
public class AdminUserController {
    /**
     * 服务对象
     */
    @Resource
    private AdminUserService adminUserService;

    /**
     * 查询所有数据
     *
     * @return 实例对象集合
     */
    @GetMapping("queryAll")
    public ResponseEntity<List> queryAll() {
        return ResponseEntity.ok(this.adminUserService.queryAll());
    }
    
    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/queryById/{id}")
    public ResponseEntity<AdminUser> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.adminUserService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param adminUser 实体
     * @return 新增结果
     */
    @PostMapping("add")
    public ResponseEntity<AdminUser> add(AdminUser adminUser) {
        return ResponseEntity.ok(this.adminUserService.insert(adminUser));
    }

    /**
     * 编辑数据
     *
     * @param adminUser 实体
     * @return 编辑结果
     */
    @PutMapping("edit")
    public ResponseEntity<AdminUser> edit(AdminUser adminUser) {
        return ResponseEntity.ok(this.adminUserService.update(adminUser));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping("deleteById")
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.adminUserService.deleteById(id));
    }

}

