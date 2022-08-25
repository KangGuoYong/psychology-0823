package entity;

import java.io.Serializable;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
/**
 * (Bucket)实体类
 *
 * @author 康康
 * @since 2022-08-25 12:08:52
 */
public class Bucket implements Serializable {
    private static final long serialVersionUID = -62942248172206331L;
    
    private Integer id;
    
    private String timeBucket;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTimeBucket() {
        return timeBucket;
    }

    public void setTimeBucket(String timeBucket) {
        this.timeBucket = timeBucket;
    }

}

