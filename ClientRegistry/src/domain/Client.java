package domain;


import java.util.Objects;

/**
 *
 * @author Fabri
 */
public class Client {
    private String name;
    private Long cpf;
    private Long pho;
    private String email;

    public Client(String name, String cpf, String pho, String email) {
        this.name = name;
        this.cpf = Long.valueOf(cpf.trim());
        this.pho = Long.valueOf(pho.trim());
        this.email = email;
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

    public String getName() {
        return name;
    }

    public Long getCpf() {
        return cpf;
    }

    public Long getPho() {
        return pho;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public void setPho(Long pho) {
        this.pho = pho;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    @Override
    public String toString() {
        return name + ", Email: " + email + ", Phone: " + pho;
    }
    
}
