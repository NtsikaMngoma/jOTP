package com.upcrob.jotp.controllers;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.upcrob.jotp.Controller;
import com.upcrob.jotp.JsonResponse;
import com.upcrob.jotp.Response;

/**
 * Simple endpoint that can be used to verify that the application
 * is currently available.
 */
public class MonitorController implements Controller {

	private Logger log;
	
	public MonitorController() {
		log = LoggerFactory.getLogger(MonitorController.class);
	}
	
	@Override
	public Response execute(Map<String, String> params) {
		log.debug("Monitored - OK");
		Map<String, String> fields = new HashMap<String, String>();
		fields.put("status", "OK");
		return new JsonResponse(fields);
	}

}
