package org.example.daomain;

/**
 * @PACKAGE_NAME: org.example.daomain
 * @NAME: MyStudent
 * @date: 2020/7/15 13:32 周三
 * @author: heqinz
 */
public class MyStudent {

    private Integer myid;
    private String myname;
    private String myemail;
    private  Integer myage;

    public Integer getMyid() {
        return myid;
    }

    public void setMyid(Integer myid) {
        this.myid = myid;
    }

    public String getMyname() {
        return myname;
    }

    public void setMyname(String myname) {
        this.myname = myname;
    }

    public String getMyemail() {
        return myemail;
    }

    public void setMyemail(String myemail) {
        this.myemail = myemail;
    }

    public Integer getMyage() {
        return myage;
    }

    public void setMyage(Integer myage) {
        this.myage = myage;
    }

    @Override
    public String toString() {
        return "MyStudent{" +
                "myid=" + myid +
                ", myname='" + myname + '\'' +
                ", myemail='" + myemail + '\'' +
                ", myage=" + myage +
                '}';
    }
}
