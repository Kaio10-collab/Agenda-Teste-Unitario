package br.com.zup.Agenda.services;

import br.com.zup.Agenda.models.Telefone;
import org.springframework.stereotype.Service;
import java.util.Map;

@Service
public class AgendaService {

    Map<String, String> agenda = Map.of("kaio", "123456789", "fabricio", "987654321");
    // Método para passar os elementos e retornar com uma lista como resultado.

    public Telefone serviceAgenda(String nome) {

        Telefone contato = new Telefone();// Objeto criado para receber os getter/setter.

        if (agenda.containsKey(nome)) {// método para verificar se o objeto definido é o mesmo da lista gerada pelo Map.
            contato.setNome(nome);
            contato.setTelefone(agenda.get(nome));
        }

        return contato;
    }
}