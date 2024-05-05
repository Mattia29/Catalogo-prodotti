package it.marconi.login_registrazione.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;

import it.marconi.login_registrazione.domains.Prodotti;
import it.marconi.login_registrazione.services.UserService;

@Controller
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/catalogo")
    public String mostraCatalogo(Model model) {
        // Nome pagine HTML da visualizzare
        return "catalogo";
    }

    @PostMapping("/prodotto/nuovo")
    public String aggiungiProdotto(@ModelAttribute final Prodotti prodotti, Model model) {
        userService.getListaProdotti().add(prodotti);
        return "redirect:/catalogo";
    }

    @GetMapping("/prodotto/{codice}")
    public String dettagliProdotto(@PathVariable String codice, Model model) {
        Prodotti prodotti = userService.getProdottoByCodice(codice);
        model.addAttribute("prodotti", prodotti);
        return "dettaglio";
    }

    @PostMapping("/prodotto/{codice}/elimina")
    public String eliminaProdotto(@PathVariable String codice) {
        userService.getProdottoByCodice(codice);
        return "redirect:/catalogo";
    }
}
