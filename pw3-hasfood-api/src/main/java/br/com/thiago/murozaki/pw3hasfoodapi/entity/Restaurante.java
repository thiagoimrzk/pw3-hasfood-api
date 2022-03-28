package br.com.thiago.murozaki.pw3hasfoodapi.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "TBL_RESTAURANTE")
public class Restaurante {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID_RESTAURANTE")
	private Long id;
	
	@Column(name="TX_CNPJ")
	private String cnpj;
	
	@Column(name="TX_NOME")
	private String nome;
	
	@Column(name="TX_DESCRICAO")
	private String descricao;
	
	@Column(name="DT_APROVACAO")
	private LocalDate data;
	
	@Column(name="VLR_ENTREGA")
	private Double valor;
	
	@Column(name="NR_TEMPO_MIN_ENTREGA")
	private Integer TempoMinEntrega;
	
	@Column(name="NR_TEMPO_MAX_ENTREGA")
	private Integer TempoMaxEntrega;
	
	@OneToOne
	@JoinColumn(name="ID_TIPO_COZINHA")
	private TipoCozinha cozinha;
}
