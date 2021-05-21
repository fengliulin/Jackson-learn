package cc.chengheng.AOjectMapper.配置日期格式;

import cc.chengheng.AOjectMapper.Address;
import cc.chengheng.AOjectMapper.PhoneNumber;

import java.util.Date;

public class Person {
    private String firstname;
    private String lastname;
    private Date birthday;

    @Override
    public String toString() {
        return "Person{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", birthday=" + birthday +
                '}';
    }

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

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
