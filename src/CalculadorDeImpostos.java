public class CalculadorDeImpostos {

    private Orcamento orcamento;
    private Imposto imposto;

    public CalculadorDeImpostos(Orcamento orcamento, Imposto imposto) {
        this.orcamento = orcamento;
        this.imposto = imposto;
    }

    public void realizaCalculo(){
       Double valorImposto = this.imposto.calculaImposto(this.orcamento);
       System.out.println(valorImposto);
    }


}
