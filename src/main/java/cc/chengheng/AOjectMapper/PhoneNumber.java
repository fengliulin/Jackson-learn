package cc.chengheng.AOjectMapper;

public class PhoneNumber {
    private String code;
    private String number;

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "code='" + code + '\'' +
                ", number='" + number + '\'' +
                '}';
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
