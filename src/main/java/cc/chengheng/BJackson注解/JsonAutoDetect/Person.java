package cc.chengheng.BJackson注解.JsonAutoDetect;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

// 这样设置， 没有getter setter 也会输出， 输出私有字段
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class Person {
    private Integer id = 0; // 没有getter setter 不会输出json
    private String firstname;
    private String lastname;

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }

    /*public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }*/

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
}
