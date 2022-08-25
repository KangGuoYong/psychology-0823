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
 * (Train)实体类
 *
 * @author 康康
 * @since 2022-08-25 12:09:02
 */
public class Train implements Serializable {
    private static final long serialVersionUID = -31450979702033044L;
    
    private Integer id;
    
    private String trainTitle;
    
    private String trainName;
    
    private Date time;
    
    private Integer peopleNum;
    
    private Integer price;
    
    private Integer trainStatus;
    
    private String introductioin;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTrainTitle() {
        return trainTitle;
    }

    public void setTrainTitle(String trainTitle) {
        this.trainTitle = trainTitle;
    }

    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Integer getPeopleNum() {
        return peopleNum;
    }

    public void setPeopleNum(Integer peopleNum) {
        this.peopleNum = peopleNum;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getTrainStatus() {
        return trainStatus;
    }

    public void setTrainStatus(Integer trainStatus) {
        this.trainStatus = trainStatus;
    }

    public String getIntroductioin() {
        return introductioin;
    }

    public void setIntroductioin(String introductioin) {
        this.introductioin = introductioin;
    }

}

