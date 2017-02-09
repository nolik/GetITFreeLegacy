package by.GetItFree.entities;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Novik Igor on 09.02.2017.
 */
@Entity
@IdClass(MessagePK.class)
public class Message {
    private int id;
    private String toPerson;
    private String header;
    private String content;
    private int profileId;
    private String profileUsersUsername;
    private Timestamp data;
    private Profile profile;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "toPerson", nullable = false, length = 45)
    public String getToPerson() {
        return toPerson;
    }

    public void setToPerson(String toPerson) {
        this.toPerson = toPerson;
    }

    @Basic
    @Column(name = "header", nullable = true, length = 45)
    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    @Basic
    @Column(name = "content", nullable = true, length = 450)
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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

    @Basic
    @Column(name = "data", nullable = false)
    public Timestamp getData() {
        return data;
    }

    public void setData(Timestamp data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Message message = (Message) o;

        if (id != message.id) return false;
        if (profileId != message.profileId) return false;
        if (toPerson != null ? !toPerson.equals(message.toPerson) : message.toPerson != null) return false;
        if (header != null ? !header.equals(message.header) : message.header != null) return false;
        if (content != null ? !content.equals(message.content) : message.content != null) return false;
        if (profileUsersUsername != null ? !profileUsersUsername.equals(message.profileUsersUsername) : message.profileUsersUsername != null)
            return false;
        if (data != null ? !data.equals(message.data) : message.data != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (toPerson != null ? toPerson.hashCode() : 0);
        result = 31 * result + (header != null ? header.hashCode() : 0);
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + profileId;
        result = 31 * result + (profileUsersUsername != null ? profileUsersUsername.hashCode() : 0);
        result = 31 * result + (data != null ? data.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumns({@JoinColumn(name = "profile_id", referencedColumnName = "id", nullable = false, insertable = false, updatable = false), @JoinColumn(name = "profile_users_username", referencedColumnName = "users_username", nullable = false, insertable = false, updatable = false)})
    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", toPerson='" + toPerson + '\'' +
                ", header='" + header + '\'' +
                ", content='" + content + '\'' +
                ", profileId=" + profileId +
                ", profileUsersUsername='" + profileUsersUsername + '\'' +
                ", data=" + data +
                ", profile=" + profile +
                '}';
    }
}
