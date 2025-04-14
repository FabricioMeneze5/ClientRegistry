package domain;


import java.util.Objects;

/**
 *
 * @author Fabri
 */
public class Client {
    private String name;
    private Long cpf;
    private Long tel;
    private String addr;
    private Integer number;
    private String city;
    private String state;

    public Client(String name, String cpf, String tel, String addr, Integer number, String city, String state) {
        this.name = name;
        this.cpf = Long.valueOf(cpf.trim());
        this.tel = Long.valueOf(tel.trim());
        this.addr = addr;
        this.number = number;
        this.city = city;
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public Long getCpf() {
        return cpf;
    }

    public Long getTel() {
        return tel;
    }

    public String getAddr() {
        return addr;
    }

    public Integer getNumber() {
        return number;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public void setTel(Long tel) {
        this.tel = tel;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.cpf);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Client other = (Client) obj;
        return Objects.equals(this.cpf, other.cpf);
    }

    @Override
    public String toString() {
        return name + ", CPF: " + cpf + ", TEL: " + tel;
    }
    
}
