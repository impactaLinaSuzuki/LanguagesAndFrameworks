package faculdadeimpacta.com.calculoImc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import faculdadeimpacta.com.calculoImc.models.People;
import faculdadeimpacta.com.calculoImc.services.CalculateImcService;
import faculdadeimpacta.com.calculoImc.services.RatePeopleService;

@RestController
@RequestMapping("/imc")
public class CalculateController {
    @PostMapping("/calculate")
    public People CalculateImc(
        @RequestBody People people, 
        @Autowired CalculateImcService calculateImcService,
        @Autowired RatePeopleService ratePeopleService) {
           
            System.out.println("Ola");
            calculateImcService.Calculate(people);

            double imc = people.GetImc();

            ratePeopleService.VerifiyCategory(imc);

            return people;
        }
}
