package org.example.vo;

/**
 * @PACKAGE_NAME: org.example.vo
 * @NAME: QueryParam
 * @date: 2020/7/13 13:56 周一
 * @author: heqinz
 */
public class QueryParam {
    private String paramName;
    private Integer paramAge;

    public String getParamName() {
        return paramName;
    }

    public Integer getParamAge() {
        return paramAge;
    }

    public void setParamName(String paramName) {
        this.paramName = paramName;
    }

    public void setParamAge(Integer paramAge) {
        this.paramAge = paramAge;
    }

    @Override
    public String toString() {
        return "QueryParam{" +
                "paramName='" + paramName + '\'' +
                ", paramAge=" + paramAge +
                '}';
    }
}
