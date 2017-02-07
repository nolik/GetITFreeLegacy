package by.GetItFree.entities;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by nolik on 07.02.17.
 */
@Entity
public class Users {
    private String username;
    private String password;
    private byte enabled;
    private Collection<Authorities> authoritiesByUsername;
    private Collection<Profile> profilesByUsername;

    @Id
    @Column(name = "username", nullable = false, length = 45)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "password", nullable = false, length = 45)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "enabled", nullable = false)
    public byte getEnabled() {
        return enabled;
    }

    public void setEnabled(byte enabled) {
        this.enabled = enabled;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Users users = (Users) o;

        if (enabled != users.enabled) return false;
        if (username != null ? !username.equals(users.username) : users.username != null) return false;
        if (password != null ? !password.equals(users.password) : users.password != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = username != null ? username.hashCode() : 0;
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (int) enabled;
        return result;
    }

    @OneToMany(mappedBy = "usersByUsername")
    public Collection<Authorities> getAuthoritiesByUsername() {
        return authoritiesByUsername;
    }

    public void setAuthoritiesByUsername(Collection<Authorities> authoritiesByUsername) {
        this.authoritiesByUsername = authoritiesByUsername;
    }

    @OneToMany(mappedBy = "usersByUsersUsername")
    public Collection<Profile> getProfilesByUsername() {
        return profilesByUsername;
    }

    public void setProfilesByUsername(Collection<Profile> profilesByUsername) {
        this.profilesByUsername = profilesByUsername;
    }

    @Override
    public String toString() {
        return "Users{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", enabled=" + enabled +
                ", authoritiesByUsername=" + authoritiesByUsername +
                ", profilesByUsername=" + profilesByUsername +
                '}';
    }
}
