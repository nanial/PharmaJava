package entities;

import javax.persistence.Entity;
import java.util.Date;

@Entity
public class Orders {
    private  Integer id;
    private String userComment;
    private Integer userID;
    private Date date;
    private Integer status;

    public Orders() {
    }

    public Integer getId() {
        return id;
    }

    public String getUserComment() {
        return userComment;
    }

    public void setUserComment(String userComment) {
        this.userComment = userComment;
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
