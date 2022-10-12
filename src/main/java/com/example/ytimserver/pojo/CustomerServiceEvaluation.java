package com.example.ytimserver.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName customer_service_evaluation
 */
@TableName(value ="customer_service_evaluation")
@Data
public class CustomerServiceEvaluation implements Serializable {
    /**
     * 
     */
    private Long id;

    /**
     * 
     */
    private String serverId;

    /**
     * 
     */
    private String serverName;

    /**
     * 
     */
    private String customerName;

    /**
     * 评价时间
     */
    private Date evaluateTime;

    /**
     * 评价分数
     */
    private Integer score;

    /**
     * service_info表id
     */
    private Long serviceInfoId;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        CustomerServiceEvaluation other = (CustomerServiceEvaluation) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getServerId() == null ? other.getServerId() == null : this.getServerId().equals(other.getServerId()))
            && (this.getServerName() == null ? other.getServerName() == null : this.getServerName().equals(other.getServerName()))
            && (this.getCustomerName() == null ? other.getCustomerName() == null : this.getCustomerName().equals(other.getCustomerName()))
            && (this.getEvaluateTime() == null ? other.getEvaluateTime() == null : this.getEvaluateTime().equals(other.getEvaluateTime()))
            && (this.getScore() == null ? other.getScore() == null : this.getScore().equals(other.getScore()))
            && (this.getServiceInfoId() == null ? other.getServiceInfoId() == null : this.getServiceInfoId().equals(other.getServiceInfoId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getServerId() == null) ? 0 : getServerId().hashCode());
        result = prime * result + ((getServerName() == null) ? 0 : getServerName().hashCode());
        result = prime * result + ((getCustomerName() == null) ? 0 : getCustomerName().hashCode());
        result = prime * result + ((getEvaluateTime() == null) ? 0 : getEvaluateTime().hashCode());
        result = prime * result + ((getScore() == null) ? 0 : getScore().hashCode());
        result = prime * result + ((getServiceInfoId() == null) ? 0 : getServiceInfoId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", serverId=").append(serverId);
        sb.append(", serverName=").append(serverName);
        sb.append(", customerName=").append(customerName);
        sb.append(", evaluateTime=").append(evaluateTime);
        sb.append(", score=").append(score);
        sb.append(", serviceInfoId=").append(serviceInfoId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}