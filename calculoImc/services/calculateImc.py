def calculateImc(person):
    person.imc = person.weight / (person.height * person.height)

def getDescription(person):
    person.description = 'Obesidade'

    if(person.imc < 18.5): 
        person.description = 'Magreza'
    else:
        if(person.imc >= 18.5 and person.imc < 24.9):
            person.description = 'Normal'
        else:
            if(person.imc >= 24.9 and person.imc < 30): 
                person.description = 'Sobrepeso'
            else:
                if(person.imc >= 30):
                    person.description = "Obesidade"