package DAO;
import domain.Client;
import java.util.Collection;

/**
 *
 * @author Fabri
 */
public interface IClientDAO {
    public Boolean save(Client client);
    public void delete(Long cpf);
    public void update(Client client);
    public Client find(Long cpf);
    public Collection<Client> findAll();
}
