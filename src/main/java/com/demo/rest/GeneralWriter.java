package com.demo.rest;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Date;

import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyWriter;
import javax.ws.rs.ext.Provider;

@Provider
@Produces(MediaType.TEXT_PLAIN)
public class GeneralWriter<T> implements MessageBodyWriter<T> {

	public long getSize(T arg0, Class<?> arg1, Type arg2, Annotation[] arg3, MediaType arg4) {
		// TODO Auto-generated method stub
		return -1;
	}

	public boolean isWriteable(Class<?> type, Type arg1, Annotation[] arg2, MediaType arg3) {

		if (Date.class.isAssignableFrom(type)) {
			return true;
		}

		else if (ASL.class.isAssignableFrom(type)) {
			return true;
		}

		return false;
	}

	public void writeTo(T rawtype, Class<?> type, Type arg2, Annotation[] arg3, MediaType arg4,
			MultivaluedMap<String, Object> arg5, OutputStream out) throws IOException, WebApplicationException {

		out.write(rawtype.toString().getBytes());

	}

}
