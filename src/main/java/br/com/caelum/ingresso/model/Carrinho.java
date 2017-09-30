package br.com.caelum.ingresso.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.SessionScoped;

import org.springframework.stereotype.Component;


@Component
@SessionScoped
public class Carrinho	{
	private	List<Ingresso>	ingressos	=	new	ArrayList<>();
	public	void	add(Ingresso	ingresso){
					ingressos.add(ingresso);
	}

	public	boolean	isSelecionado(Lugar	lugar){
		return	ingressos.stream().map(Ingresso::getLugar).anyMatch(l	->	l.equals(lugar));
}
	
	public	BigDecimal	getTotal(){
		return	ingressos.stream().map(Ingresso::getPreco).reduce(BigDecimal::add).orElse(BigDecimal.ZERO);
}
	
	public	Compra	toCompra(){
		return		new	Compra(ingressos);
}
	
	
	
}