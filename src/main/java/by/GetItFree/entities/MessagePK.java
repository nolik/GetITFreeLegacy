package by.GetItFree.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by nolik on 07.02.17.
 */
public class MessagePK implements Serializable {
    private int id;
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

        MessagePK messagePK = (MessagePK) o;

        if (id != messagePK.id) return false;
        if (profileId != messagePK.profileId) return false;
        if (profileUsersUsername != null ? !profileUsersUsername.equals(messagePK.profileUsersUsername) : messagePK.profileUsersUsername != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + profileId;
        result = 31 * result + (profileUsersUsername != null ? profileUsersUsername.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "MessagePK{" +
                "id=" + id +
                ", profileId=" + profileId +
                ", profileUsersUsername='" + profileUsersUsername + '\'' +
                '}';
    }
}
