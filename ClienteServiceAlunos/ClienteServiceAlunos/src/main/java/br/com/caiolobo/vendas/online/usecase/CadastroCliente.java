package br.com.caiolobo.vendas.online.usecase;

import br.com.caiolobo.vendas.online.domain.Cliente;
import br.com.caiolobo.vendas.online.repository.IClienteRepository;
import jakarta.validation.Valid;

public class CadastroCliente {
	
	private IClienteRepository clienteRepository;
	
	public CadastroCliente(IClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}
	
	public Cliente cadastrar(@Valid Cliente cliente) {
		return this.clienteRepository.insert(cliente);
	}

	public Cliente atualizar(@Valid Cliente cliente) {
		return this.clienteRepository.save(cliente);
	}

	public void remover(String id) {
		this.clienteRepository.deleteById(id);
	}

}
