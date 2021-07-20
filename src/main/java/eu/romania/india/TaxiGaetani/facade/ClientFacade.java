package eu.romania.india.TaxiGaetani.facade;

import eu.romania.india.TaxiGaetani.entity.Client;
import eu.romania.india.TaxiGaetani.service.IClientService;
import eu.romania.india.TaxiGaetani.vo.ClientVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientFacade implements IClientFacade{

    @Autowired
    private IClientService clientService;

    @Override
    public ClientVO retrieveLoginDetails(ClientVO clientVO) {
        Client client = clientService.clientLogin(clientVO);

        ClientVO _client = new ClientVO();
        _client.setFirstName(client.getFirstName());
        _client.setLastName(client.getLastName());
        _client.setUserName(client.getUserName());
        _client.setPassword(client.getPassword());

        return _client;
    }
}
