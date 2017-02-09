package by.GetItFree.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Novik Igor on 09.02.2017.
 */
public class ProfilePK implements Serializable {
    private int id;
    private String usersUsername;

    @Column(name = "id", nullable = false)
    @Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "users_username", nullable = false, length = 45)
    @Id
    public String getUsersUsername() {
        return usersUsername;
    }

    public void setUsersUsername(String usersUsername) {
        this.usersUsername = usersUsername;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProfilePK profilePK = (ProfilePK) o;

        if (id != profilePK.id) return false;
        if (usersUsername != null ? !usersUsername.equals(profilePK.usersUsername) : profilePK.usersUsername != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (usersUsername != null ? usersUsername.hashCode() : 0);
        return result;
    }
}
