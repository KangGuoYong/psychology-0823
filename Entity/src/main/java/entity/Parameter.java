package entity;

import java.io.Serializable;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
/**
 * (Parameter)实体类
 *
 * @author 康康
 * @since 2022-08-25 12:08:59
 */
public class Parameter implements Serializable {
    private static final long serialVersionUID = 202632757192322724L;
    
    private Integer id;
    
    private String keyName;
    
    private String type;
    
    private String valueName;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getKeyName() {
        return keyName;
    }

    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValueName() {
        return valueName;
    }

    public void setValueName(String valueName) {
        this.valueName = valueName;
    }

}

