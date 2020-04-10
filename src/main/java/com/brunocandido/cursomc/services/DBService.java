package com.brunocandido.cursomc.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.brunocandido.cursomc.domain.Categoria;
import com.brunocandido.cursomc.domain.Cidades;
import com.brunocandido.cursomc.domain.ClassificacaoProduto;
import com.brunocandido.cursomc.domain.Cliente;
import com.brunocandido.cursomc.domain.Enderecos;
import com.brunocandido.cursomc.domain.Estado;
import com.brunocandido.cursomc.domain.ItemPedido;
import com.brunocandido.cursomc.domain.Pagamento;
import com.brunocandido.cursomc.domain.PagamentoBoleto;
import com.brunocandido.cursomc.domain.PagamentoComCartao;
import com.brunocandido.cursomc.domain.Pedido;
import com.brunocandido.cursomc.domain.Produto;
import com.brunocandido.cursomc.domain.TipoProduto;
import com.brunocandido.cursomc.enuns.EstadoPagamento;
import com.brunocandido.cursomc.enuns.Perfil;
import com.brunocandido.cursomc.enuns.TipoCliente;
import com.brunocandido.cursomc.repositories.CategoriaRepository;
import com.brunocandido.cursomc.repositories.CidadeRepository;
import com.brunocandido.cursomc.repositories.ClassificacaoProdutoRepository;
import com.brunocandido.cursomc.repositories.ClienteRepository;
import com.brunocandido.cursomc.repositories.EnderecosRepository;
import com.brunocandido.cursomc.repositories.EstadoRepository;
import com.brunocandido.cursomc.repositories.ItemPedidoRepository;
import com.brunocandido.cursomc.repositories.PagamentoRepository;
import com.brunocandido.cursomc.repositories.PedidoRepository;
import com.brunocandido.cursomc.repositories.ProdutoRepository;
import com.brunocandido.cursomc.repositories.TipoProdutoRepository;

//Classe criada pois é associada a clase de configuração do banco de dados a classe TestConfig dentro de
// com.brunocandido.cursomc.config

@Service
public class DBService {

	@Autowired
	CategoriaRepository categoriaRepository; // Acrescenta na tabela Categoria

	@Autowired
	ClassificacaoProdutoRepository classificacaoProdutoRepository;

	@Autowired
	TipoProdutoRepository tipoProdutoRepository;

	@Autowired
	ProdutoRepository produtoRepository;

	@Autowired
	EstadoRepository estadoRepository;

	@Autowired
	CidadeRepository cidadeRepository;

	@Autowired
	ClienteRepository clienteRepository;

	@Autowired
	EnderecosRepository enderecosRepository;

	@Autowired
	PedidoRepository pedidoRepository;

	@Autowired
	PagamentoRepository pagamentoRepository;

	@Autowired
	ItemPedidoRepository itemPedidoRepository;

	@Autowired
	BCryptPasswordEncoder bCryptPasswordEncoder;

	public void instantiateTestDatabase() throws ParseException {

		// ****************************************************************************************************************
		// Dominio Categoria

		Categoria c1 = new Categoria(null, "Camisetas");
		Categoria c2 = new Categoria(null, "Camisas");
		Categoria c3 = new Categoria(null, "Camisas Polo");
		Categoria c4 = new Categoria(null, "Calças Djeans");
		Categoria c5 = new Categoria(null, "Bermudas");
		// Categoria c6 = new Categoria(null, "Teste");

		// ****************************************************************************************************************
		// Dominio Produtos
		// Camisetas
		Produto p1 = new Produto(null, "Camiseta Lacoste", 40.00, "Branca");
		Produto p2 = new Produto(null, "Camiseta Lacoste", 40.00, "Preta");
		// Camisas
		Produto p3 = new Produto(null, "Camisa Tommy Higgifilguer", 80.00, "Branca");
		Produto p4 = new Produto(null, "Camisa Tommy Higgifilguer", 80.00, "Preta");
		// Camisa Polo
		Produto p5 = new Produto(null, "Camisa Polo Pollo", 80.00, "Amarela");
		Produto p6 = new Produto(null, "Camisa Polo Pollo", 80.00, "Vermelha");
		// Calça Djeans
		Produto p7 = new Produto(null, "Calça Djeans", 80.00, "Djeans");
		Produto p8 = new Produto(null, "Calça Djeans", 80.00, "Preta");
		// Bermudas
		Produto p9 = new Produto(null, "Bermuda Djeans", 80.00, "Djeans");
		Produto p10 = new Produto(null, "Bermuda Djeans", 80.00, "Preta");

		Produto p12 = new Produto(null, "Produto 12", 10.00, "Branca");
		Produto p13 = new Produto(null, "Produto 13", 10.00, "Branca");
		Produto p14 = new Produto(null, "Produto 14", 10.00, "Branca");
		Produto p15 = new Produto(null, "Produto 15", 10.00, "Branca");
		Produto p16 = new Produto(null, "Produto 16", 10.00, "Preta");
		Produto p17 = new Produto(null, "Produto 17", 10.00, "Beje");
		Produto p18 = new Produto(null, "Produto 18", 10.00, "Beje");
		Produto p19 = new Produto(null, "Produto 19", 10.00, "Beje");
		Produto p20 = new Produto(null, "Produto 20", 10.00, "Beje");
		Produto p21 = new Produto(null, "Produto 21", 10.00, "Beje");
		Produto p22 = new Produto(null, "Produto 22", 10.00, "Beje");
		Produto p23 = new Produto(null, "Produto 23", 10.00, "Beje");
		Produto p24 = new Produto(null, "Produto 24", 10.00, "Beje");
		Produto p25 = new Produto(null, "Produto 25", 10.00, "Laranja");
		Produto p26 = new Produto(null, "Produto 26", 10.00, "Laranja");
		Produto p27 = new Produto(null, "Produto 27", 10.00, "Laranja");
		Produto p28 = new Produto(null, "Produto 28", 10.00, "Laranja");
		Produto p29 = new Produto(null, "Produto 29", 10.00, "Laranja");
		Produto p30 = new Produto(null, "Produto 30", 10.00, "Laranja");
		Produto p31 = new Produto(null, "Produto 31", 10.00, "Azul");
		Produto p32 = new Produto(null, "Produto 32", 10.00, "Azul");
		Produto p33 = new Produto(null, "Produto 33", 10.00, "Azul");
		Produto p34 = new Produto(null, "Produto 34", 10.00, "Azul");
		Produto p35 = new Produto(null, "Produto 35", 10.00, "Azul");
		Produto p36 = new Produto(null, "Produto 36", 10.00, "Azul");
		Produto p37 = new Produto(null, "Produto 37", 10.00, "Rosa");
		Produto p38 = new Produto(null, "Produto 38", 10.00, "Rosa");
		Produto p39 = new Produto(null, "Produto 39", 10.00, "Rosa");
		Produto p40 = new Produto(null, "Produto 40", 10.00, "Rosa");
		Produto p41 = new Produto(null, "Produto 41", 10.00, "Rosa");
		Produto p42 = new Produto(null, "Produto 42", 10.00, "Rosa");
		Produto p43 = new Produto(null, "Produto 43", 10.00, "Vermelho");
		Produto p44 = new Produto(null, "Produto 44", 10.00, "Vermelho");
		Produto p45 = new Produto(null, "Produto 45", 10.00, "Vermelho");
		Produto p46 = new Produto(null, "Produto 46", 10.00, "Vermelho");
		Produto p47 = new Produto(null, "Produto 47", 10.00, "Vermelho");
		Produto p48 = new Produto(null, "Produto 48", 10.00, "Vermelho");
		Produto p49 = new Produto(null, "Produto 49", 10.00, "Vermelho");
		Produto p50 = new Produto(null, "Produto 50", 10.00, "Vermelho");
		// ****************************************************************************************************************
		// Acrescentando o Categoria ao Produto

		c1.getProdutos().addAll(Arrays.asList(p1, p2));
		c2.getProdutos().addAll(Arrays.asList(p3, p4));
		c3.getProdutos().addAll(Arrays.asList(p5, p6));
		c4.getProdutos().addAll(Arrays.asList(p7, p8));
		c5.getProdutos().addAll(Arrays.asList(p9, p10));
		c1.getProdutos()
				.addAll(Arrays.asList(p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22, p23, p24, p25, p26, p27,
						p28, p29, p30, p31, p32, p34, p35, p36, p37, p38, p39, p40, p41, p42, p43, p44, p45, p46, p47,
						p48, p49, p50));
		// ****************************************************************************************************************
		// Acrescentando o Produto a Categoria

		p1.getCategorias().addAll(Arrays.asList(c1));
		p2.getCategorias().addAll(Arrays.asList(c1));
		p3.getCategorias().addAll(Arrays.asList(c2));
		p4.getCategorias().addAll(Arrays.asList(c2));
		p5.getCategorias().addAll(Arrays.asList(c3));
		p6.getCategorias().addAll(Arrays.asList(c3));
		p7.getCategorias().addAll(Arrays.asList(c4));
		p8.getCategorias().addAll(Arrays.asList(c4));
		p9.getCategorias().addAll(Arrays.asList(c5));
		p10.getCategorias().addAll(Arrays.asList(c5));
		p12.getCategorias().addAll(Arrays.asList(c1));
		p13.getCategorias().addAll(Arrays.asList(c1));
		p14.getCategorias().addAll(Arrays.asList(c1));
		p15.getCategorias().addAll(Arrays.asList(c1));
		p16.getCategorias().addAll(Arrays.asList(c1));
		p17.getCategorias().addAll(Arrays.asList(c1));
		p18.getCategorias().addAll(Arrays.asList(c1));
		p19.getCategorias().addAll(Arrays.asList(c1));
		p20.getCategorias().addAll(Arrays.asList(c1));
		p21.getCategorias().addAll(Arrays.asList(c1));
		p22.getCategorias().addAll(Arrays.asList(c1));
		p23.getCategorias().addAll(Arrays.asList(c1));
		p24.getCategorias().addAll(Arrays.asList(c1));
		p25.getCategorias().addAll(Arrays.asList(c1));
		p26.getCategorias().addAll(Arrays.asList(c1));
		p27.getCategorias().addAll(Arrays.asList(c1));
		p28.getCategorias().addAll(Arrays.asList(c1));
		p29.getCategorias().addAll(Arrays.asList(c1));
		p30.getCategorias().addAll(Arrays.asList(c1));
		p31.getCategorias().addAll(Arrays.asList(c1));
		p32.getCategorias().addAll(Arrays.asList(c1));
		p33.getCategorias().addAll(Arrays.asList(c1));
		p34.getCategorias().addAll(Arrays.asList(c1));
		p35.getCategorias().addAll(Arrays.asList(c1));
		p36.getCategorias().addAll(Arrays.asList(c1));
		p37.getCategorias().addAll(Arrays.asList(c1));
		p38.getCategorias().addAll(Arrays.asList(c1));
		p39.getCategorias().addAll(Arrays.asList(c1));
		p40.getCategorias().addAll(Arrays.asList(c1));
		p41.getCategorias().addAll(Arrays.asList(c1));
		p42.getCategorias().addAll(Arrays.asList(c1));
		p43.getCategorias().addAll(Arrays.asList(c1));
		p44.getCategorias().addAll(Arrays.asList(c1));
		p45.getCategorias().addAll(Arrays.asList(c1));
		p46.getCategorias().addAll(Arrays.asList(c1));
		p47.getCategorias().addAll(Arrays.asList(c1));
		p48.getCategorias().addAll(Arrays.asList(c1));
		p49.getCategorias().addAll(Arrays.asList(c1));
		p50.getCategorias().addAll(Arrays.asList(c1));
		// ****************************************************************************************************************
		// Repository Categoria

		categoriaRepository.saveAll(Arrays.asList(c1, c2, c3, c4, c5));
		// ****************************************************************************************************************
		// Dominio ClassificacaoProduto
		ClassificacaoProduto cp1 = new ClassificacaoProduto(null, "Masculino");
		ClassificacaoProduto cp2 = new ClassificacaoProduto(null, "Feminino");
		// ****************************************************************************************************************
		// Adicionando o Lista ao Produto
		cp1.getProduto().addAll(Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8, p9));
		cp2.getProduto().addAll(Arrays.asList(p10));
		// ****************************************************************************************************************
		// Adicionando Produto a Lista

		p1.getClassificacaoProduto().addAll(Arrays.asList(cp1));
		p2.getClassificacaoProduto().addAll(Arrays.asList(cp1));
		p3.getClassificacaoProduto().addAll(Arrays.asList(cp1));
		p4.getClassificacaoProduto().addAll(Arrays.asList(cp1));
		p5.getClassificacaoProduto().addAll(Arrays.asList(cp1));
		p6.getClassificacaoProduto().addAll(Arrays.asList(cp1));
		p7.getClassificacaoProduto().addAll(Arrays.asList(cp1));
		p8.getClassificacaoProduto().addAll(Arrays.asList(cp1));
		p9.getClassificacaoProduto().addAll(Arrays.asList(cp1));
		p10.getClassificacaoProduto().addAll(Arrays.asList(cp2));
		// ****************************************************************************************************************
		// Repository ClassificacaoProdutoRepository
		classificacaoProdutoRepository.saveAll(Arrays.asList(cp1, cp2));

		// ****************************************************************************************************************
		// Dominio Tipo de Produto

		TipoProduto tp1 = new TipoProduto(null, "Revenda");
		TipoProduto tp2 = new TipoProduto(null, "Varejo");

		tp1.getProduto().addAll(Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10));
		tp2.getProduto().addAll(Arrays.asList(p10));

		p1.getTipoProduto().addAll(Arrays.asList(tp1));
		p2.getTipoProduto().addAll(Arrays.asList(tp1));
		p3.getTipoProduto().addAll(Arrays.asList(tp1));
		p4.getTipoProduto().addAll(Arrays.asList(tp1));
		p5.getTipoProduto().addAll(Arrays.asList(tp1));
		p6.getTipoProduto().addAll(Arrays.asList(tp1));
		p7.getTipoProduto().addAll(Arrays.asList(tp1));
		p8.getTipoProduto().addAll(Arrays.asList(tp1));
		p9.getTipoProduto().addAll(Arrays.asList(tp1));
		p10.getTipoProduto().addAll(Arrays.asList(tp1, tp2));
		// ****************************************************************************************************************
		// Repository tipo de Produtos

		tipoProdutoRepository.saveAll(Arrays.asList(tp1, tp2));

		// ****************************************************************************************************************
		// *****************************************************************************************************************
		// Repository Produto
		produtoRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10));
		produtoRepository.saveAll(Arrays.asList(p12, p13, p14, p15, p16, p17, p18, p19, p20,
				p21, p22, p23, p24, p25, p26, p27, p28, p29, p30, p31, p32, p34, p35, p36, p37, p38,
				p39, p40, p41, p42, p43, p44, p45, p46, p47, p48, p49, p50));
		// ****************************************************************************************************************
		// ****************************************************************************************************************

		// *****************************************************************************************************************

		Estado est0 = new Estado(null, "Goiás");
		Estado est1 = new Estado(null, "Minas Gerais");
		Estado est2 = new Estado(null, "São Paulo");

		Cidades cc0 = new Cidades(null, "Goiânia", est0);
		Cidades cc1 = new Cidades(null, "Uberlândia", est1);
		Cidades cc2 = new Cidades(null, "São Paulo", est2);
		Cidades cc3 = new Cidades(null, "Campinas", est2);

		est1.getCidades().addAll(Arrays.asList(cc1));
		est2.getCidades().addAll(Arrays.asList(cc2, cc3));

		estadoRepository.saveAll(Arrays.asList(est0, est1, est2));
		cidadeRepository.saveAll(Arrays.asList(cc0, cc1, cc2, cc3));

		// ****************************************************************************************************************
		// Dominio do Cliente e Enderecos

		Cliente cli1 = new Cliente(null, "Maria Silva", "bruno.macedo@sankhya.com.br", "37517634062",
				TipoCliente.PESSOAFISICA, bCryptPasswordEncoder.encode("123"));
		Cliente cli2 = new Cliente(null, "Junior Carvalho Mendonca", "bmcandido@hotmail.com", "62093828006",
				TipoCliente.PESSOAFISICA, bCryptPasswordEncoder.encode("123"));

		Cliente cli3 = new Cliente(null, "Bob Marley", "bmcandido14@gmail.com", "12312925044", TipoCliente.PESSOAFISICA,
				bCryptPasswordEncoder.encode("123"));
		cli3.addPerfil(Perfil.ADMIN);

		cli1.getTelefone().addAll(Arrays.asList("27363323", "93838393"));
		cli2.getTelefone().addAll(Arrays.asList("62987776654"));
		cli3.getTelefone().addAll(Arrays.asList("629877334654"));

		Enderecos end1 = new Enderecos(null, "Rua Flores", "300", "Apto 303", "Jardim", "38220834", cli1, cc1);
		Enderecos end2 = new Enderecos(null, "Avenida Matos", "105", "Sala 800", "Centro", "38777012", cli1, cc2);
		Enderecos end3 = new Enderecos(null, "Rua C-75", "S/N", "Apto 2020", "Centro", "76100000", cli2, cc0);
		Enderecos end4 = new Enderecos(null, "Rua Serio", "S/N", "Apto 999", "Centro", "76100000", cli3, cc0);

		cli1.getEnderecos().addAll(Arrays.asList(end1, end2));
		cli2.getEnderecos().addAll(Arrays.asList(end3));
		cli3.getEnderecos().addAll(Arrays.asList(end4));

		// ****************************************************************************************************************
		// Repository tipo de Produtos

		cli1.getEnderecos().addAll(Arrays.asList(end1, end2));
		cli2.getEnderecos().addAll(Arrays.asList(end3));
		cli3.getEnderecos().addAll(Arrays.asList(end4));

		clienteRepository.saveAll(Arrays.asList(cli1, cli2, cli3));
		enderecosRepository.saveAll(Arrays.asList(end1, end2, end3, end4));

		// ****************************************************************************************************************
		// Dominio Pedido / Pagamento

		Pedido ped1 = new Pedido(null, new SimpleDateFormat("DD/mm/yyyy").parse("30/03/2020"), cli1, end1);
		Pedido ped2 = new Pedido(null, new SimpleDateFormat("DD/mm/yyyy").parse("29/03/2020"), cli2, end3);

		Pagamento pg1 = new PagamentoComCartao(null, EstadoPagamento.PAGO, ped1, 6);
		ped1.setPagamento(pg1);

		Pagamento pg2 = new PagamentoBoleto(null, EstadoPagamento.PENDENTE, ped2, null,
				new SimpleDateFormat("DD/mm/yyyy").parse("30/04/2020"));

		ped2.setPagamento(pg2);

		cli1.getPedidos().addAll(Arrays.asList(ped1));
		cli2.getPedidos().addAll(Arrays.asList(ped2));

		// ****************************************************************************************************************
		// Repository do Pedido e Pagamento

		pedidoRepository.saveAll(Arrays.asList(ped1, ped2));
		pagamentoRepository.saveAll(Arrays.asList(pg1, pg2));

		// ****************************************************************************************************************
		// Dominio Item de Pedido

		ItemPedido ite1 = new ItemPedido(ped1, p1, 12, 10, 10.20);
		ItemPedido ite2 = new ItemPedido(ped1, p4, 20, 300, 80);
		ItemPedido ite3 = new ItemPedido(ped2, p2, 20, 1000, 30.20);

		ped1.getItens().addAll(Arrays.asList(ite1, ite2));
		ped2.getItens().addAll(Arrays.asList(ite3));

		p1.getItens().addAll(Arrays.asList(ite1));
		p2.getItens().addAll(Arrays.asList(ite2));
		p4.getItens().addAll(Arrays.asList(ite3));

		// ****************************************************************************************************************
		// Repository do Iem de PEdido

		itemPedidoRepository.saveAll(Arrays.asList(ite1, ite2, ite3));

	}

}
