package entity;

import java.io.Serializable;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
/**
 * (Role)实体类
 *
 * @author 康康
 * @since 2022-08-25 12:09:01
 */
public class Role implements Serializable {
    private static final long serialVersionUID = -15033401782690344L;
    
    private Integer id;
    
    private String roleName;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

}

