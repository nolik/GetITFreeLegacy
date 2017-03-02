package by.GetItFree.entities;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Collection;

/**
 * Created by Novik Igor on 09.02.2017.
 */
@Entity
@IdClass(ProfilePK.class)
public class Profile {
    private int id;
    private String usersUsername;
    private Integer karma;
    private String phone;
    private byte[] icon;
    private Collection<Advert> adverts;
    private Collection<Comment> comments;
    private Collection<Message> messages;
    private Users usersByUsersUsername;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Id
    @Column(name = "users_username", nullable = false, length = 45)
    public String getUsersUsername() {
        return usersUsername;
    }

    public void setUsersUsername(String usersUsername) {
        this.usersUsername = usersUsername;
    }

    @Basic
    @Column(name = "karma", nullable = true)
    public Integer getKarma() {
        return karma;
    }

    public void setKarma(Integer karma) {
        this.karma = karma;
    }

    @Basic
    @Column(name = "phone", nullable = true, length = 15)
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "icon", nullable = true)
    public byte[] getIcon() {
        return icon;
    }

    public void setIcon(byte[] icon) {
        this.icon = icon;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Profile profile = (Profile) o;

        if (id != profile.id) return false;
        if (usersUsername != null ? !usersUsername.equals(profile.usersUsername) : profile.usersUsername != null)
            return false;
        if (karma != null ? !karma.equals(profile.karma) : profile.karma != null) return false;
        if (phone != null ? !phone.equals(profile.phone) : profile.phone != null) return false;
        if (!Arrays.equals(icon, profile.icon)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (usersUsername != null ? usersUsername.hashCode() : 0);
        result = 31 * result + (karma != null ? karma.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(icon);
        return result;
    }

    @OneToMany(mappedBy = "profile")
    public Collection<Advert> getAdverts() {
        return adverts;
    }

    public void setAdverts(Collection<Advert> adverts) {
        this.adverts = adverts;
    }

    @OneToMany(mappedBy = "profile")
    public Collection<Comment> getComments() {
        return comments;
    }

    public void setComments(Collection<Comment> comments) {
        this.comments = comments;
    }

    @OneToMany(mappedBy = "profile")
    public Collection<Message> getMessages() {
        return messages;
    }

    public void setMessages(Collection<Message> messages) {
        this.messages = messages;
    }

    @ManyToOne
    @JoinColumn(name = "users_username", referencedColumnName = "username", nullable = false, insertable = false, updatable = false)
    public Users getUsersByUsersUsername() {
        return usersByUsersUsername;
    }

    public void setUsersByUsersUsername(Users usersByUsersUsername) {
        this.usersByUsersUsername = usersByUsersUsername;
    }

    @Override
    public String toString() {
        return "Profile{" +
                "id=" + id +
                ", usersUsername='" + usersUsername + '\'' +
                ", karma=" + karma +
                ", phone='" + phone + '\'' +
//                ", icon=" + Arrays.toString(icon) +
//                ", adverts=" + adverts +
//                ", comments=" + comments +
//                ", messages=" + messages +
//                ", usersByUsersUsername=" + usersByUsersUsername +
                '}';
    }
}
