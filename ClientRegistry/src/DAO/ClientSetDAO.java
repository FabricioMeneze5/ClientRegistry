package DAO;
import domain.Client;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Fabri
 */
public class ClientSetDAO implements IClientDAO{
    
    private final Set<Client> set;
    
    public ClientSetDAO() {
        this.set = new HashSet<>();
    }

    @Override
    public Boolean save(Client client) {
        return this.set.add(client);
    }

    @Override
    public void delete(Long cpf) {
        Client findClient = null;
        for (Client client : this.set) {
            if(client.getCpf().equals(cpf)){
                findClient = client;
                break;
            }
        }
        
        if (findClient != null) {
            this.set.remove(findClient);
        }
    }

    @Override
    public void update(Client client) {
        if(this.set.contains(client)) {
            for(Client clientSaved : this.set){
                if(clientSaved.equals(client)){
                    clientSaved.setName(client.getName());
                    clientSaved.setCpf(client.getCpf());
                    clientSaved.setTel(client.getTel());
                    clientSaved.setAddr(client.getAddr());
                    clientSaved.setNumber(client.getNumber());
                    clientSaved.setCity(client.getCity());
                    clientSaved.setState(client.getState());
                    break;
                }
            }
        } 
    }

    @Override
    public Client find(Long cpf) {
        for(Client clientSaved : this.set){
            if(clientSaved.getCpf().equals(cpf)) {
                return clientSaved;
            }
        }
        return null;
    }

    @Override
    public Collection<Client> findAll() {
        return this.set;
    }
}
