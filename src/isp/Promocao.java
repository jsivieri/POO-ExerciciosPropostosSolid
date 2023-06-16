package isp;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Promocao implements ReajusteSalarial, ReajusteComImposto {
    private BigDecimal valor;
    private LocalDate data;

    public Promocao(BigDecimal valor, LocalDate data) {
        this.valor = valor;
        this.data = LocalDate.now();
    }

    @Override
    public BigDecimal valor() {
        return valor;
    }

    @Override
    public LocalDate data() {
        return data;
    }

    @Override
    public BigDecimal valorImpostoDeRenda() {
        // Lógica para calcular o valor do imposto de renda da promoção
        return valor.multiply(BigDecimal.valueOf(0.1)); // Exemplo: imposto de 10%
    }
}
