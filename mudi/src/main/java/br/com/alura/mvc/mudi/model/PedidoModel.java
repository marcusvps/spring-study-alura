package br.com.alura.mvc.mudi.model;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;


@Getter
@Setter
public class PedidoModel {
    private String nomeProduto;
    private String urlProduto;
    private String urlImagemProduto;
    private String descricaoProduto;
    private BigDecimal valorProduto;
    private LocalDate dataEntregaProduto;



}
