package org.ssh.demo.pojo;
// Generated 2020-5-28 17:26:24 by Hibernate Tools 3.2.2.GA



/**
 * Fund generated by hbm2java
 */
public class Fund  implements java.io.Serializable {


     private String id;
     private String name;

    public Fund() {
    }

	
    public Fund(String id) {
        this.id = id;
    }
    public Fund(String id, String name) {
       this.id = id;
       this.name = name;
    }
   
    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }




}


