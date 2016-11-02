package fr.norsys.controller;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fr.norsys.domain.Greeting;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }
    
    @RequestMapping("/hello")
    public String hello(@RequestParam(value="name", defaultValue="World") String name) {
        return "Hello "+name+" !";
    }
    
    @RequestMapping("/version")
    public String getVersion(){
    	return "{\n" +
                "\t\"idCerbere\":\"jeantest2\",\n" +
                "\t\"nomDenomination\":\"jeanjean\",\n" +
                "\t\"nomFamille\":\"Test\",\n" +
                "\t\"prenom\":\"Jean\",\n" +
                "\t\"dateNaissance\":\"31/10/2016\",\n" +
                "\t\"email\":\"jeantest@gmail.fr\",\n" +
                "\t\"siren\":\"0123456789\",\n" +
                "\t\"telephone\":\"0123456789\",\n" +
                "\t\"numInscription\":null,\n" +
                "\t\"adresse\":{\n" +
                "\t\t\"id\":1,\n" +
                "\t\t\"numLibVoix\":\"1, rue du test\",\n" +
                "\t\t\"codePostal\":\"59000\",\n" +
                "\t\t\"ville\":\"Test City\",\n" +
                "\t\t\"cedex\":\"\"\n" +
                "\t},\n" +
                "\t\"macarons\":[{\n" +
                "\t\t\"immatriculation\":\"AA-123-AA\",\n" +
                "\t\t\"marque\":\"Opel\",\n" +
                "\t\t\"modele\":\"Corsa\",\n" +
                "\t\t\"typeMacaron\":\"DEFINITIF\",\n" +
                "\t\t\"statutMacaron\":\"EN_ATTENTE_DE_PRODUCTION\",\n" +
                "\t\t\"numeroMacaron\":\"12345789\",\n" +
                "\t\t\"numeroCommande\":0,\n" +
                "\t\t\"datePremiereImmat\":\"31/10/2016\",\n" +
                "\t\t\"dateDebutValidite\":\"31/10/2016\",\n" +
                "\t\t\"dateFinValidite\":\"31/10/2016\"\n" +
                "\t},\n" +
                "\t{\n" +
                "\t\t\"immatriculation\":\"AA-234-AA\",\n" +
                "\t\t\"marque\":\"Renault\",\n" +
                "\t\t\"modele\":\"Scenic\",\n" +
                "\t\t\"typeMacaron\":\"DEFINITIF\",\n" +
                "\t\t\"statutMacaron\":\"EN_ATTENTE_DE_PRODUCTION\",\n" +
                "\t\t\"numeroMacaron\":\"12345789\",\n" +
                "\t\t\"numeroCommande\":0,\n" +
                "\t\t\"datePremiereImmat\":\"31/10/2016\",\n" +
                "\t\t\"dateDebutValidite\":\"31/10/2016\",\n" +
                "\t\t\"dateFinValidite\":\"31/10/2016\"\n" +
                "\t}]\n" +
                "}\n";

    }
}
