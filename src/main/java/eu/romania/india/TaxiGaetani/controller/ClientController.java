package eu.romania.india.TaxiGaetani.controller;

import eu.romania.india.TaxiGaetani.facade.IClientFacade;
import eu.romania.india.TaxiGaetani.vo.ClientVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private IClientFacade clientFacade;

    @PostMapping("/login")
    public ClientVO login(@RequestBody ClientVO clientVO) {
        return clientFacade.retrieveLoginDetails(clientVO);
    }
}
