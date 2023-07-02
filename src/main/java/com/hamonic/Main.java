package com.hamonic;

import java.math.BigDecimal;


public class Main {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal(100));
        CalcuraladoraDeImpostos calcuraladoraDeImpostos = new CalcuraladoraDeImpostos();
        System.out.println(calcuraladoraDeImpostos.calcular(orcamento, new ISS()));
        System.out.println(calcuraladoraDeImpostos.calcular(orcamento, new ICMS()));

    }
}