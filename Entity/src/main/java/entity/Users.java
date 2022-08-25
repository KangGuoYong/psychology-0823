package entity;

import java.io.Serializable;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
/**
 * (Users)实体类
 *
 * @author 康康
 * @since 2022-08-25 12:09:05
 */
public class Users implements Serializable {
    private static final long serialVersionUID = 528552976723365284L;
    
    private Integer id;
    
    private String pwd;
    
    private String sex;
    
    private Integer age;
    
    private String phone;
    
    private String email;
    
    private Integer money;
    
    private Integer usersStatus;
    
    private String userName;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public Integer getUsersStatus() {
        return usersStatus;
    }

    public void setUsersStatus(Integer usersStatus) {
        this.usersStatus = usersStatus;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

}

