package br.com.aula6.implementacao;

import java.util.Scanner;

import br.com.aul6.beans.Agendamento;
import br.com.aul6.beans.Paciente;

public class ExecutarAgendamento {

	public static void main(String[] args) {
		
		
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Informações do Paciente");
		
		System.out.println("Digite o nome");
		String nomePaciente = s.nextLine();
		
		System.out.println("Digite o cpf");
		String cpf = s.nextLine();		
		
		System.out.println("Digite o fone");
		String fone= s.nextLine();

		Paciente paciente = new Paciente(nomePaciente,cpf,fone);
		
		
		System.out.println("Iniciando Agendamento");

		System.out.println("Data:");
		String data = s.nextLine();

		System.out.println("Hora:");
		String hora = s.nextLine();

		System.out.println("Medico:");
		String medico = s.nextLine();

		System.out.println("atendente:");
		String atendente = s.nextLine();

		System.out.println("valor:");
		double valor = s.nextDouble();
	
		s.close();
		
		Agendamento agenda = new Agendamento(paciente,data,hora,medico,valor,atendente);
		
		agenda.agendar();
		
	}

}
