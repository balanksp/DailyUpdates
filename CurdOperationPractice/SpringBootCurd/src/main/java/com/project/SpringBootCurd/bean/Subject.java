package com.project.SpringBootCurd.bean;

import javax.persistence.*;
/*create a table in data base table name => subject
 * primary key is id
 * 
 */

@Entity
@Table(name="subject")
public class Subject {

    @Id
    private String id;
    private String name;

    public Subject() {

    }

    public Subject(String id, String name) {
        this.id = id;
        this.name = name;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    
    
}
