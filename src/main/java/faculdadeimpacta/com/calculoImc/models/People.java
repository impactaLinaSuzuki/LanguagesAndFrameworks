package faculdadeimpacta.com.calculoImc.models;

public class People {
    public double Weight;
    public double Height;
    public double Imc;

    public double GetWeight(){
        return this.Weight;
    }

    public void SetWeight(double weight){
        this.Weight = weight;
    }

    public double GetHeight(){
        return this.Height;
    }

    public void SetHeight(double height){
        this.Height = height;
    }

    public double GetImc(){
        return this.Imc;
    }

    public void SetImc(double imc){
        this.Imc = imc;
    }
}
