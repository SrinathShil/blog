package com.examples.camel.cxf.rest;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class ExceptionProcessor {//implements Excepintf 
	
	/** A logger instance named NletsIngestExceptionProcessor. */
	private static Logger  logger = Logger.getLogger(ExceptionProcessor.class);

	/**
	 * If an exception is thrown, log the exception with all nested causes
	 * and stop the route.
	 *
	 * @param exchange the exchange
	 * @throws Exception the exception
	 * @see org.apache.camel.Processor#process(org.apache.camel.Exchange)
	 */
	

	//@Override
	public Response exp() {
		return Response.status(Status.OK).
                entity("Hi Exception!!").
                   build();
	}

}
