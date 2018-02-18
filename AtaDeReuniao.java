package atadereuniao.atadereuniao;

import java.sql.Time;
import java.util.HashSet;
import java.util.Date;

import atadereuniao.participantes.Participantes;
import atadereuniao.setor.Setor;
import atadereuniao.funcionario.FuncionarioEmpresa;

public class AtaDeReuniao {

	String nomeAta;
	HashSet<Participantes> participantes;
	Date dataEmissao;
	Time horaInicio;
	Time horaTermino;
	Setor setor;
	FuncionarioEmpresa emissor;

	public AtaDeReuniao(String nomeAta, FuncionarioEmpresa emissor, Date dataEmissao, Time horaInicio,
			Time horaTermino) {
		this.nomeAta = nomeAta;
		this.emissor = emissor;
		this.dataEmissao = dataEmissao;
		this.horaInicio = horaInicio;
		this.horaTermino = horaTermino;
	}

	public AtaDeReuniao(String nomeAta, FuncionarioEmpresa emissor, Date dataEmissao, Time horaInicio, Time horaTermino,
			Setor setor) {
		this.nomeAta = nomeAta;
		this.emissor = emissor;
		this.dataEmissao = dataEmissao;
		this.horaInicio = horaInicio;
		this.setor = setor;
	}
}
