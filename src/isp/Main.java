package isp;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        
        Anuenio anuenio = new Anuenio(BigDecimal.valueOf(1000), LocalDate.now());
        System.out.println("Anuênio");
        System.out.println("Valor: " + anuenio.valor());
        System.out.println("Data: " + anuenio.data());
        System.out.println();

        
        Promocao promocao = new Promocao(BigDecimal.valueOf(500), LocalDate.now());
        System.out.println("Promoção");
        System.out.println("Valor: " + promocao.valor());
        System.out.println("Data: " + promocao.data());
        System.out.println("Imposto de Renda: " + promocao.valorImpostoDeRenda());
        System.out.println();

        
        Anuenio anuenio2 = new Anuenio(BigDecimal.valueOf(1500), LocalDate.now());
        System.out.println("Anuênio");
        System.out.println("Valor: " + anuenio2.valor());
        System.out.println("Data: " + anuenio2.data());
        System.out.println();

        
        Promocao promocao2 = new Promocao(BigDecimal.valueOf(800), LocalDate.of(2023, 1, 1));
        System.out.println("Promoção");
        System.out.println("Valor: " + promocao2.valor());
        System.out.println("Data: " + promocao2.data());
        System.out.println("Imposto de Renda: " + promocao2.valorImpostoDeRenda());
        System.out.println();

        
        Anuenio anuenio3 = new Anuenio(BigDecimal.valueOf(2000), LocalDate.now());
        Promocao promocao3 = new Promocao(BigDecimal.valueOf(1200), LocalDate.now());
        System.out.println("Anuênio e Promoção");
        System.out.println("Valor Anuênio: " + anuenio3.valor());
        System.out.println("Data Anuênio: " + anuenio3.data());
        System.out.println("Valor Promoção: " + promocao3.valor());
        System.out.println("Data Promoção: " + promocao3.data());
        System.out.println("Imposto de Renda Promoção: " + promocao3.valorImpostoDeRenda());
        System.out.println();
    }
}