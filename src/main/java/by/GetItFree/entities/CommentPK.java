package by.GetItFree.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Novik Igor on 09.02.2017.
 */
public class CommentPK implements Serializable {
    private int id;
    private int advertId;
    private int profileId;
    private String profileUsersUsername;

    @Column(name = "id", nullable = false)
    @Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "advert_id", nullable = false)
    @Id
    public int getAdvertId() {
        return advertId;
    }

    public void setAdvertId(int advertId) {
        this.advertId = advertId;
    }

    @Column(name = "profile_id", nullable = false)
    @Id
    public int getProfileId() {
        return profileId;
    }

    public void setProfileId(int profileId) {
        this.profileId = profileId;
    }

    @Column(name = "profile_users_username", nullable = false, length = 45)
    @Id
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

        CommentPK commentPK = (CommentPK) o;

        if (id != commentPK.id) return false;
        if (advertId != commentPK.advertId) return false;
        if (profileId != commentPK.profileId) return false;
        if (profileUsersUsername != null ? !profileUsersUsername.equals(commentPK.profileUsersUsername) : commentPK.profileUsersUsername != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + advertId;
        result = 31 * result + profileId;
        result = 31 * result + (profileUsersUsername != null ? profileUsersUsername.hashCode() : 0);
        return result;
    }
}
