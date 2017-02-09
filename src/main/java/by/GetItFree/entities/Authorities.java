package by.GetItFree.entities;

import javax.persistence.*;

/**
 * Created by Novik Igor on 09.02.2017.
 */
@Entity
public class Authorities {
    private int id;
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
        if (authority != null ? !authority.equals(that.authority) : that.authority != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (authority != null ? authority.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "username", referencedColumnName = "username", nullable = false, insertable = false, updatable = false)
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
                ", authority='" + authority + '\'' +
                ", usersByUsername=" + usersByUsername +
                '}';
    }
}
