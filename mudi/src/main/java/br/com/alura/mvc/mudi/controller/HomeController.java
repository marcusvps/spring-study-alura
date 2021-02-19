package br.com.alura.mvc.mudi.controller;

import br.com.alura.mvc.mudi.model.PedidoModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;

@Controller
public class HomeController {


    @GetMapping("/home")
    public String home(Model model){
        PedidoModel pedido = new PedidoModel();
        pedido.setNomeProduto("Cadeira Gamer");
        pedido.setDataEntregaProduto(LocalDate.now());
        pedido.setValorProduto(BigDecimal.TEN);
        pedido.setUrlProduto("https://www.dt3sports.com.br/loja/elite-series/cadeira-gamer-dt3sports-onix-diamond/");
        pedido.setUrlImagemProduto("https://www.dt3sports.com.br/wp-content/uploads/2017/03/JPG-onix-diamond-Red-1.jpg");
        pedido.setDescricaoProduto("descrição do produto");
        model.addAttribute("pedidos", Arrays.asList(pedido, pedido));

        return "home";
    }

}
