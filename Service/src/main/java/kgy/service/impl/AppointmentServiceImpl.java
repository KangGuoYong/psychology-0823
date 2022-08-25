package kgy.service.impl;

import entity.Appointment;
import kgy.mapper.AppointmentMapper;
import kgy.service.AppointmentService;
import org.springframework.stereotype.Service;
import java.util.List;
import javax.annotation.Resource;

/**
 * (Appointment)表服务实现类
 *
 * @author 康康
 * @since 2022-08-25 12:08:48
 */
@Service("appointmentService")
public class AppointmentServiceImpl implements AppointmentService {
    @Resource
    private AppointmentMapper appointmentMapper;

    /**
     * 查询所有数据
     *
     * @return 实例对象集合
     */
    @Override
    public List<Appointment> queryAll() {
        return this.appointmentMapper.queryAll();
    }
    
    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Appointment queryById(Integer id) {
        return this.appointmentMapper.queryById(id);
    }

    /**
     * 新增数据
     *
     * @param appointment 实例对象
     * @return 实例对象
     */
    @Override
    public Appointment insert(Appointment appointment) {
        this.appointmentMapper.insert(appointment);
        return appointment;
    }

    /**
     * 修改数据
     *
     * @param appointment 实例对象
     * @return 实例对象
     */
    @Override
    public Appointment update(Appointment appointment) {
        this.appointmentMapper.update(appointment);
        return this.queryById(appointment.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.appointmentMapper.deleteById(id) > 0;
    }
}
