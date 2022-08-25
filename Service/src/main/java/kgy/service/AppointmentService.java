package kgy.service;

import entity.Appointment;
import java.util.List;

/**
 * (Appointment)表服务接口
 *
 * @author 康康
 * @since 2022-08-25 12:08:47
 */
public interface AppointmentService {

    /**
     * 查询所有数据
     *
     * @return 实例对象集合
     */
    List<Appointment> queryAll();
    
    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Appointment queryById(Integer id);

    /**
     * 新增数据
     *
     * @param appointment 实例对象
     * @return 实例对象
     */
    Appointment insert(Appointment appointment);

    /**
     * 修改数据
     *
     * @param appointment 实例对象
     * @return 实例对象
     */
    Appointment update(Appointment appointment);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
