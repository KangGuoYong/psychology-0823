package entity;

import java.io.Serializable;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
/**
 * (FieldCounselor)实体类
 *
 * @author 康康
 * @since 2022-08-25 12:08:57
 */
public class FieldCounselor implements Serializable {
    private static final long serialVersionUID = -57334384388219038L;
    
    private Integer id;
    
    private Integer counselorId;
    
    private Integer fieldId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCounselorId() {
        return counselorId;
    }

    public void setCounselorId(Integer counselorId) {
        this.counselorId = counselorId;
    }

    public Integer getFieldId() {
        return fieldId;
    }

    public void setFieldId(Integer fieldId) {
        this.fieldId = fieldId;
    }

}

