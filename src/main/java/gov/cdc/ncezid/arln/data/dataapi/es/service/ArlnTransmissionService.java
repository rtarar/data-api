package gov.cdc.ncezid.arln.data.dataapi.es.service;

import java.util.List;
import java.util.Optional;

import gov.cdc.ncezid.arln.data.dataapi.es.model.ArlnTransmission;
import org.elasticsearch.common.inject.Singleton;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;



public interface ArlnTransmissionService {


    Optional<ArlnTransmission> findOne(String id);

    //Iterable<ArlnTransmission> findAll();

   // Iterable<ArlnTransmission> findByMetaProgram(String name);



    Iterable<ArlnTransmission> findAll();

    int save(ArlnTransmission transmission);

   Iterable<ArlnTransmission>  findByMeta_programUsingCustomQuery(String name);

    long count();


}