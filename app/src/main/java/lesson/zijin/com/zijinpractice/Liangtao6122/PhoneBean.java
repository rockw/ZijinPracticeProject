package lesson.zijin.com.zijinpractice.Liangtao6122;

/**
 * 数据存储
 *
 */
public class PhoneBean {

    private String name;
    private String phone;

    public PhoneBean(String name, String phone) {
        setName(name);
        setPhone(phone);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


}
