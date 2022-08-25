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
 * (CounselorAssembly)实体类
 *
 * @author 康康
 * @since 2022-08-25 12:08:54
 */
public class CounselorAssembly implements Serializable {
    private static final long serialVersionUID = 671567001252308508L;
    
    private Integer id;
    
    private Date createTime;
    
    private String userName;
    
    private Integer price;
    
    private Integer priceStatus;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getPriceStatus() {
        return priceStatus;
    }

    public void setPriceStatus(Integer priceStatus) {
        this.priceStatus = priceStatus;
    }

}

