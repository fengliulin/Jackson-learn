package cc.chengheng.BJackson注解.自定义输出的类型JsonSerialize序列化和JsonDeserialize反序列化;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

public class Person {
    private String firstname;
    private String lastname;

    @JsonDeserialize(using = BooleanToIntDeserialize.class)
    @JsonSerialize(using = BooleanToIntSerialize.class)
    private Boolean isMale;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Boolean getIsMale() {
        return isMale;
    }

    public void setIsMale(Boolean isMale) {
        this.isMale = isMale;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", isMale=" + isMale +
                '}';
    }
}
