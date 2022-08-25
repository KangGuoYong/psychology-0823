package entity;

import java.io.Serializable;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
/**
 * (Field)实体类
 *
 * @author 康康
 * @since 2022-08-25 12:08:56
 */
public class Field implements Serializable {
    private static final long serialVersionUID = -66852469761177973L;
    
    private Integer id;
    
    private String filedName;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFiledName() {
        return filedName;
    }

    public void setFiledName(String filedName) {
        this.filedName = filedName;
    }

}

