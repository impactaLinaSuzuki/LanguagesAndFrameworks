package faculdadeimpacta.com.calculoImc.services;

import org.springframework.stereotype.Service;

import faculdadeimpacta.com.calculoImc.models.People;

@Service
public class CalculateImcService {
    public void Calculate(People people) {
       double weight = people.GetWeight();
       double height = people.GetHeight();

       double imc = weight / (height * height);
       people.SetImc(imc);

    }
}
