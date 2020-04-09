package com.brunocandido.cursomc.resoucers.exceptions;

import java.util.ArrayList;
import java.util.List;

//Classe Criada para devolver somente um erro por exemplo : ao usuario inserir um dado em um campo que não aceita nulo
// Complemento da Classe StandardError

public class ValidationError extends StandardError {
	private static final long serialVersionUID = 1L;

	private List<FieldMessage> errors = new ArrayList<>();



	public ValidationError(Long timeStamp, Integer status, String error, String message, String path) {
		super(timeStamp, status, error, message, path);
	}

	public List<FieldMessage> getErrors() {
		return errors;
	}

	public void addError(String fieldName, String message) {
		errors.add(new FieldMessage(fieldName, message));
	}

}
