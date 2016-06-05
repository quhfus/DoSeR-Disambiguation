package doser.entitydisambiguation.properties;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.log4j.Logger;

public final class Properties {
	private static Properties instance;
	private static final String RESOURCE_NAME = "disambiguation.properties";
//	private static final String RESOURCE_NAME = "./disambiguation.properties";
	
	public synchronized static Properties getInstance() {
		if (instance == null) {
			instance = new Properties();
		}

		return instance;
	}

	/**
	 * Provides easy access to property files (e.g. config.getInt())
	 */
	PropertiesConfiguration config;

	private Properties() {
		try {
			this.config = new PropertiesConfiguration(RESOURCE_NAME);
		} catch (final ConfigurationException e) {
			Logger.getRootLogger().error("Failed to load properties file: "	+ RESOURCE_NAME, e);
		}
	}

	/**
	 * ArtifactId of the application (from maven pom.xml)
	 * 
	 * @return artifact id
	 */
	public String getApplicationArtifactId() {
		return this.config.getString("application.artifactId");
	}

	/**
	 * Name of the application (from maven pom.xml)
	 * 
	 * @return application name
	 */
	public String getApplicationName() {
		return this.config.getString("application.name");
	}

	/**
	 * Version of the application (from maven pom.xml)
	 * 
	 * @return application version
	 */
	public String getApplicationVersion() {
		return this.config.getString("application.version");
	}
	
	public int getDisambiguationResultSize() {
		final String size = this.config.getString("disambiguation.returnSize");
		return Integer.valueOf(size);
	}

	/**
	 * Get location of entity-centric knowledge base
	 */
	public String getEntityCentricKBWikipedia() {
		return this.config.getString("disambiguation.entityCentricKBWikipedia");
	}
	
	public String getEntityCentricKBBiomed() {
		return this.config.getString("disambiguation.entityCentricBiomedCalbC");
	}
	
	public String getWord2VecService() {
		return this.config.getString("disambiguation.Word2VecService");
	}

	public String getWord2VecModel() {
		return this.config.getString("word2vecmodel");
	}
	
	public boolean getCandidateExpansion() {
		boolean bool = false;
		String s = this.config.getString("candidateExpansion");
		if(s.equalsIgnoreCase("true")) {
			bool = true;
		}
		return bool;
	}	
}
