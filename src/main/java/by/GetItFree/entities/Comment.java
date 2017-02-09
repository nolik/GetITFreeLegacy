package by.GetItFree.entities;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Novik Igor on 09.02.2017.
 */
@Entity
@IdClass(CommentPK.class)
public class Comment {
    private int id;
    private String message;
    private Timestamp date;
    private int advertId;
    private int profileId;
    private String profileUsersUsername;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "message", nullable = true, length = 450)
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Basic
    @Column(name = "date", nullable = false)
    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    @Id
    @Column(name = "advert_id", nullable = false)
    public int getAdvertId() {
        return advertId;
    }

    public void setAdvertId(int advertId) {
        this.advertId = advertId;
    }

    @Id
    @Column(name = "profile_id", nullable = false)
    public int getProfileId() {
        return profileId;
    }

    public void setProfileId(int profileId) {
        this.profileId = profileId;
    }

    @Id
    @Column(name = "profile_users_username", nullable = false, length = 45)
    public String getProfileUsersUsername() {
        return profileUsersUsername;
    }

    public void setProfileUsersUsername(String profileUsersUsername) {
        this.profileUsersUsername = profileUsersUsername;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Comment comment = (Comment) o;

        if (id != comment.id) return false;
        if (advertId != comment.advertId) return false;
        if (profileId != comment.profileId) return false;
        if (message != null ? !message.equals(comment.message) : comment.message != null) return false;
        if (date != null ? !date.equals(comment.date) : comment.date != null) return false;
        if (profileUsersUsername != null ? !profileUsersUsername.equals(comment.profileUsersUsername) : comment.profileUsersUsername != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (message != null ? message.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + advertId;
        result = 31 * result + profileId;
        result = 31 * result + (profileUsersUsername != null ? profileUsersUsername.hashCode() : 0);
        return result;
    }
}
