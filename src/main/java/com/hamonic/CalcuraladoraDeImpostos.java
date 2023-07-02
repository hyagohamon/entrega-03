package com.hamonic;

import java.math.BigDecimal;

public class CalcuraladoraDeImpostos {

    public BigDecimal calcular(Orcamento orcamento,Imposto imposto){
        return  imposto.calcular(orcamento);
    }
}
