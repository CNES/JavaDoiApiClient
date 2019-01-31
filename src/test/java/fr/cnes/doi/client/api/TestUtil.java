package fr.cnes.doi.client.api;

public class TestUtil {
	
	static String doiTest = "10.5072/828606/8c3e91ad45ca855b477126bc073ae44b";
	static String doiMetadata = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\r\n" + 
			"<resource xmlns=\"http://datacite.org/schema/kernel-4\" \r\n" + 
			"          xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" \r\n" + 
			"          xsi:schemaLocation=\"http://schema.datacite.org/meta/kernel-4/metadata.xsd\">\r\n" + 
			"    <identifier identifierType=\"DOI\">10.5072/828606/8c3e91ad45ca855b477126bc073ae44b</identifier>\r\n" + 
			"    <creators>\r\n" + 
			"        <creator>\r\n" + 
			"            <creatorName>CNES</creatorName>\r\n" + 
			"        </creator>\r\n" + 
			"        <creator>\r\n" + 
			"            <creatorName>LATMOS</creatorName>\r\n" + 
			"        </creator>\r\n" + 
			"    </creators>\r\n" + 
			"    <titles>\r\n" + 
			"        <title>J1_105min_Pacific_Nominal_MacroCycle</title>\r\n" + 
			"    </titles>\r\n" + 
			"    <publisher>CNES</publisher>\r\n" + 
			"    <publicationYear>2017</publicationYear>\r\n" + 
			"    <resourceType resourceTypeGeneral=\"Dataset\"></resourceType>\r\n" + 
			"    <subjects>\r\n" + 
			"        <subject>\r\n" + 
			"            CFOSAT simulated data.\r\n" + 
			"        </subject>\r\n" + 
			"    </subjects>\r\n" + 
			"    <contributors>\r\n" + 
			"        <contributor contributorType=\"Producer\">\r\n" + 
			"            <contributorName>CNES</contributorName>\r\n" + 
			"        </contributor>        \r\n" + 
			"        <contributor contributorType=\"Producer\">\r\n" + 
			"            <contributorName>LATMOS</contributorName>\r\n" + 
			"        </contributor>\r\n" + 
			"        <contributor contributorType=\"RightsHolder\">\r\n" + 
			"            <contributorName>CNES</contributorName>\r\n" + 
			"        </contributor>\r\n" + 
			"        <contributor contributorType=\"ResearchGroup\">\r\n" + 
			"            <contributorName>METEO-FRANCE</contributorName>\r\n" + 
			"        </contributor>        \r\n" + 
			"        <contributor contributorType=\"ResearchGroup\">\r\n" + 
			"            <contributorName>IFREMER</contributorName>\r\n" + 
			"        </contributor>           \r\n" + 
			"    </contributors>\r\n" + 
			"    <dates>\r\n" + 
			"        <date dateType=\"Created\">2017-06-01</date>\r\n" + 
			"    </dates>\r\n" + 
			"    <language>en</language>\r\n" + 
			"    <alternateIdentifiers>\r\n" + 
			"        <alternateIdentifier alternateIdentifierType=\"SEF identifier\">J1_105min_Pacific_Nominal_MacroCycle</alternateIdentifier>\r\n" + 
			"    </alternateIdentifiers>\r\n" + 
			"    <relatedIdentifiers>\r\n" + 
			"        <relatedIdentifier relatedIdentifierType=\"URL\" relationType=\"IsDocumentedBy\">https://cfosat-sef.cnes.fr/cnes_to_cfosat/documents/Product_Format_Description.pdf</relatedIdentifier>\r\n" + 
			"        <relatedIdentifier relatedIdentifierType=\"URL\" relationType=\"IsDocumentedBy\">https://cfosat-sef.cnes.fr/cnes_to_cfosat/documents/Product_Users_Guide.pdf</relatedIdentifier>\r\n" + 
			"        <relatedIdentifier relatedIdentifierType=\"URL\" relationType=\"IsDocumentedBy\">https://cfosat-sef.cnes.fr/cnes_to_cfosat/documents/SWIM_Instrument_Manual.pdf</relatedIdentifier>\r\n" + 
			"    </relatedIdentifiers>\r\n" + 
			"    <sizes>\r\n" + 
			"        <size>1.5 GB</size>\r\n" + 
			"    </sizes>\r\n" + 
			"    <formats>\r\n" + 
			"        <format>application/x-netcdf</format>\r\n" + 
			"    </formats>\r\n" + 
			"    <version>0.1</version>\r\n" + 
			"    <geoLocations>\r\n" + 
			"        <geoLocation>\r\n" + 
			"            <geoLocationPlace>Pacific</geoLocationPlace>\r\n" + 
			"        </geoLocation>\r\n" + 
			"    </geoLocations>\r\n" + 
			"\r\n" + 
			"</resource>";
	
	static String media = "application/pdf=http://www.example.org/test.pdf";
	static String landingPageUrl = "http://example.org/";		
	

}
