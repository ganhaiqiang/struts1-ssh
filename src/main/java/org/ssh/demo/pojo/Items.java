package org.ssh.demo.pojo;
// Generated 2020-5-28 17:26:24 by Hibernate Tools 3.2.2.GA



/**
 * Items generated by hbm2java
 */
public class Items  implements java.io.Serializable {


     private Integer id;
     private Long userId;
     private String marks;

    public Items() {
    }

    public Items(Long userId, String marks) {
       this.userId = userId;
       this.marks = marks;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Long getUserId() {
        return this.userId;
    }
    
    public void setUserId(Long userId) {
        this.userId = userId;
    }
    public String getMarks() {
        return this.marks;
    }
    
    public void setMarks(String marks) {
        this.marks = marks;
    }




}


