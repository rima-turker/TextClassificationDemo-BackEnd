package org.fiz.gwifi.backend.server;

import java.util.concurrent.TimeUnit;

import org.fiz.ise.gwifi.util.TimeUtil;


public class StartServer {
	public static void main(String[] args) {
		long now = TimeUtil.getStart();
		System.err.println("Loading model....");
		Embeddings.load();
		System.out.println("Time took to load models "+ TimeUnit.SECONDS.toMinutes(TimeUtil.getEnd(TimeUnit.SECONDS, now)));
		System.err.println("Loading Apis....");
		ApiHandler.startApis();
		System.err.println("I am ready");
	}
}
