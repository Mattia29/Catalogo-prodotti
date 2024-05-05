package it.marconi.login_registrazione.services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

import it.marconi.login_registrazione.domains.Prodotti;

@Service
public class UserService {
    private List<Prodotti> listaProdotti;

    public UserService() {
        // inizializzo e aggiungo prodotti all'Array
        listaProdotti = new ArrayList<>();
        listaProdotti.add(new Prodotti("001", "Prodotto 1", "Categoria 1", 2024, 27));
        listaProdotti.add(new Prodotti("002", "Prodotto 2", "Categoria 2", 2020, 29));
        listaProdotti.add(new Prodotti("003", "Prodotto 3", "Categoria 3", 2022, 17));
    }

    public List<Prodotti> getListaProdotti() {
        return listaProdotti;
    }

    public Prodotti getProdottoByCodice(String codice) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getProdottoByCodice'");
    }
}