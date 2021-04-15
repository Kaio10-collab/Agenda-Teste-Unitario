package br.com.zup.Agenda.controllers;

import br.com.zup.Agenda.models.Telefone;
import br.com.zup.Agenda.services.AgendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.validation.constraints.NotNull;

@RestController
@RequestMapping("agenda")
public class TelefoneController {

    @Autowired
    private AgendaService agendaService;

    @GetMapping("/{nome}")
    public Telefone controllerAgenda(@PathVariable @NotNull String nome) {
        return agendaService.serviceAgenda(nome);
    }
}