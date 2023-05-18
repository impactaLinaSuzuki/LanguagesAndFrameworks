print ("ola mundo")

def main():
    weight = float(input("Digite seu peso: "))
    print(f"Seu peso: {weight}")
    height = float(input("Digite sua altura: "))
    print(f"Sua altura: {height}")

    imc = calculaImc(weight, height)
    checkout = verifiyImc(imc)
    print(f'{checkout}')

def calculaImc(weight, height):
    imc = weight / (height * 2)
    print(f"IMC: {imc}")
    return imc

def verifiyImc(imc):
    if imc <= 0 :
        return "Ocorreu um erro ao calcular seu imc"
    if imc > 0 and imc < 18.5 :
        return "Magreza"
    if imc >= 18.5 and imc < 24.9 :
        return "Normal"
    if imc >= 24.9 and imc <= 30 :
        return "Sobrepeso"
    if imc > 30 :
        return "Obsidade"

main()