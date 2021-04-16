package br.com.zup.Agenda.service;

import br.com.zup.Agenda.models.Telefone;
import br.com.zup.Agenda.services.AgendaService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AgendaServiceTest {

    @Autowired
    private AgendaService agendaService; // injeção de dependência da classe.

    @Test
    public void testarNomeKaio(){ // nome do método que será vazio e não tem retorno.

        String nomeRequest = "kaio"; // definição do objeto nomeRequest em String para procurar o nome kaio.

        Telefone esperado = new Telefone(); // criação de um novo objeto para extender com a classe Telefone.
        esperado.setNome("kaio"); // setando(definindo) o nome, atráves do objeto esperado com a classe Telefone.->
        esperado.setTelefone("123456789");// -> que foi puxado lá da classe Telefone

        Assertions.assertEquals(agendaService.serviceAgenda(nomeRequest), esperado);
        // estou afirmando se o objeto nomeRequest será o mesmo do objeto esperado.
    }
}
