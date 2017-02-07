package by.GetItFree.entities;

import javax.persistence.*;

/**
 * Created by nolik on 07.02.17.
 */
@Entity
public class Authorities {
    private int id;
    private String username;
    private String authority;
    private Users usersByUsername;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "username", nullable = false, length = 50)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "authority", nullable = false, length = 50)
    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Authorities that = (Authorities) o;

        if (id != that.id) return false;
        if (username != null ? !username.equals(that.username) : that.username != null) return false;
        if (authority != null ? !authority.equals(that.authority) : that.authority != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (authority != null ? authority.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "username", referencedColumnName = "username", nullable = false)
    public Users getUsersByUsername() {
        return usersByUsername;
    }

    public void setUsersByUsername(Users usersByUsername) {
        this.usersByUsername = usersByUsername;
    }

    @Override
    public String toString() {
        return "Authorities{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", authority='" + authority + '\'' +
                ", usersByUsername=" + usersByUsername +
                '}';
    }
}
