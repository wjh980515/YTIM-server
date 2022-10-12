package com.example.ytimserver.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName server_role_info
 */
@TableName(value ="server_role_info")
@Data
public class ServerRoleInfo implements Serializable {
    /**
     * 
     */
    @TableId
    private String id;

    /**
     * 
     */
    private String serverName;

    /**
     * 
     */
    private String welcomeWord;

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
        ServerRoleInfo other = (ServerRoleInfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getServerName() == null ? other.getServerName() == null : this.getServerName().equals(other.getServerName()))
            && (this.getWelcomeWord() == null ? other.getWelcomeWord() == null : this.getWelcomeWord().equals(other.getWelcomeWord()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getServerName() == null) ? 0 : getServerName().hashCode());
        result = prime * result + ((getWelcomeWord() == null) ? 0 : getWelcomeWord().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", serverName=").append(serverName);
        sb.append(", welcomeWord=").append(welcomeWord);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}