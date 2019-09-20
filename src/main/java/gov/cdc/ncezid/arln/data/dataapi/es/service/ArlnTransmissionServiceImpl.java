package gov.cdc.ncezid.arln.data.dataapi.es.service;

import gov.cdc.ncezid.arln.data.dataapi.es.model.ArlnTransmission;
import gov.cdc.ncezid.arln.data.dataapi.es.repository.ArlnTransmissionRepository;
import org.elasticsearch.common.inject.Singleton;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArlnTransmissionServiceImpl implements ArlnTransmissionService {

    @Autowired
   ArlnTransmissionRepository transmissionRepository;

  /*  @Autowired
    public ArlnTransmissionServiceImpl(ArlnTransmissionRepository transmissionRepository) {
        this.transmissionRepository = transmissionRepository;
    }
*/
   // public ArlnTransmissionServiceImpl(){}


    @Override
    public List<ArlnTransmission> findAll() {
        return (List<ArlnTransmission>) transmissionRepository.findAll();
    }

    @Override
    public Optional<ArlnTransmission> findOne(String id) {
        return transmissionRepository.findById(id);
    }

    public Iterable<ArlnTransmission>  findByMeta_programUsingCustomQuery(String name, Pageable pageable){
        return transmissionRepository.findByMeta_programUsingCustomQuery(name,pageable);
    }

   /* @Override
    public Page<ArlnTransmission> findByAuthorName(String name, Pageable pageable) {
        return transmissionRepository.findByAuthorsName(name, pageable);
    }

    @Override
    public Page<ArlnTransmission> findByAuthorNameUsingCustomQuery(String name, Pageable pageable) {
        return transmissionRepository.findByAuthorsNameUsingCustomQuery(name, pageable);
    }

    @Override
    public Page<ArlnTransmission> findByFilteredTagQuery(String tag, Pageable pageable) {
        return transmissionRepository.findByFilteredTagQuery(tag, pageable);
    }

    @Override
    public Page<ArlnTransmission> findByAuthorsNameAndFilteredTagQuery(String name, String tag, Pageable pageable) {
        return transmissionRepository.findByAuthorsNameAndFilteredTagQuery(name, tag, pageable);
    }
*/
    @Override
    public long count() {
        return transmissionRepository.count();
    }



}
