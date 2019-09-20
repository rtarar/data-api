package gov.cdc.ncezid.arln.data.dataapi;

import gov.cdc.ncezid.arln.data.dataapi.es.model.ArlnTransmission;
import gov.cdc.ncezid.arln.data.dataapi.es.service.ArlnTransmissionService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(value="Language API", description="Operations pertaining to Language")
@RequestMapping("/api")
public class DataAPIController {

    @Autowired
    ArlnTransmissionService service;

    @ApiOperation(value = "View a list of available languages", response = Iterable.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved list"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    }
    )
    @GetMapping(value = "/transmissions", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<ArlnTransmission>> getLanguages() {
        final List<ArlnTransmission> arlnTransmissions = service.findAll();
        return new ResponseEntity<>(arlnTransmissions, HttpStatus.OK);
    }


}
