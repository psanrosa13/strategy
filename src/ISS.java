public class ISS implements Imposto {
    @Override
    public Double calculaImposto(Orcamento orcamento) {
        return orcamento.getValor() * 0.06;
    }
}
