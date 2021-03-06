package com.fgodoy.cursomc.domain;

import java.util.Date;

import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fgodoy.cursomc.domain.enums.EstadoPagamento;

/**
 * @author fgodoy
 *
 */
@Entity
public class PagamentoComBoleto extends Pagamento {
	
	// não precisa do hashCodeEquals, pois a referência é feita pelo pai
	// não precisa colocar o implements Serializable
	private static final long serialVersionUID = 1L;

	@JsonFormat(pattern="dd/MM/yyyy")
	private Date dataVencimento;
	
	@JsonFormat(pattern="dd/MM/yyyy")
	private Date dataPagamento;
	
	public PagamentoComBoleto() {
		
	}

	// Gerar Construtor from Superclass
	// e add atributos da classe filha
	public PagamentoComBoleto(Integer id, EstadoPagamento estado, Pedido pedido,
			Date dataVencimento, Date dataPagamento) {
		super(id, estado, pedido);
		this.dataPagamento = dataPagamento;
		this.dataVencimento = dataVencimento;
	}

	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public Date getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}
	
}
