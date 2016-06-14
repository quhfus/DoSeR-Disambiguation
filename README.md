#DoSeR-Disambiguation
This package exclusively contains the disambiguation system of DoSeR. Compilation results in a Stand-alone jar file which starts an Apache Tomcat Server. More infos about the full DoSeR systems can be found here: [Github Wiki](https://github.com/quhfus/DoSeR/wiki) 

If your system does not have enough system memory (25GB Ram), you can use the the rest service of the current DoSeR version which is applicable for GERBIL.

   http://zaire.dimis.fim.uni-passau.de:8999/doser-gerbilrest/doserwrapper

We note that this service is limited to 5 queries in parallel.

##Requirements
To install and run the DoSeR disambiguation systems, the following components must be installed:

1. Java Version 1.7 or higher

2. Python 2.5 or higher

3. Disambiguation Lucene Index: [Dropbox Link](https://www.dropbox.com/s/7ihkw5gzqc3afjo/DBpedia_DisambiguationIndex.tar.gz?dl=0) 

4. Semantic Embeddings: [Dropbox Link](https://www.dropbox.com/s/4e2g72yud1muv5a/Semantic_Embeddings.tar.gz?dl=0)

##Installation
1. Checkout the DoSeR-Disambiguation Github repository and install the system with **mvn compile**. If no maven is installed or if you are not interested in the source code you can download the doser-dis-disambiguationserver.jar file and disambiguation.properties file from here (coming very soon).  

2. Put the resulting or downloaded **doser-dis-disambiguationserver.jar** file and the properties file into a newly created directory **foo**. Unzip the Disambiguation Index and put the index folder into the **foo** directory.

3. Unzip and extract the Semantic Embeddings zip file into any folder.

4. Install and start the Word2Vec Rest Server (Installation guide can be found [here](https://github.com/quhfus/DoSeR-Disambiguation/wiki/Word2Vec-RestServer))

6. Open and adapt the disambiguation.properties file

7. Start the doser-dis-disambiguationserver.jar 

##Citation
If you use DoSeR in your research, please cite the following paper:

    @inproceedings{DBLP:conf/esws/ZwicklbauerSG16,
    author    = {Stefan Zwicklbauer and Christin Seifert and Michael Granitzer},
    title     = {DoSeR - A Knowledge-Base-Agnostic Framework for Entity Disambiguation Using Semantic Embeddings},
    booktitle = {The Semantic Web. Latest Advances and New Domains - 13th International
               Conference, {ESWC} 2016, Heraklion, Crete, Greece, May 29 - June 2,
               2016, Proceedings},
    pages     = {182--198},
    year      = {2016},
    crossref  = {DBLP:conf/esws/2016},
    url       = {http://dx.doi.org/10.1007/978-3-319-34129-3_12},
    doi       = {10.1007/978-3-319-34129-3_12},
    timestamp = {Mon, 23 May 2016 13:46:28 +0200},
    biburl    = {http://dblp.uni-trier.de/rec/bib/conf/esws/ZwicklbauerSG16},
    bibsource = {dblp computer science bibliography, http://dblp.org}
    }
