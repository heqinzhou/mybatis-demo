package org.example.vo;

/**
 * @PACKAGE_NAME: org.example.vo
 * @NAME: ViewStudent
 * @date: 2020/7/13 16:39 周一
 * @author: heqinz
 */
public class ViewStudent {
    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ViewStudent{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
