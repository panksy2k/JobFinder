package com.stuxnet.jobfinder.controller;

import com.stuxnet.jobfinder.domain.CandidateRegistration;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.lang.invoke.MethodHandles;

@Api(value = "REST Api for registering the candidate information")
@RestController
public class CandidateRegistrationController {
    private static final Logger log = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @ApiOperation(value = "This service would enable registration of candidate to the job portal", httpMethod = "POST", response = Long.class)
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Bad request, invalid details provided to register the candidate information"),
            @ApiResponse(code = 422, message = "Unprocessable entity, input parameters caused the processing to fail. See response message for more information.")
    })
    @PostMapping(path = "/register", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Long> registerCandidate(@ApiParam(required = true, type = "CandidateRegistration.class") @RequestBody CandidateRegistration candidate) {
        log.info("Registering the candidate from {}", candidate.toString());
        return ResponseEntity.ok(1L);
    }
}
