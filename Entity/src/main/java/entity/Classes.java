package entity;

import java.io.Serializable;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
/**
 * (Classes)实体类
 *
 * @author 康康
 * @since 2022-08-25 12:08:53
 */
public class Classes implements Serializable {
    private static final long serialVersionUID = 865419323371969494L;
    
    private Integer id;
    
    private String classesDay;
    
    private String time;
    
    private Integer classesStatus;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClassesDay() {
        return classesDay;
    }

    public void setClassesDay(String classesDay) {
        this.classesDay = classesDay;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Integer getClassesStatus() {
        return classesStatus;
    }

    public void setClassesStatus(Integer classesStatus) {
        this.classesStatus = classesStatus;
    }

}

