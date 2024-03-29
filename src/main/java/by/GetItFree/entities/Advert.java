package by.GetItFree.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Collection;

/**
 * Created by Novik Igor on 09.02.2017.
 */
@Entity
public class Advert {
    private int id;
    private String karmaReq;
    private byte[] image;
    private int profileId;
    private String profileUsersUsername;
    private String head;
    private String content;
    private boolean ordered;
    private Timestamp date;
    private Profile profile;
    private Collection<Comment> commentsById;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "karmaReq", nullable = true, length = 45)
    public String getKarmaReq() {
        return karmaReq;
    }

    public void setKarmaReq(String karmaReq) {
        this.karmaReq = karmaReq;
    }

    @Basic
    @Column(name = "image", nullable = false)
    @JsonIgnore
    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    @Basic
    @Column(name = "profile_id", nullable = false)
    public int getProfileId() {
        return profileId;
    }

    public void setProfileId(int profileId) {
        this.profileId = profileId;
    }

    @Basic
    @Column(name = "profile_users_username", nullable = false, length = 45)
    public String getProfileUsersUsername() {
        return profileUsersUsername;
    }

    public void setProfileUsersUsername(String profileUsersUsername) {
        this.profileUsersUsername = profileUsersUsername;
    }

    @Basic
    @Column(name = "head", nullable = true, length = 45)
    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    @Basic
    @Column(name = "content", nullable = true, length = 450)
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Basic
    @Column(name = "ordered", nullable = false, columnDefinition = "TINYINT(1)")
    public boolean getOrdered() {
        return ordered;
    }

    public void setOrdered(boolean ordered) {
        this.ordered = ordered;
    }

    @Basic
    @Column(name = "date", nullable = false)
    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Advert advert = (Advert) o;

        if (id != advert.id) return false;
        if (profileId != advert.profileId) return false;
        if (ordered != advert.ordered) return false;
        if (karmaReq != null ? !karmaReq.equals(advert.karmaReq) : advert.karmaReq != null) return false;
        if (!Arrays.equals(image, advert.image)) return false;
        if (profileUsersUsername != null ? !profileUsersUsername.equals(advert.profileUsersUsername) : advert.profileUsersUsername != null)
            return false;
        if (head != null ? !head.equals(advert.head) : advert.head != null) return false;
        if (content != null ? !content.equals(advert.content) : advert.content != null) return false;
        if (date != null ? !date.equals(advert.date) : advert.date != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (karmaReq != null ? karmaReq.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(image);
        result = 31 * result + profileId;
        result = 31 * result + (profileUsersUsername != null ? profileUsersUsername.hashCode() : 0);
        result = 31 * result + (head != null ? head.hashCode() : 0);
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (ordered ? 0 : 1);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumns({@JoinColumn(name = "profile_id", referencedColumnName = "id", nullable = false, insertable = false, updatable = false), @JoinColumn(name = "profile_users_username", referencedColumnName = "users_username", nullable = false, insertable = false, updatable = false)})
    @JsonIgnore
    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    @OneToMany(mappedBy = "advertByAdvertId")
    @JsonIgnore
    public Collection<Comment> getCommentsById() {
        return commentsById;
    }

    public void setCommentsById(Collection<Comment> commentsById) {
        this.commentsById = commentsById;
    }

    @Override
    public String toString() {
        return "Advert{" +
                "id=" + id +
                ", karmaReq='" + karmaReq + '\'' +
//                ", image=" + Arrays.toString(image) +
                ", profileId=" + profileId +
//                ", profileUsersUsername='" + profileUsersUsername + '\'' +
                ", head='" + head + '\'' +
                ", content='" + content + '\'' +
                ", ordered=" + ordered +
                ", date=" + date +
                ", profile=" + profile +
//                ", commentsById=" + commentsById +
                '}';
    }
}
