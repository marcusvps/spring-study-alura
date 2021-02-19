package br.com.alura.mvc.mudi.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.time.LocalDate;


@Getter
@Setter
@Entity
public class Pedido {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeProduto;
    private String urlProduto;
    private String urlImagemProduto;
    private String descricaoProduto;
    private BigDecimal valorProduto;
    private LocalDate dataEntregaProduto;



}
