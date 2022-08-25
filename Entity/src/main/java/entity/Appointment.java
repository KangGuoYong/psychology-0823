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
 * (Appointment)实体类
 *
 * @author 康康
 * @since 2022-08-25 12:08:49
 */
public class Appointment implements Serializable {
    private static final long serialVersionUID = -77928968151740947L;
    
    private Integer id;
    
    private Integer orderNum;
    
    private Integer scheduleId;
    
    private Integer appointmentStatus;
    
    private String questionDescribe;
    
    private Date appointmentTime;
    
    private String diagnoseReply;
    
    private Date diagnoseTime;
    
    private String evaluate;
    
    private Date evaluateTime;
    
    private Date counselorOkTime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    public Integer getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(Integer scheduleId) {
        this.scheduleId = scheduleId;
    }

    public Integer getAppointmentStatus() {
        return appointmentStatus;
    }

    public void setAppointmentStatus(Integer appointmentStatus) {
        this.appointmentStatus = appointmentStatus;
    }

    public String getQuestionDescribe() {
        return questionDescribe;
    }

    public void setQuestionDescribe(String questionDescribe) {
        this.questionDescribe = questionDescribe;
    }

    public Date getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(Date appointmentTime) {
        this.appointmentTime = appointmentTime;
    }

    public String getDiagnoseReply() {
        return diagnoseReply;
    }

    public void setDiagnoseReply(String diagnoseReply) {
        this.diagnoseReply = diagnoseReply;
    }

    public Date getDiagnoseTime() {
        return diagnoseTime;
    }

    public void setDiagnoseTime(Date diagnoseTime) {
        this.diagnoseTime = diagnoseTime;
    }

    public String getEvaluate() {
        return evaluate;
    }

    public void setEvaluate(String evaluate) {
        this.evaluate = evaluate;
    }

    public Date getEvaluateTime() {
        return evaluateTime;
    }

    public void setEvaluateTime(Date evaluateTime) {
        this.evaluateTime = evaluateTime;
    }

    public Date getCounselorOkTime() {
        return counselorOkTime;
    }

    public void setCounselorOkTime(Date counselorOkTime) {
        this.counselorOkTime = counselorOkTime;
    }

}

