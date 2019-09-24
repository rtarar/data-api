package gov.cdc.ncezid.arln.data.dataapi.es.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "arlntransmission8", type="arlntransmission")
public class ArlnTransmission {

    @Id
    String meta_recorduid;
    String meta_totalnumberofrecords;
         String meta_uploadid;
         String meta_organization;
         String meta_program;
         String meta_username;
         String meta_filestatus;
         String meta_statusdescription;
         String meta_rownumber;
         String meta_hash;
         String meta_fileuploadtimestamp;
         String meta_s3objectkey;
         String meta_filename;
         String meta_recordstatus;
         String patient_id;
         String patient_id_assigner;
         String patient_sex;
         String patient_age;
         String patient_age_unit;
         String phl;
         String processing_laboratory_id;
         String healthcare_facility_of_origin_id;
         String healthcare_facility_of_origin_name;
         String healthcare_facility_of_origin_state;
         String healthcare_facility_of_origin_zipcode;
         String submitter_facility_id;
         String submitter_facility_id_assigner;
         String submitter_facility_name;
         String submitter_facility_state;
         String submitter_facility_zipcode;
         String specimen_type;
         String specimen_type_free_text;
         String specimen_collection_date;
         String specimen_received_date;
         String submitter_specimen_idprivate;
         String arln_specimen_id;
         String isolate_forwarded_to_reglab;
         String date_forwarded_to_reglab;
         String organism_tested;
         String phenotypic_test_result;
         String phenotypic_method_used;
         String confirmed_carbapenem_resistant;
         String ast_method_used;
         String pcr_method_used;
         String imp_gene;
         String kpc_gene;
         String mcr_gene;
         String mcr_1_gene;
         String mcr_2_gene;
         String mcr_3_gene;
         String mcr_4_gene;
         String ndm_gene;
         String oxa_48_like_gene;
         String oxa_24_40_gene;
         String oxa_58_gene;
         String oxa_235_gene;
         String oxa_23_gene;
         String vim_gene;
         String other_gene_name;
         String other_gene_result;
         String aztreonam_ast_mic_sign;
         String aztreonam_ast_mic;
         String aztreonam_ast_zone_diameter;
         String cefepime_ast_mic_sign;
         String cefepime_ast_mic;
         String cefepime_ast_zone_diameter;
         String ceftazidime_ast_mic_sign;
         String ceftazidime_ast_mic;
         String ceftazidime_ast_zone_diameter;
         String ceftriaxone_ast_mic_sign;
         String ceftriaxone_ast_mic;
         String ceftriaxone_ast_zone_diameter;
         String colistin_ast_mic_sign;
         String colistin_ast_mic;
         String doripenem_ast_mic_sign;
         String doripenem_ast_mic;
         String doripenem_ast_zone_diameter;
         String ertapenem_ast_mic_sign;
         String ertapenem_ast_mic;
         String ertapenem_ast_zone_diameter;
         String imipenem_ast_mic_sign;
         String imipenem_ast_mic;
         String imipenem_ast_zone_diameter;
         String meropenem_ast_mic_sign;
         String meropenem_ast_mic;
         String meropenem_ast_zone_diameter;
         String other_3rdgen_cephalosporin_name;
         String other_3rdgen_cephalosporin_ast_mic_sign;
         String other_3rdgen_cephalosporin_ast_mic;
         String other_3rdgen_cephalosporin_ast_zone_diameter;
         String reglab_comment;
         String piperacillin_tazobactam_ast_mic_sign;
         String piperacillin_tazobactam_ast_mic;
         String piperacillin_tazobactam_ast_zone_diameter;
         String amikacin_ast_mic_sign;
         String amikacin_ast_mic;
         String amikacin_ast_zone_diameter;
         String ciprofloxacin_ast_mic_sign;
         String ciprofloxacin_ast_mic;
         String ciprofloxacin_ast_zone_diameter;
         String doxycycline_ast_mic_sign;
         String doxycycline_ast_mic;
         String doxycycline_ast_zone_diameter;
         String gentamicin_ast_mic_sign;
         String gentamicin_ast_mic;
         String gentamicin_ast_zone_diameter;
         String hp_aztreonam_ast_mic_sign;
         String hp_aztreonam_ast_mic;
         String hp_aztreonam_avibactam_ast_mic_sign;
         String hp_aztreonam_avibactam_ast_mic;
         String hp_ceftazidime_avibactam_ast_mic_sign;
         String hp_ceftazidime_avibactam_ast_mic;
         String hp_ceftazidime_aztreonam_avibactam_ast_mic_sign;
         String hp_ceftazidime_aztreonam_avibactam_ast_mic;
         String levofloxacin_ast_mic_sign;
         String levofloxacin_ast_mic;
         String levofloxacin_ast_zone_diameter;
         String minocycline_ast_mic_sign;
         String minocycline_ast_mic;
         String minocycline_ast_zone_diameter;
         String polymixin_b_ast_mic_sign;
         String polymixin_b_ast_mic;
         String polymixin_b_ast_zone_diameter;
         String ticarcillin_clavulanate_constant2_ast_mic_sign;
         String ticarcillin_clavulanate_constant2_ast_mic;
         String ticarcillin_clavulanate_constant2_ast_zone_diameter;
         String tigecycline_ast_mic_sign;
         String tigecycline_ast_mic;
         String tigecycline_ast_zone_diameter;
         String tobramycin_ast_mic_sign;
         String tobramycin_ast_mic;
         String tobramycin_ast_zone_diameter;
         String trimethoprim_sulfamethoxazole_ast_mic_sign;
         String trimethoprim_sulfamethoxazole_ast_mic;
         String trimethoprim_sulfamethoxazole_ast_zone_diameter;
         String meropenem_vaborbactam_ast_mic_sign;
         String meropenem_vaborbactam_ast_mic;
         String meropenem_vaborbactam_ast_zone_diameter;
         String ceftolozane_tazobactam_ast_mic_sign;
         String ceftolozane_tazobactam_ast_mic;
         String ceftolozane_tazobactam_ast_zone_diameter;
         String ceftazidime_avibactam_ast_mic_sign;
         String ceftazidime_avibactam_ast_mic;
         String ceftazidime_avibactam_ast_zone_diameter;
         String moxifloxacin_ast_mic_sign;
         String moxifloxacin_ast_mic;
         String moxifloxacin_ast_zone_diameter;
         String fosfomycin_ast_mic_sign;
         String fosfomycin_ast_mic;
         String fosfomycin_ast_zone_diameter;
         String organism_suspected;
         String ampicillin_sulbac_ast_mic_sign;
         String ampicillin_sulbac_ast_mic;
         String ampicillin_sulbac_ast_zone_diameter;
         String cefotaxime_ast_mic_sign;
         String cefotaxime_ast_mic;
         String cefotaxime_ast_zone_diameter;
         String date_result_released;
         String cefotaxime_clavulanate_ast_mic_sign;
         String cefotaxime_clavulanate_ast_mic;
         String cefotaxime_clavulanate_ast_zone_diameter;
         String ceftazidime_clavulanate_ast_mic_sign;
         String ceftazidime_clavulanate_ast_mic;
         String ceftazidime_clavulanate_ast_zone_diameter;
         String reporting_month;

     public String getMeta_recorduid() {
          return meta_recorduid;
     }

     public void setMeta_recorduid(String meta_recorduid) {
          this.meta_recorduid = meta_recorduid;
     }

     public String getMeta_totalnumberofrecords() {
          return meta_totalnumberofrecords;
     }

     public void setMeta_totalnumberofrecords(String meta_totalnumberofrecords) {
          this.meta_totalnumberofrecords = meta_totalnumberofrecords;
     }

     public String getMeta_uploadid() {
          return meta_uploadid;
     }

     public void setMeta_uploadid(String meta_uploadid) {
          this.meta_uploadid = meta_uploadid;
     }

     public String getMeta_organization() {
          return meta_organization;
     }

     public void setMeta_organization(String meta_organization) {
          this.meta_organization = meta_organization;
     }

     public String getMeta_program() {
          return meta_program;
     }

     public void setMeta_program(String meta_program) {
          this.meta_program = meta_program;
     }

     public String getMeta_username() {
          return meta_username;
     }

     public void setMeta_username(String meta_username) {
          this.meta_username = meta_username;
     }

     public String getMeta_filestatus() {
          return meta_filestatus;
     }

     public void setMeta_filestatus(String meta_filestatus) {
          this.meta_filestatus = meta_filestatus;
     }

     public String getMeta_statusdescription() {
          return meta_statusdescription;
     }

     public void setMeta_statusdescription(String meta_statusdescription) {
          this.meta_statusdescription = meta_statusdescription;
     }

     public String getMeta_rownumber() {
          return meta_rownumber;
     }

     public void setMeta_rownumber(String meta_rownumber) {
          this.meta_rownumber = meta_rownumber;
     }

     public String getMeta_hash() {
          return meta_hash;
     }

     public void setMeta_hash(String meta_hash) {
          this.meta_hash = meta_hash;
     }

     public String getMeta_fileuploadtimestamp() {
          return meta_fileuploadtimestamp;
     }

     public void setMeta_fileuploadtimestamp(String meta_fileuploadtimestamp) {
          this.meta_fileuploadtimestamp = meta_fileuploadtimestamp;
     }

     public String getMeta_s3objectkey() {
          return meta_s3objectkey;
     }

     public void setMeta_s3objectkey(String meta_s3objectkey) {
          this.meta_s3objectkey = meta_s3objectkey;
     }

     public String getMeta_filename() {
          return meta_filename;
     }

     public void setMeta_filename(String meta_filename) {
          this.meta_filename = meta_filename;
     }

     public String getMeta_recordstatus() {
          return meta_recordstatus;
     }

     public void setMeta_recordstatus(String meta_recordstatus) {
          this.meta_recordstatus = meta_recordstatus;
     }

     public String getPatient_id() {
          return patient_id;
     }

     public void setPatient_id(String patient_id) {
          this.patient_id = patient_id;
     }

     public String getPatient_id_assigner() {
          return patient_id_assigner;
     }

     public void setPatient_id_assigner(String patient_id_assigner) {
          this.patient_id_assigner = patient_id_assigner;
     }

     public String getPatient_sex() {
          return patient_sex;
     }

     public void setPatient_sex(String patient_sex) {
          this.patient_sex = patient_sex;
     }

     public String getPatient_age() {
          return patient_age;
     }

     public void setPatient_age(String patient_age) {
          this.patient_age = patient_age;
     }

     public String getPatient_age_unit() {
          return patient_age_unit;
     }

     public void setPatient_age_unit(String patient_age_unit) {
          this.patient_age_unit = patient_age_unit;
     }

     public String getPhl() {
          return phl;
     }

     public void setPhl(String phl) {
          this.phl = phl;
     }

     public String getProcessing_laboratory_id() {
          return processing_laboratory_id;
     }

     public void setProcessing_laboratory_id(String processing_laboratory_id) {
          this.processing_laboratory_id = processing_laboratory_id;
     }

     public String getHealthcare_facility_of_origin_id() {
          return healthcare_facility_of_origin_id;
     }

     public void setHealthcare_facility_of_origin_id(String healthcare_facility_of_origin_id) {
          this.healthcare_facility_of_origin_id = healthcare_facility_of_origin_id;
     }

     public String getHealthcare_facility_of_origin_name() {
          return healthcare_facility_of_origin_name;
     }

     public void setHealthcare_facility_of_origin_name(String healthcare_facility_of_origin_name) {
          this.healthcare_facility_of_origin_name = healthcare_facility_of_origin_name;
     }

     public String getHealthcare_facility_of_origin_state() {
          return healthcare_facility_of_origin_state;
     }

     public void setHealthcare_facility_of_origin_state(String healthcare_facility_of_origin_state) {
          this.healthcare_facility_of_origin_state = healthcare_facility_of_origin_state;
     }

     public String getHealthcare_facility_of_origin_zipcode() {
          return healthcare_facility_of_origin_zipcode;
     }

     public void setHealthcare_facility_of_origin_zipcode(String healthcare_facility_of_origin_zipcode) {
          this.healthcare_facility_of_origin_zipcode = healthcare_facility_of_origin_zipcode;
     }

     public String getSubmitter_facility_id() {
          return submitter_facility_id;
     }

     public void setSubmitter_facility_id(String submitter_facility_id) {
          this.submitter_facility_id = submitter_facility_id;
     }

     public String getSubmitter_facility_id_assigner() {
          return submitter_facility_id_assigner;
     }

     public void setSubmitter_facility_id_assigner(String submitter_facility_id_assigner) {
          this.submitter_facility_id_assigner = submitter_facility_id_assigner;
     }

     public String getSubmitter_facility_name() {
          return submitter_facility_name;
     }

     public void setSubmitter_facility_name(String submitter_facility_name) {
          this.submitter_facility_name = submitter_facility_name;
     }

     public String getSubmitter_facility_state() {
          return submitter_facility_state;
     }

     public void setSubmitter_facility_state(String submitter_facility_state) {
          this.submitter_facility_state = submitter_facility_state;
     }

     public String getSubmitter_facility_zipcode() {
          return submitter_facility_zipcode;
     }

     public void setSubmitter_facility_zipcode(String submitter_facility_zipcode) {
          this.submitter_facility_zipcode = submitter_facility_zipcode;
     }

     public String getSpecimen_type() {
          return specimen_type;
     }

     public void setSpecimen_type(String specimen_type) {
          this.specimen_type = specimen_type;
     }

     public String getSpecimen_type_free_text() {
          return specimen_type_free_text;
     }

     public void setSpecimen_type_free_text(String specimen_type_free_text) {
          this.specimen_type_free_text = specimen_type_free_text;
     }

     public String getSpecimen_collection_date() {
          return specimen_collection_date;
     }

     public void setSpecimen_collection_date(String specimen_collection_date) {
          this.specimen_collection_date = specimen_collection_date;
     }

     public String getSpecimen_received_date() {
          return specimen_received_date;
     }

     public void setSpecimen_received_date(String specimen_received_date) {
          this.specimen_received_date = specimen_received_date;
     }

     public String getSubmitter_specimen_idprivate() {
          return submitter_specimen_idprivate;
     }

     public void setSubmitter_specimen_idprivate(String submitter_specimen_idprivate) {
          this.submitter_specimen_idprivate = submitter_specimen_idprivate;
     }

     public String getArln_specimen_id() {
          return arln_specimen_id;
     }

     public void setArln_specimen_id(String arln_specimen_id) {
          this.arln_specimen_id = arln_specimen_id;
     }

     public String getIsolate_forwarded_to_reglab() {
          return isolate_forwarded_to_reglab;
     }

     public void setIsolate_forwarded_to_reglab(String isolate_forwarded_to_reglab) {
          this.isolate_forwarded_to_reglab = isolate_forwarded_to_reglab;
     }

     public String getDate_forwarded_to_reglab() {
          return date_forwarded_to_reglab;
     }

     public void setDate_forwarded_to_reglab(String date_forwarded_to_reglab) {
          this.date_forwarded_to_reglab = date_forwarded_to_reglab;
     }

     public String getOrganism_tested() {
          return organism_tested;
     }

     public void setOrganism_tested(String organism_tested) {
          this.organism_tested = organism_tested;
     }

     public String getPhenotypic_test_result() {
          return phenotypic_test_result;
     }

     public void setPhenotypic_test_result(String phenotypic_test_result) {
          this.phenotypic_test_result = phenotypic_test_result;
     }

     public String getPhenotypic_method_used() {
          return phenotypic_method_used;
     }

     public void setPhenotypic_method_used(String phenotypic_method_used) {
          this.phenotypic_method_used = phenotypic_method_used;
     }

     public String getConfirmed_carbapenem_resistant() {
          return confirmed_carbapenem_resistant;
     }

     public void setConfirmed_carbapenem_resistant(String confirmed_carbapenem_resistant) {
          this.confirmed_carbapenem_resistant = confirmed_carbapenem_resistant;
     }

     public String getAst_method_used() {
          return ast_method_used;
     }

     public void setAst_method_used(String ast_method_used) {
          this.ast_method_used = ast_method_used;
     }

     public String getPcr_method_used() {
          return pcr_method_used;
     }

     public void setPcr_method_used(String pcr_method_used) {
          this.pcr_method_used = pcr_method_used;
     }

     public String getImp_gene() {
          return imp_gene;
     }

     public void setImp_gene(String imp_gene) {
          this.imp_gene = imp_gene;
     }

     public String getKpc_gene() {
          return kpc_gene;
     }

     public void setKpc_gene(String kpc_gene) {
          this.kpc_gene = kpc_gene;
     }

     public String getMcr_gene() {
          return mcr_gene;
     }

     public void setMcr_gene(String mcr_gene) {
          this.mcr_gene = mcr_gene;
     }

     public String getMcr_1_gene() {
          return mcr_1_gene;
     }

     public void setMcr_1_gene(String mcr_1_gene) {
          this.mcr_1_gene = mcr_1_gene;
     }

     public String getMcr_2_gene() {
          return mcr_2_gene;
     }

     public void setMcr_2_gene(String mcr_2_gene) {
          this.mcr_2_gene = mcr_2_gene;
     }

     public String getMcr_3_gene() {
          return mcr_3_gene;
     }

     public void setMcr_3_gene(String mcr_3_gene) {
          this.mcr_3_gene = mcr_3_gene;
     }

     public String getMcr_4_gene() {
          return mcr_4_gene;
     }

     public void setMcr_4_gene(String mcr_4_gene) {
          this.mcr_4_gene = mcr_4_gene;
     }

     public String getNdm_gene() {
          return ndm_gene;
     }

     public void setNdm_gene(String ndm_gene) {
          this.ndm_gene = ndm_gene;
     }

     public String getOxa_48_like_gene() {
          return oxa_48_like_gene;
     }

     public void setOxa_48_like_gene(String oxa_48_like_gene) {
          this.oxa_48_like_gene = oxa_48_like_gene;
     }

     public String getOxa_24_40_gene() {
          return oxa_24_40_gene;
     }

     public void setOxa_24_40_gene(String oxa_24_40_gene) {
          this.oxa_24_40_gene = oxa_24_40_gene;
     }

     public String getOxa_58_gene() {
          return oxa_58_gene;
     }

     public void setOxa_58_gene(String oxa_58_gene) {
          this.oxa_58_gene = oxa_58_gene;
     }

     public String getOxa_235_gene() {
          return oxa_235_gene;
     }

     public void setOxa_235_gene(String oxa_235_gene) {
          this.oxa_235_gene = oxa_235_gene;
     }

     public String getOxa_23_gene() {
          return oxa_23_gene;
     }

     public void setOxa_23_gene(String oxa_23_gene) {
          this.oxa_23_gene = oxa_23_gene;
     }

     public String getVim_gene() {
          return vim_gene;
     }

     public void setVim_gene(String vim_gene) {
          this.vim_gene = vim_gene;
     }

     public String getOther_gene_name() {
          return other_gene_name;
     }

     public void setOther_gene_name(String other_gene_name) {
          this.other_gene_name = other_gene_name;
     }

     public String getOther_gene_result() {
          return other_gene_result;
     }

     public void setOther_gene_result(String other_gene_result) {
          this.other_gene_result = other_gene_result;
     }

     public String getAztreonam_ast_mic_sign() {
          return aztreonam_ast_mic_sign;
     }

     public void setAztreonam_ast_mic_sign(String aztreonam_ast_mic_sign) {
          this.aztreonam_ast_mic_sign = aztreonam_ast_mic_sign;
     }

     public String getAztreonam_ast_mic() {
          return aztreonam_ast_mic;
     }

     public void setAztreonam_ast_mic(String aztreonam_ast_mic) {
          this.aztreonam_ast_mic = aztreonam_ast_mic;
     }

     public String getAztreonam_ast_zone_diameter() {
          return aztreonam_ast_zone_diameter;
     }

     public void setAztreonam_ast_zone_diameter(String aztreonam_ast_zone_diameter) {
          this.aztreonam_ast_zone_diameter = aztreonam_ast_zone_diameter;
     }

     public String getCefepime_ast_mic_sign() {
          return cefepime_ast_mic_sign;
     }

     public void setCefepime_ast_mic_sign(String cefepime_ast_mic_sign) {
          this.cefepime_ast_mic_sign = cefepime_ast_mic_sign;
     }

     public String getCefepime_ast_mic() {
          return cefepime_ast_mic;
     }

     public void setCefepime_ast_mic(String cefepime_ast_mic) {
          this.cefepime_ast_mic = cefepime_ast_mic;
     }

     public String getCefepime_ast_zone_diameter() {
          return cefepime_ast_zone_diameter;
     }

     public void setCefepime_ast_zone_diameter(String cefepime_ast_zone_diameter) {
          this.cefepime_ast_zone_diameter = cefepime_ast_zone_diameter;
     }

     public String getCeftazidime_ast_mic_sign() {
          return ceftazidime_ast_mic_sign;
     }

     public void setCeftazidime_ast_mic_sign(String ceftazidime_ast_mic_sign) {
          this.ceftazidime_ast_mic_sign = ceftazidime_ast_mic_sign;
     }

     public String getCeftazidime_ast_mic() {
          return ceftazidime_ast_mic;
     }

     public void setCeftazidime_ast_mic(String ceftazidime_ast_mic) {
          this.ceftazidime_ast_mic = ceftazidime_ast_mic;
     }

     public String getCeftazidime_ast_zone_diameter() {
          return ceftazidime_ast_zone_diameter;
     }

     public void setCeftazidime_ast_zone_diameter(String ceftazidime_ast_zone_diameter) {
          this.ceftazidime_ast_zone_diameter = ceftazidime_ast_zone_diameter;
     }

     public String getCeftriaxone_ast_mic_sign() {
          return ceftriaxone_ast_mic_sign;
     }

     public void setCeftriaxone_ast_mic_sign(String ceftriaxone_ast_mic_sign) {
          this.ceftriaxone_ast_mic_sign = ceftriaxone_ast_mic_sign;
     }

     public String getCeftriaxone_ast_mic() {
          return ceftriaxone_ast_mic;
     }

     public void setCeftriaxone_ast_mic(String ceftriaxone_ast_mic) {
          this.ceftriaxone_ast_mic = ceftriaxone_ast_mic;
     }

     public String getCeftriaxone_ast_zone_diameter() {
          return ceftriaxone_ast_zone_diameter;
     }

     public void setCeftriaxone_ast_zone_diameter(String ceftriaxone_ast_zone_diameter) {
          this.ceftriaxone_ast_zone_diameter = ceftriaxone_ast_zone_diameter;
     }

     public String getColistin_ast_mic_sign() {
          return colistin_ast_mic_sign;
     }

     public void setColistin_ast_mic_sign(String colistin_ast_mic_sign) {
          this.colistin_ast_mic_sign = colistin_ast_mic_sign;
     }

     public String getColistin_ast_mic() {
          return colistin_ast_mic;
     }

     public void setColistin_ast_mic(String colistin_ast_mic) {
          this.colistin_ast_mic = colistin_ast_mic;
     }

     public String getDoripenem_ast_mic_sign() {
          return doripenem_ast_mic_sign;
     }

     public void setDoripenem_ast_mic_sign(String doripenem_ast_mic_sign) {
          this.doripenem_ast_mic_sign = doripenem_ast_mic_sign;
     }

     public String getDoripenem_ast_mic() {
          return doripenem_ast_mic;
     }

     public void setDoripenem_ast_mic(String doripenem_ast_mic) {
          this.doripenem_ast_mic = doripenem_ast_mic;
     }

     public String getDoripenem_ast_zone_diameter() {
          return doripenem_ast_zone_diameter;
     }

     public void setDoripenem_ast_zone_diameter(String doripenem_ast_zone_diameter) {
          this.doripenem_ast_zone_diameter = doripenem_ast_zone_diameter;
     }

     public String getErtapenem_ast_mic_sign() {
          return ertapenem_ast_mic_sign;
     }

     public void setErtapenem_ast_mic_sign(String ertapenem_ast_mic_sign) {
          this.ertapenem_ast_mic_sign = ertapenem_ast_mic_sign;
     }

     public String getErtapenem_ast_mic() {
          return ertapenem_ast_mic;
     }

     public void setErtapenem_ast_mic(String ertapenem_ast_mic) {
          this.ertapenem_ast_mic = ertapenem_ast_mic;
     }

     public String getErtapenem_ast_zone_diameter() {
          return ertapenem_ast_zone_diameter;
     }

     public void setErtapenem_ast_zone_diameter(String ertapenem_ast_zone_diameter) {
          this.ertapenem_ast_zone_diameter = ertapenem_ast_zone_diameter;
     }

     public String getImipenem_ast_mic_sign() {
          return imipenem_ast_mic_sign;
     }

     public void setImipenem_ast_mic_sign(String imipenem_ast_mic_sign) {
          this.imipenem_ast_mic_sign = imipenem_ast_mic_sign;
     }

     public String getImipenem_ast_mic() {
          return imipenem_ast_mic;
     }

     public void setImipenem_ast_mic(String imipenem_ast_mic) {
          this.imipenem_ast_mic = imipenem_ast_mic;
     }

     public String getImipenem_ast_zone_diameter() {
          return imipenem_ast_zone_diameter;
     }

     public void setImipenem_ast_zone_diameter(String imipenem_ast_zone_diameter) {
          this.imipenem_ast_zone_diameter = imipenem_ast_zone_diameter;
     }

     public String getMeropenem_ast_mic_sign() {
          return meropenem_ast_mic_sign;
     }

     public void setMeropenem_ast_mic_sign(String meropenem_ast_mic_sign) {
          this.meropenem_ast_mic_sign = meropenem_ast_mic_sign;
     }

     public String getMeropenem_ast_mic() {
          return meropenem_ast_mic;
     }

     public void setMeropenem_ast_mic(String meropenem_ast_mic) {
          this.meropenem_ast_mic = meropenem_ast_mic;
     }

     public String getMeropenem_ast_zone_diameter() {
          return meropenem_ast_zone_diameter;
     }

     public void setMeropenem_ast_zone_diameter(String meropenem_ast_zone_diameter) {
          this.meropenem_ast_zone_diameter = meropenem_ast_zone_diameter;
     }

     public String getOther_3rdgen_cephalosporin_name() {
          return other_3rdgen_cephalosporin_name;
     }

     public void setOther_3rdgen_cephalosporin_name(String other_3rdgen_cephalosporin_name) {
          this.other_3rdgen_cephalosporin_name = other_3rdgen_cephalosporin_name;
     }

     public String getOther_3rdgen_cephalosporin_ast_mic_sign() {
          return other_3rdgen_cephalosporin_ast_mic_sign;
     }

     public void setOther_3rdgen_cephalosporin_ast_mic_sign(String other_3rdgen_cephalosporin_ast_mic_sign) {
          this.other_3rdgen_cephalosporin_ast_mic_sign = other_3rdgen_cephalosporin_ast_mic_sign;
     }

     public String getOther_3rdgen_cephalosporin_ast_mic() {
          return other_3rdgen_cephalosporin_ast_mic;
     }

     public void setOther_3rdgen_cephalosporin_ast_mic(String other_3rdgen_cephalosporin_ast_mic) {
          this.other_3rdgen_cephalosporin_ast_mic = other_3rdgen_cephalosporin_ast_mic;
     }

     public String getOther_3rdgen_cephalosporin_ast_zone_diameter() {
          return other_3rdgen_cephalosporin_ast_zone_diameter;
     }

     public void setOther_3rdgen_cephalosporin_ast_zone_diameter(String other_3rdgen_cephalosporin_ast_zone_diameter) {
          this.other_3rdgen_cephalosporin_ast_zone_diameter = other_3rdgen_cephalosporin_ast_zone_diameter;
     }

     public String getReglab_comment() {
          return reglab_comment;
     }

     public void setReglab_comment(String reglab_comment) {
          this.reglab_comment = reglab_comment;
     }

     public String getPiperacillin_tazobactam_ast_mic_sign() {
          return piperacillin_tazobactam_ast_mic_sign;
     }

     public void setPiperacillin_tazobactam_ast_mic_sign(String piperacillin_tazobactam_ast_mic_sign) {
          this.piperacillin_tazobactam_ast_mic_sign = piperacillin_tazobactam_ast_mic_sign;
     }

     public String getPiperacillin_tazobactam_ast_mic() {
          return piperacillin_tazobactam_ast_mic;
     }

     public void setPiperacillin_tazobactam_ast_mic(String piperacillin_tazobactam_ast_mic) {
          this.piperacillin_tazobactam_ast_mic = piperacillin_tazobactam_ast_mic;
     }

     public String getPiperacillin_tazobactam_ast_zone_diameter() {
          return piperacillin_tazobactam_ast_zone_diameter;
     }

     public void setPiperacillin_tazobactam_ast_zone_diameter(String piperacillin_tazobactam_ast_zone_diameter) {
          this.piperacillin_tazobactam_ast_zone_diameter = piperacillin_tazobactam_ast_zone_diameter;
     }

     public String getAmikacin_ast_mic_sign() {
          return amikacin_ast_mic_sign;
     }

     public void setAmikacin_ast_mic_sign(String amikacin_ast_mic_sign) {
          this.amikacin_ast_mic_sign = amikacin_ast_mic_sign;
     }

     public String getAmikacin_ast_mic() {
          return amikacin_ast_mic;
     }

     public void setAmikacin_ast_mic(String amikacin_ast_mic) {
          this.amikacin_ast_mic = amikacin_ast_mic;
     }

     public String getAmikacin_ast_zone_diameter() {
          return amikacin_ast_zone_diameter;
     }

     public void setAmikacin_ast_zone_diameter(String amikacin_ast_zone_diameter) {
          this.amikacin_ast_zone_diameter = amikacin_ast_zone_diameter;
     }

     public String getCiprofloxacin_ast_mic_sign() {
          return ciprofloxacin_ast_mic_sign;
     }

     public void setCiprofloxacin_ast_mic_sign(String ciprofloxacin_ast_mic_sign) {
          this.ciprofloxacin_ast_mic_sign = ciprofloxacin_ast_mic_sign;
     }

     public String getCiprofloxacin_ast_mic() {
          return ciprofloxacin_ast_mic;
     }

     public void setCiprofloxacin_ast_mic(String ciprofloxacin_ast_mic) {
          this.ciprofloxacin_ast_mic = ciprofloxacin_ast_mic;
     }

     public String getCiprofloxacin_ast_zone_diameter() {
          return ciprofloxacin_ast_zone_diameter;
     }

     public void setCiprofloxacin_ast_zone_diameter(String ciprofloxacin_ast_zone_diameter) {
          this.ciprofloxacin_ast_zone_diameter = ciprofloxacin_ast_zone_diameter;
     }

     public String getDoxycycline_ast_mic_sign() {
          return doxycycline_ast_mic_sign;
     }

     public void setDoxycycline_ast_mic_sign(String doxycycline_ast_mic_sign) {
          this.doxycycline_ast_mic_sign = doxycycline_ast_mic_sign;
     }

     public String getDoxycycline_ast_mic() {
          return doxycycline_ast_mic;
     }

     public void setDoxycycline_ast_mic(String doxycycline_ast_mic) {
          this.doxycycline_ast_mic = doxycycline_ast_mic;
     }

     public String getDoxycycline_ast_zone_diameter() {
          return doxycycline_ast_zone_diameter;
     }

     public void setDoxycycline_ast_zone_diameter(String doxycycline_ast_zone_diameter) {
          this.doxycycline_ast_zone_diameter = doxycycline_ast_zone_diameter;
     }

     public String getGentamicin_ast_mic_sign() {
          return gentamicin_ast_mic_sign;
     }

     public void setGentamicin_ast_mic_sign(String gentamicin_ast_mic_sign) {
          this.gentamicin_ast_mic_sign = gentamicin_ast_mic_sign;
     }

     public String getGentamicin_ast_mic() {
          return gentamicin_ast_mic;
     }

     public void setGentamicin_ast_mic(String gentamicin_ast_mic) {
          this.gentamicin_ast_mic = gentamicin_ast_mic;
     }

     public String getGentamicin_ast_zone_diameter() {
          return gentamicin_ast_zone_diameter;
     }

     public void setGentamicin_ast_zone_diameter(String gentamicin_ast_zone_diameter) {
          this.gentamicin_ast_zone_diameter = gentamicin_ast_zone_diameter;
     }

     public String getHp_aztreonam_ast_mic_sign() {
          return hp_aztreonam_ast_mic_sign;
     }

     public void setHp_aztreonam_ast_mic_sign(String hp_aztreonam_ast_mic_sign) {
          this.hp_aztreonam_ast_mic_sign = hp_aztreonam_ast_mic_sign;
     }

     public String getHp_aztreonam_ast_mic() {
          return hp_aztreonam_ast_mic;
     }

     public void setHp_aztreonam_ast_mic(String hp_aztreonam_ast_mic) {
          this.hp_aztreonam_ast_mic = hp_aztreonam_ast_mic;
     }

     public String getHp_aztreonam_avibactam_ast_mic_sign() {
          return hp_aztreonam_avibactam_ast_mic_sign;
     }

     public void setHp_aztreonam_avibactam_ast_mic_sign(String hp_aztreonam_avibactam_ast_mic_sign) {
          this.hp_aztreonam_avibactam_ast_mic_sign = hp_aztreonam_avibactam_ast_mic_sign;
     }

     public String getHp_aztreonam_avibactam_ast_mic() {
          return hp_aztreonam_avibactam_ast_mic;
     }

     public void setHp_aztreonam_avibactam_ast_mic(String hp_aztreonam_avibactam_ast_mic) {
          this.hp_aztreonam_avibactam_ast_mic = hp_aztreonam_avibactam_ast_mic;
     }

     public String getHp_ceftazidime_avibactam_ast_mic_sign() {
          return hp_ceftazidime_avibactam_ast_mic_sign;
     }

     public void setHp_ceftazidime_avibactam_ast_mic_sign(String hp_ceftazidime_avibactam_ast_mic_sign) {
          this.hp_ceftazidime_avibactam_ast_mic_sign = hp_ceftazidime_avibactam_ast_mic_sign;
     }

     public String getHp_ceftazidime_avibactam_ast_mic() {
          return hp_ceftazidime_avibactam_ast_mic;
     }

     public void setHp_ceftazidime_avibactam_ast_mic(String hp_ceftazidime_avibactam_ast_mic) {
          this.hp_ceftazidime_avibactam_ast_mic = hp_ceftazidime_avibactam_ast_mic;
     }

     public String getHp_ceftazidime_aztreonam_avibactam_ast_mic_sign() {
          return hp_ceftazidime_aztreonam_avibactam_ast_mic_sign;
     }

     public void setHp_ceftazidime_aztreonam_avibactam_ast_mic_sign(String hp_ceftazidime_aztreonam_avibactam_ast_mic_sign) {
          this.hp_ceftazidime_aztreonam_avibactam_ast_mic_sign = hp_ceftazidime_aztreonam_avibactam_ast_mic_sign;
     }

     public String getHp_ceftazidime_aztreonam_avibactam_ast_mic() {
          return hp_ceftazidime_aztreonam_avibactam_ast_mic;
     }

     public void setHp_ceftazidime_aztreonam_avibactam_ast_mic(String hp_ceftazidime_aztreonam_avibactam_ast_mic) {
          this.hp_ceftazidime_aztreonam_avibactam_ast_mic = hp_ceftazidime_aztreonam_avibactam_ast_mic;
     }

     public String getLevofloxacin_ast_mic_sign() {
          return levofloxacin_ast_mic_sign;
     }

     public void setLevofloxacin_ast_mic_sign(String levofloxacin_ast_mic_sign) {
          this.levofloxacin_ast_mic_sign = levofloxacin_ast_mic_sign;
     }

     public String getLevofloxacin_ast_mic() {
          return levofloxacin_ast_mic;
     }

     public void setLevofloxacin_ast_mic(String levofloxacin_ast_mic) {
          this.levofloxacin_ast_mic = levofloxacin_ast_mic;
     }

     public String getLevofloxacin_ast_zone_diameter() {
          return levofloxacin_ast_zone_diameter;
     }

     public void setLevofloxacin_ast_zone_diameter(String levofloxacin_ast_zone_diameter) {
          this.levofloxacin_ast_zone_diameter = levofloxacin_ast_zone_diameter;
     }

     public String getMinocycline_ast_mic_sign() {
          return minocycline_ast_mic_sign;
     }

     public void setMinocycline_ast_mic_sign(String minocycline_ast_mic_sign) {
          this.minocycline_ast_mic_sign = minocycline_ast_mic_sign;
     }

     public String getMinocycline_ast_mic() {
          return minocycline_ast_mic;
     }

     public void setMinocycline_ast_mic(String minocycline_ast_mic) {
          this.minocycline_ast_mic = minocycline_ast_mic;
     }

     public String getMinocycline_ast_zone_diameter() {
          return minocycline_ast_zone_diameter;
     }

     public void setMinocycline_ast_zone_diameter(String minocycline_ast_zone_diameter) {
          this.minocycline_ast_zone_diameter = minocycline_ast_zone_diameter;
     }

     public String getPolymixin_b_ast_mic_sign() {
          return polymixin_b_ast_mic_sign;
     }

     public void setPolymixin_b_ast_mic_sign(String polymixin_b_ast_mic_sign) {
          this.polymixin_b_ast_mic_sign = polymixin_b_ast_mic_sign;
     }

     public String getPolymixin_b_ast_mic() {
          return polymixin_b_ast_mic;
     }

     public void setPolymixin_b_ast_mic(String polymixin_b_ast_mic) {
          this.polymixin_b_ast_mic = polymixin_b_ast_mic;
     }

     public String getPolymixin_b_ast_zone_diameter() {
          return polymixin_b_ast_zone_diameter;
     }

     public void setPolymixin_b_ast_zone_diameter(String polymixin_b_ast_zone_diameter) {
          this.polymixin_b_ast_zone_diameter = polymixin_b_ast_zone_diameter;
     }

     public String getTicarcillin_clavulanate_constant2_ast_mic_sign() {
          return ticarcillin_clavulanate_constant2_ast_mic_sign;
     }

     public void setTicarcillin_clavulanate_constant2_ast_mic_sign(String ticarcillin_clavulanate_constant2_ast_mic_sign) {
          this.ticarcillin_clavulanate_constant2_ast_mic_sign = ticarcillin_clavulanate_constant2_ast_mic_sign;
     }

     public String getTicarcillin_clavulanate_constant2_ast_mic() {
          return ticarcillin_clavulanate_constant2_ast_mic;
     }

     public void setTicarcillin_clavulanate_constant2_ast_mic(String ticarcillin_clavulanate_constant2_ast_mic) {
          this.ticarcillin_clavulanate_constant2_ast_mic = ticarcillin_clavulanate_constant2_ast_mic;
     }

     public String getTicarcillin_clavulanate_constant2_ast_zone_diameter() {
          return ticarcillin_clavulanate_constant2_ast_zone_diameter;
     }

     public void setTicarcillin_clavulanate_constant2_ast_zone_diameter(String ticarcillin_clavulanate_constant2_ast_zone_diameter) {
          this.ticarcillin_clavulanate_constant2_ast_zone_diameter = ticarcillin_clavulanate_constant2_ast_zone_diameter;
     }

     public String getTigecycline_ast_mic_sign() {
          return tigecycline_ast_mic_sign;
     }

     public void setTigecycline_ast_mic_sign(String tigecycline_ast_mic_sign) {
          this.tigecycline_ast_mic_sign = tigecycline_ast_mic_sign;
     }

     public String getTigecycline_ast_mic() {
          return tigecycline_ast_mic;
     }

     public void setTigecycline_ast_mic(String tigecycline_ast_mic) {
          this.tigecycline_ast_mic = tigecycline_ast_mic;
     }

     public String getTigecycline_ast_zone_diameter() {
          return tigecycline_ast_zone_diameter;
     }

     public void setTigecycline_ast_zone_diameter(String tigecycline_ast_zone_diameter) {
          this.tigecycline_ast_zone_diameter = tigecycline_ast_zone_diameter;
     }

     public String getTobramycin_ast_mic_sign() {
          return tobramycin_ast_mic_sign;
     }

     public void setTobramycin_ast_mic_sign(String tobramycin_ast_mic_sign) {
          this.tobramycin_ast_mic_sign = tobramycin_ast_mic_sign;
     }

     public String getTobramycin_ast_mic() {
          return tobramycin_ast_mic;
     }

     public void setTobramycin_ast_mic(String tobramycin_ast_mic) {
          this.tobramycin_ast_mic = tobramycin_ast_mic;
     }

     public String getTobramycin_ast_zone_diameter() {
          return tobramycin_ast_zone_diameter;
     }

     public void setTobramycin_ast_zone_diameter(String tobramycin_ast_zone_diameter) {
          this.tobramycin_ast_zone_diameter = tobramycin_ast_zone_diameter;
     }

     public String getTrimethoprim_sulfamethoxazole_ast_mic_sign() {
          return trimethoprim_sulfamethoxazole_ast_mic_sign;
     }

     public void setTrimethoprim_sulfamethoxazole_ast_mic_sign(String trimethoprim_sulfamethoxazole_ast_mic_sign) {
          this.trimethoprim_sulfamethoxazole_ast_mic_sign = trimethoprim_sulfamethoxazole_ast_mic_sign;
     }

     public String getTrimethoprim_sulfamethoxazole_ast_mic() {
          return trimethoprim_sulfamethoxazole_ast_mic;
     }

     public void setTrimethoprim_sulfamethoxazole_ast_mic(String trimethoprim_sulfamethoxazole_ast_mic) {
          this.trimethoprim_sulfamethoxazole_ast_mic = trimethoprim_sulfamethoxazole_ast_mic;
     }

     public String getTrimethoprim_sulfamethoxazole_ast_zone_diameter() {
          return trimethoprim_sulfamethoxazole_ast_zone_diameter;
     }

     public void setTrimethoprim_sulfamethoxazole_ast_zone_diameter(String trimethoprim_sulfamethoxazole_ast_zone_diameter) {
          this.trimethoprim_sulfamethoxazole_ast_zone_diameter = trimethoprim_sulfamethoxazole_ast_zone_diameter;
     }

     public String getMeropenem_vaborbactam_ast_mic_sign() {
          return meropenem_vaborbactam_ast_mic_sign;
     }

     public void setMeropenem_vaborbactam_ast_mic_sign(String meropenem_vaborbactam_ast_mic_sign) {
          this.meropenem_vaborbactam_ast_mic_sign = meropenem_vaborbactam_ast_mic_sign;
     }

     public String getMeropenem_vaborbactam_ast_mic() {
          return meropenem_vaborbactam_ast_mic;
     }

     public void setMeropenem_vaborbactam_ast_mic(String meropenem_vaborbactam_ast_mic) {
          this.meropenem_vaborbactam_ast_mic = meropenem_vaborbactam_ast_mic;
     }

     public String getMeropenem_vaborbactam_ast_zone_diameter() {
          return meropenem_vaborbactam_ast_zone_diameter;
     }

     public void setMeropenem_vaborbactam_ast_zone_diameter(String meropenem_vaborbactam_ast_zone_diameter) {
          this.meropenem_vaborbactam_ast_zone_diameter = meropenem_vaborbactam_ast_zone_diameter;
     }

     public String getCeftolozane_tazobactam_ast_mic_sign() {
          return ceftolozane_tazobactam_ast_mic_sign;
     }

     public void setCeftolozane_tazobactam_ast_mic_sign(String ceftolozane_tazobactam_ast_mic_sign) {
          this.ceftolozane_tazobactam_ast_mic_sign = ceftolozane_tazobactam_ast_mic_sign;
     }

     public String getCeftolozane_tazobactam_ast_mic() {
          return ceftolozane_tazobactam_ast_mic;
     }

     public void setCeftolozane_tazobactam_ast_mic(String ceftolozane_tazobactam_ast_mic) {
          this.ceftolozane_tazobactam_ast_mic = ceftolozane_tazobactam_ast_mic;
     }

     public String getCeftolozane_tazobactam_ast_zone_diameter() {
          return ceftolozane_tazobactam_ast_zone_diameter;
     }

     public void setCeftolozane_tazobactam_ast_zone_diameter(String ceftolozane_tazobactam_ast_zone_diameter) {
          this.ceftolozane_tazobactam_ast_zone_diameter = ceftolozane_tazobactam_ast_zone_diameter;
     }

     public String getCeftazidime_avibactam_ast_mic_sign() {
          return ceftazidime_avibactam_ast_mic_sign;
     }

     public void setCeftazidime_avibactam_ast_mic_sign(String ceftazidime_avibactam_ast_mic_sign) {
          this.ceftazidime_avibactam_ast_mic_sign = ceftazidime_avibactam_ast_mic_sign;
     }

     public String getCeftazidime_avibactam_ast_mic() {
          return ceftazidime_avibactam_ast_mic;
     }

     public void setCeftazidime_avibactam_ast_mic(String ceftazidime_avibactam_ast_mic) {
          this.ceftazidime_avibactam_ast_mic = ceftazidime_avibactam_ast_mic;
     }

     public String getCeftazidime_avibactam_ast_zone_diameter() {
          return ceftazidime_avibactam_ast_zone_diameter;
     }

     public void setCeftazidime_avibactam_ast_zone_diameter(String ceftazidime_avibactam_ast_zone_diameter) {
          this.ceftazidime_avibactam_ast_zone_diameter = ceftazidime_avibactam_ast_zone_diameter;
     }

     public String getMoxifloxacin_ast_mic_sign() {
          return moxifloxacin_ast_mic_sign;
     }

     public void setMoxifloxacin_ast_mic_sign(String moxifloxacin_ast_mic_sign) {
          this.moxifloxacin_ast_mic_sign = moxifloxacin_ast_mic_sign;
     }

     public String getMoxifloxacin_ast_mic() {
          return moxifloxacin_ast_mic;
     }

     public void setMoxifloxacin_ast_mic(String moxifloxacin_ast_mic) {
          this.moxifloxacin_ast_mic = moxifloxacin_ast_mic;
     }

     public String getMoxifloxacin_ast_zone_diameter() {
          return moxifloxacin_ast_zone_diameter;
     }

     public void setMoxifloxacin_ast_zone_diameter(String moxifloxacin_ast_zone_diameter) {
          this.moxifloxacin_ast_zone_diameter = moxifloxacin_ast_zone_diameter;
     }

     public String getFosfomycin_ast_mic_sign() {
          return fosfomycin_ast_mic_sign;
     }

     public void setFosfomycin_ast_mic_sign(String fosfomycin_ast_mic_sign) {
          this.fosfomycin_ast_mic_sign = fosfomycin_ast_mic_sign;
     }

     public String getFosfomycin_ast_mic() {
          return fosfomycin_ast_mic;
     }

     public void setFosfomycin_ast_mic(String fosfomycin_ast_mic) {
          this.fosfomycin_ast_mic = fosfomycin_ast_mic;
     }

     public String getFosfomycin_ast_zone_diameter() {
          return fosfomycin_ast_zone_diameter;
     }

     public void setFosfomycin_ast_zone_diameter(String fosfomycin_ast_zone_diameter) {
          this.fosfomycin_ast_zone_diameter = fosfomycin_ast_zone_diameter;
     }

     public String getOrganism_suspected() {
          return organism_suspected;
     }

     public void setOrganism_suspected(String organism_suspected) {
          this.organism_suspected = organism_suspected;
     }

     public String getAmpicillin_sulbac_ast_mic_sign() {
          return ampicillin_sulbac_ast_mic_sign;
     }

     public void setAmpicillin_sulbac_ast_mic_sign(String ampicillin_sulbac_ast_mic_sign) {
          this.ampicillin_sulbac_ast_mic_sign = ampicillin_sulbac_ast_mic_sign;
     }

     public String getAmpicillin_sulbac_ast_mic() {
          return ampicillin_sulbac_ast_mic;
     }

     public void setAmpicillin_sulbac_ast_mic(String ampicillin_sulbac_ast_mic) {
          this.ampicillin_sulbac_ast_mic = ampicillin_sulbac_ast_mic;
     }

     public String getAmpicillin_sulbac_ast_zone_diameter() {
          return ampicillin_sulbac_ast_zone_diameter;
     }

     public void setAmpicillin_sulbac_ast_zone_diameter(String ampicillin_sulbac_ast_zone_diameter) {
          this.ampicillin_sulbac_ast_zone_diameter = ampicillin_sulbac_ast_zone_diameter;
     }

     public String getCefotaxime_ast_mic_sign() {
          return cefotaxime_ast_mic_sign;
     }

     public void setCefotaxime_ast_mic_sign(String cefotaxime_ast_mic_sign) {
          this.cefotaxime_ast_mic_sign = cefotaxime_ast_mic_sign;
     }

     public String getCefotaxime_ast_mic() {
          return cefotaxime_ast_mic;
     }

     public void setCefotaxime_ast_mic(String cefotaxime_ast_mic) {
          this.cefotaxime_ast_mic = cefotaxime_ast_mic;
     }

     public String getCefotaxime_ast_zone_diameter() {
          return cefotaxime_ast_zone_diameter;
     }

     public void setCefotaxime_ast_zone_diameter(String cefotaxime_ast_zone_diameter) {
          this.cefotaxime_ast_zone_diameter = cefotaxime_ast_zone_diameter;
     }

     public String getDate_result_released() {
          return date_result_released;
     }

     public void setDate_result_released(String date_result_released) {
          this.date_result_released = date_result_released;
     }

     public String getCefotaxime_clavulanate_ast_mic_sign() {
          return cefotaxime_clavulanate_ast_mic_sign;
     }

     public void setCefotaxime_clavulanate_ast_mic_sign(String cefotaxime_clavulanate_ast_mic_sign) {
          this.cefotaxime_clavulanate_ast_mic_sign = cefotaxime_clavulanate_ast_mic_sign;
     }

     public String getCefotaxime_clavulanate_ast_mic() {
          return cefotaxime_clavulanate_ast_mic;
     }

     public void setCefotaxime_clavulanate_ast_mic(String cefotaxime_clavulanate_ast_mic) {
          this.cefotaxime_clavulanate_ast_mic = cefotaxime_clavulanate_ast_mic;
     }

     public String getCefotaxime_clavulanate_ast_zone_diameter() {
          return cefotaxime_clavulanate_ast_zone_diameter;
     }

     public void setCefotaxime_clavulanate_ast_zone_diameter(String cefotaxime_clavulanate_ast_zone_diameter) {
          this.cefotaxime_clavulanate_ast_zone_diameter = cefotaxime_clavulanate_ast_zone_diameter;
     }

     public String getCeftazidime_clavulanate_ast_mic_sign() {
          return ceftazidime_clavulanate_ast_mic_sign;
     }

     public void setCeftazidime_clavulanate_ast_mic_sign(String ceftazidime_clavulanate_ast_mic_sign) {
          this.ceftazidime_clavulanate_ast_mic_sign = ceftazidime_clavulanate_ast_mic_sign;
     }

     public String getCeftazidime_clavulanate_ast_mic() {
          return ceftazidime_clavulanate_ast_mic;
     }

     public void setCeftazidime_clavulanate_ast_mic(String ceftazidime_clavulanate_ast_mic) {
          this.ceftazidime_clavulanate_ast_mic = ceftazidime_clavulanate_ast_mic;
     }

     public String getCeftazidime_clavulanate_ast_zone_diameter() {
          return ceftazidime_clavulanate_ast_zone_diameter;
     }

     public void setCeftazidime_clavulanate_ast_zone_diameter(String ceftazidime_clavulanate_ast_zone_diameter) {
          this.ceftazidime_clavulanate_ast_zone_diameter = ceftazidime_clavulanate_ast_zone_diameter;
     }

     public String getReporting_month() {
          return reporting_month;
     }

     public void setReporting_month(String reporting_month) {
          this.reporting_month = reporting_month;
     }
}