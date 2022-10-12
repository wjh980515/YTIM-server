package com.example.ytimserver.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName message
 */
@TableName(value ="message")
@Data
public class Message implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 
     */
    private String fromId;

    /**
     * 
     */
    private String toId;

    /**
     * 
     */
    private String content;

    /**
     * 
     */
    private String fromName;

    /**
     * 
     */
    private String toName;

    /**
     * 
     */
    private Date createTime;

    /**
     * 0->文本 0->图片
     */
    private Integer label;

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
        Message other = (Message) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getFromId() == null ? other.getFromId() == null : this.getFromId().equals(other.getFromId()))
            && (this.getToId() == null ? other.getToId() == null : this.getToId().equals(other.getToId()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getFromName() == null ? other.getFromName() == null : this.getFromName().equals(other.getFromName()))
            && (this.getToName() == null ? other.getToName() == null : this.getToName().equals(other.getToName()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getLabel() == null ? other.getLabel() == null : this.getLabel().equals(other.getLabel()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getFromId() == null) ? 0 : getFromId().hashCode());
        result = prime * result + ((getToId() == null) ? 0 : getToId().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        result = prime * result + ((getFromName() == null) ? 0 : getFromName().hashCode());
        result = prime * result + ((getToName() == null) ? 0 : getToName().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getLabel() == null) ? 0 : getLabel().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", fromId=").append(fromId);
        sb.append(", toId=").append(toId);
        sb.append(", content=").append(content);
        sb.append(", fromName=").append(fromName);
        sb.append(", toName=").append(toName);
        sb.append(", createTime=").append(createTime);
        sb.append(", label=").append(label);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}