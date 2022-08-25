package entity;

import java.util.Date;
import java.io.Serializable;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
/**
 * (Log)实体类
 *
 * @author 康康
 * @since 2022-08-25 12:08:58
 */
public class Log implements Serializable {
    private static final long serialVersionUID = -70846531494084143L;
    
    private Integer id;
    
    private Integer num;
    
    private String operationPeople;
    
    private Date time;
    
    private String item;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getOperationPeople() {
        return operationPeople;
    }

    public void setOperationPeople(String operationPeople) {
        this.operationPeople = operationPeople;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

}

