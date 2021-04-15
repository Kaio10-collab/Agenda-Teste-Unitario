package br.com.zup.Agenda.service;

import br.com.zup.Agenda.models.Telefone;
import br.com.zup.Agenda.services.AgendaService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AgendaServiceTest {

    @Autowired
    private AgendaService agendaService;

    private Telefone telefoneTest;

    //@BeforeEach
    //public void setUp(){
    // this.telefoneTest.setNome("kaio");
    // this.telefoneTest.setTelefone("123456789");
    //  this.telefoneTest.setNome("fabricio");
    //  this.telefoneTest.setTelefone("987654321");
    //}

    @Test
    public void testarNomeKaio(){
        String nomeRequest = "kaio";

        Telefone resultado = new Telefone();

        resultado.setNome("kaio");
        resultado.setTelefone("123456789");

        Assertions.assertSame(agendaService.serviceAgenda(nomeRequest),(resultado));
    }
}
