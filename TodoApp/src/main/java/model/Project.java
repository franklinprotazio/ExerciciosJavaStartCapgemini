package model;

import java.util.Date;
/**
 *
 * @author Protazio
 */
public class Project {
    
    private int id;
    private String name;
    private String description;
    private Date createdAt;
    private Date updateAd;   

    public Project(int id, String name, String description, Date createdAt, Date updateAd) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.createdAt = createdAt;
        this.updateAd = updateAd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdateAd() {
        return updateAd;
    }

    public void setUpdateAd(Date updateAd) {
        this.updateAd = updateAd;
    }

    @Override
    public String toString() {
        return "Project{" + "id=" + id + ", name=" + name + ", description=" + description + ", createdAt=" + createdAt + ", updateAd=" + updateAd + '}';
    }    
}
