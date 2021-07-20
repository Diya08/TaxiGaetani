package eu.romania.india.TaxiGaetani.service;

import eu.romania.india.TaxiGaetani.entity.Client;
import eu.romania.india.TaxiGaetani.vo.ClientVO;

public interface IClientService {
    Client clientLogin(ClientVO client);
}
