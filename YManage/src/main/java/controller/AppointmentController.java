package controller;

import entity.Appointment;
import kgy.service.AppointmentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import javax.annotation.Resource;

/**
 * (Appointment)表控制层
 *
 * @author 康康
 * @since 2022-08-25 12:08:43
 */
@RestController
@RequestMapping("appointment")
public class AppointmentController {
    /**
     * 服务对象
     */
    @Resource
    private AppointmentService appointmentService;

    /**
     * 查询所有数据
     *
     * @return 实例对象集合
     */
    @GetMapping("queryAll")
    public ResponseEntity<List> queryAll() {
        return ResponseEntity.ok(this.appointmentService.queryAll());
    }
    
    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/queryById/{id}")
    public ResponseEntity<Appointment> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.appointmentService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param appointment 实体
     * @return 新增结果
     */
    @PostMapping("add")
    public ResponseEntity<Appointment> add(Appointment appointment) {
        return ResponseEntity.ok(this.appointmentService.insert(appointment));
    }

    /**
     * 编辑数据
     *
     * @param appointment 实体
     * @return 编辑结果
     */
    @PutMapping("edit")
    public ResponseEntity<Appointment> edit(Appointment appointment) {
        return ResponseEntity.ok(this.appointmentService.update(appointment));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping("deleteById")
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.appointmentService.deleteById(id));
    }

}

