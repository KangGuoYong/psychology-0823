package controller;

import entity.Menu;
import kgy.service.MenuService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import javax.annotation.Resource;

/**
 * (Menu)表控制层
 *
 * @author 康康
 * @since 2022-08-25 12:08:58
 */
@RestController
@RequestMapping("menu")
public class MenuController {
    /**
     * 服务对象
     */
    @Resource
    private MenuService menuService;

    /**
     * 查询所有数据
     *
     * @return 实例对象集合
     */
    @GetMapping("queryAll")
    public ResponseEntity<List> queryAll() {
        return ResponseEntity.ok(this.menuService.queryAll());
    }
    
    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/queryById/{id}")
    public ResponseEntity<Menu> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.menuService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param menu 实体
     * @return 新增结果
     */
    @PostMapping("add")
    public ResponseEntity<Menu> add(Menu menu) {
        return ResponseEntity.ok(this.menuService.insert(menu));
    }

    /**
     * 编辑数据
     *
     * @param menu 实体
     * @return 编辑结果
     */
    @PutMapping("edit")
    public ResponseEntity<Menu> edit(Menu menu) {
        return ResponseEntity.ok(this.menuService.update(menu));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping("deleteById")
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.menuService.deleteById(id));
    }

}

