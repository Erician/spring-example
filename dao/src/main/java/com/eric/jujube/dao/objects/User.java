package com.eric.jujube.dao.objects;

public class User {
    private String id;
    private String nickName;
    private String sex;
    private String phoneNumber;
    private String mail;

    public User(){

    }

    public String toString(){
        return "id="+this.id+", nickName="+this.nickName+", sex="+this.sex
                +", phoneNumber="+this.phoneNumber+", mail="+this.mail;
    }

}
