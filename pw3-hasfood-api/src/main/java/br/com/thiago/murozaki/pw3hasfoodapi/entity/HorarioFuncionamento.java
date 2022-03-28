package br.com.thiago.murozaki.pw3hasfoodapi.entity;

import java.sql.Time;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import br.com.thiago.murozaki.pw3hasfoodapi.enums.DiaSemanaEnum;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name = "TBL_HORARIO_FUNCIONAMENTO")
public class HorarioFuncionamento {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID_HORARIO_FUNCIONAMENTO")
	private Long id;
	
	@Column(name="TX_DIA_SEMANA")
	private DiaSemanaEnum DiaSemana;
	
	@Column(name="HR_ABERTURA")
	private Time HoraAbertura;
	
	@Column(name="HR_FECHAMENTO")
	private Time HoraFechamento;
	
	@OneToOne
	@JoinColumn(name="ID_RESTAURANTE")
	private Restaurante restaurante;
}
