package br.com.etechoracio.Exercicio9;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TBL_VEICULO")
public class Veiculo {
@Id
@GeneratedValue
@Column(name="ID_VEICULO")
	private Long id;
@Column(name="TX_PLACA")
	private String placa;
@Column(name="TX_COR")
	private String cor;
@Column(name="NR_ANO")
	private String ano;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getPlaca() {
	return placa;
}
public void setPlaca(String placa) {
	this.placa = placa;
}
public String getCor() {
	return cor;
}
public void setCor(String cor) {
	this.cor = cor;
}
public String getAno() {
	return ano;
}
public void setAno(String ano) {
	this.ano = ano;
}
	
}
