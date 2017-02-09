package by.GetItFree.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Arrays;

/**
 * Created by Novik Igor on 09.02.2017.
 */
@Entity
public class Advert {
    private int id;
    private String karmaReq;
    private byte[] image;
    private String head;
    private String content;
    private byte ordered;
    private Timestamp date;

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
    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
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
    @Column(name = "ordered", nullable = false)
    public byte getOrdered() {
        return ordered;
    }

    public void setOrdered(byte ordered) {
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
        if (ordered != advert.ordered) return false;
        if (karmaReq != null ? !karmaReq.equals(advert.karmaReq) : advert.karmaReq != null) return false;
        if (!Arrays.equals(image, advert.image)) return false;
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
        result = 31 * result + (head != null ? head.hashCode() : 0);
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (int) ordered;
        result = 31 * result + (date != null ? date.hashCode() : 0);
        return result;
    }
}
