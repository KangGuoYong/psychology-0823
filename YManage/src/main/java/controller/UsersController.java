package controller;

import com.alibaba.fastjson.JSON;
import entity.Users;
import kgy.service.UsersService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Users)表控制层
 *
 * @author 康康
 * @since 2022-08-25 12:09:03
 */
@RestController
@RequestMapping("users")
public class UsersController {
    /**
     * 服务对象
     */
    @Resource
    private UsersService usersService;

    /**
     * 查询所有数据
     *
     * @return 实例对象集合
     */
    @GetMapping("/queryAll")
    public ResponseEntity<List> queryAll() {
        return ResponseEntity.ok(this.usersService.queryAll());
    }
    
    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/queryById/{id}")
    public ResponseEntity<Users> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.usersService.queryById(id));
    }

    @GetMapping("/queryUser")
    public String queryUser(Users user) {
        return JSON.toJSONString(this.usersService.queryUser(user));
    }



    /**
     * 新增数据
     *
     * @param users 实体
     * @return 新增结果
     */
    @PostMapping("add")
    public ResponseEntity<Users> add(Users users) {
        return ResponseEntity.ok(this.usersService.insert(users));
    }

    /**
     * 编辑数据
     *
     * @param users 实体
     * @return 编辑结果
     */
    @PutMapping("edit")
    public ResponseEntity<Users> edit(Users users) {
        return ResponseEntity.ok(this.usersService.update(users));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping("deleteById")
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.usersService.deleteById(id));
    }

}

