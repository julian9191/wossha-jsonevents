package com.wossha.json.events.exceptions;

public class RecoverableException extends Exception{

	private static final long serialVersionUID = 1L;

	public RecoverableException( ){
		super( );
	}

	public RecoverableException(String arg0 ){
		super( arg0 );
	}

	public RecoverableException(Throwable arg0 ){
		super( arg0 );
	}

	public RecoverableException(String arg0, Throwable arg1 ){
		super( arg0, arg1 );
	}

}