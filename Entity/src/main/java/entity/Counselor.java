package entity;

import java.io.Serializable;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
/**
 * (Counselor)实体类
 *
 * @author 康康
 * @since 2022-08-25 12:08:55
 */
public class Counselor implements Serializable {
    private static final long serialVersionUID = 655551139593777733L;
    
    private Integer id;
    
    private String photo;
    
    private String counselorName;
    
    private String school;
    
    private String position;
    
    private String background;
    
    private String introduction;
    
    private Integer price;
    
    private Integer money;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getCounselorName() {
        return counselorName;
    }

    public void setCounselorName(String counselorName) {
        this.counselorName = counselorName;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

}

