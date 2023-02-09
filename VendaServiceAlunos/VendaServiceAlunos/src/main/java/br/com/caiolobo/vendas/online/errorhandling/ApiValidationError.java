package br.com.caiolobo.vendas.online.errorhandling;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Data;


@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
public class ApiValidationError extends ApiSubError{
	private String object;
	private String field;
	private Object rejectedValue;
	private String message;

	
	ApiValidationError(String object, String message) {
	    this.setObject(object);
	    this.setMessage(message);
	}

}
