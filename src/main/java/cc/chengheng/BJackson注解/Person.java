package cc.chengheng.BJackson注解;

import com.fasterxml.jackson.annotation.*;

import java.util.Date;

/**
 * 如果类没有setter方法，我们也可以使用注解@JsonCreator 修饰构造器
 */
//@JsonIgnoreProperties(value = {"birthday"})
@JsonPropertyOrder(value = {"lastname", "firstname"}) // json 字段的顺序
public class Person {
    private String firstname;
    private String lastname;

    // @JsonIgnore // 字段不到json里
    private Date birthday;

    private Address address;

    @JsonRawValue // 如果字符串是个Json，给解析了
    // {"lastname":"liulin","firstname":"feng","jsonFiled":{"country":"China", "city": "henan"},"feng":1621594872563}
    private String jsonFiled;

    @JsonCreator //如果类没有setter方法，我们也可以使用注解@JsonCreator 修饰构造器
    public Person(@JsonProperty String firstname,
                  @JsonProperty String lastname,
                  @JsonProperty Date birthday,
                  @JsonProperty Address address,
                  @JsonProperty String jsonFiled) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthday = birthday;
        this.address = address;
        this.jsonFiled = jsonFiled;
    }

    public Person() {
    }

    public String getJsonFiled() {
        return jsonFiled;
    }

    public void setJsonFiled(String jsonFiled) {
        this.jsonFiled = jsonFiled;
    }



    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }


//    @JsonValue // 按照自己的方式输出，没什么用
    @Override
    public String toString() {
        return "Person{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", birthday=" + birthday +
                ", address=" + address +
                ", JsonFiled='" + jsonFiled + '\'' +
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

    @JsonGetter("feng")
    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
