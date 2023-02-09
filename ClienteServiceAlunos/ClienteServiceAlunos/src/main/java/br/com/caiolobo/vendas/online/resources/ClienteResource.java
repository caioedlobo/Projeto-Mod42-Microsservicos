package br.com.caiolobo.vendas.online.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import br.com.caiolobo.vendas.online.domain.Cliente;
import br.com.caiolobo.vendas.online.usecase.BuscaCliente;
import br.com.caiolobo.vendas.online.usecase.CadastroCliente;

@RestController
@RequestMapping(value = "/cliente")
public class ClienteResource {
	
	private BuscaCliente buscaCliente;
	
	private CadastroCliente cadastroCliente;
	
	@Autowired
	public ClienteResource(BuscaCliente buscaCliente, CadastroCliente cadastroCliente ) {
		this.buscaCliente = buscaCliente;
		this.cadastroCliente = cadastroCliente;
	}
	
	@GetMapping
	public ResponseEntity<Page<Cliente>> buscar(Pageable pageable){
		return ResponseEntity.ok(buscaCliente.buscar(pageable));
	}
	
	@PostMapping
	public ResponseEntity<Cliente> cadastrar(@RequestBody @Valid Cliente cliente){
		return ResponseEntity.ok(cadastroCliente.cadastrar(cliente));
		
	}

}
