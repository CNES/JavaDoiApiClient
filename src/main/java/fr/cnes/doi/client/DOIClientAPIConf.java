package fr.cnes.doi.client;

import java.io.IOException;
import java.util.Properties;

public class DOIClientAPIConf {
	
	private  String clientApi = "clientApi.properties";
	
	private  String apiBasePath;
	
	private int connectionTimeout;
	
	private int readTimeout;
	
	private int writeTimeout;
	

	public  DOIClientAPIConf() {
		Properties prop = new Properties();
		try {
			prop.load(getClass().getClassLoader().getResourceAsStream(clientApi));
			apiBasePath = prop.getProperty("apiBasePath");
			connectionTimeout = Integer.parseInt(prop.getProperty("connectionTimeout"));
			readTimeout = Integer.parseInt(prop.getProperty("readTimeout"));
			writeTimeout = Integer.parseInt(prop.getProperty("writeTimeout"));
		} catch (IOException e) {
			//logger.error("Error occured wheb loading database properties file", e);
		}
	}

	public String getApiBasePath() {
		return apiBasePath;
	}

	public void setApiBasePath(String apiBasePath) {
		this.apiBasePath = apiBasePath;
	}

	public int getConnectionTimeout() {
		// TODO Auto-generated method stub
		return connectionTimeout;
	}

	public int getReadTimeout() {
		// TODO Auto-generated method stub
		return readTimeout;
	}

	public int getWriteTimeout() {
		// TODO Auto-generated method stub
		return writeTimeout;
	}
	
	
}
