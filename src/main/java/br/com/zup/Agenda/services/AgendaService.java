package br.com.zup.Agenda.services;

import br.com.zup.Agenda.models.Telefone;
import org.springframework.stereotype.Service;
import java.util.Map;

@Service
public class AgendaService {

    Map<String, String> agenda = Map.of("kaio", "123456789", "fabricio", "987654321");

    public Telefone serviceAgenda(String nome) {

        Telefone contato = new Telefone();

        if (agenda.containsKey(nome)) {
            contato.setNome(nome);
            contato.setTelefone(agenda.get(nome));
        }

        return contato;
    }
}