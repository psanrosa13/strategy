public class App {

    public static void main (String[] args){

        CalculadorDeImpostos calculadorDeImpostosISS = new CalculadorDeImpostos(new Orcamento(3900.00), new ISS());
        calculadorDeImpostosISS.realizaCalculo();
        CalculadorDeImpostos calculadorDeImpostosICMS = new CalculadorDeImpostos(new Orcamento(3900.00), new ICMS());
        calculadorDeImpostosICMS.realizaCalculo();
    }
}
