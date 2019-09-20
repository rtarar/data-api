package gov.cdc.ncezid.arln.data.dataapi.es.repository;

import gov.cdc.ncezid.arln.data.dataapi.es.model.ArlnTransmission;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;


    @Repository
    public interface ArlnTransmissionRepository extends ElasticsearchRepository<ArlnTransmission, String> {


        Page<ArlnTransmission> findByTransmissionMetaProgramName(String name, Pageable pageable);

        @Query("{\"bool\": {\"must\": [{\"match\": {\"meta_program\": \"?0\"}}]}}")
        Page<ArlnTransmission> findByMeta_programUsingCustomQuery(String name, Pageable pageable);



        //@Query("{\"bool\": {\"must\": {\"match_all\": {}}, \"filter\": {\"term\": {\"tags\": \"?0\" }}}}")
       // Page<ArlnTransmission> findByFilteredTagQuery(String tag, Pageable pageable);

        //@Query("{\"bool\": {\"must\": {\"match\": {\"authors.name\": \"?0\"}}, \"filter\": {\"term\": {\"tags\": \"?1\" }}}}")
       // Page<ArlnTransmission> findByAuthorsNameAndFilteredTagQuery(String name, String tag, Pageable pageable);
    }
