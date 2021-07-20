package eu.romania.india.TaxiGaetani.service;

import eu.romania.india.TaxiGaetani.entity.Client;
import eu.romania.india.TaxiGaetani.repository.ClientRepository;
import eu.romania.india.TaxiGaetani.vo.ClientVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService implements IClientService{

    @Autowired
    private ClientRepository clientRepository;


    @Override
    public Client clientLogin(ClientVO clientVO) {
        return clientRepository.findByUserNameAndPassword(clientVO.getUserName(), clientVO.getPassword());
    }
}
