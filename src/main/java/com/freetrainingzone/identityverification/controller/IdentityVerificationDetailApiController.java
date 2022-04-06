package com.freetrainingzone.identityverification.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.freetrainingzone.identityverification.api.IdentityVerificationDetailApi;
import com.freetrainingzone.identityverification.model.IdentityVerificationResponsePayLoad;
import com.freetrainingzone.identityverification.model.Person;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.io.IOException;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-03-26T14:47:05.807916-04:00[America/New_York]")
@RestController
public class IdentityVerificationDetailApiController implements IdentityVerificationDetailApi {

    private static final Logger log = LoggerFactory.getLogger(IdentityVerificationDetailApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public IdentityVerificationDetailApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<IdentityVerificationResponsePayLoad> identityVerificationDetail(@Parameter(in = ParameterIn.HEADER, description = "API Gateway Hosed APIs or Proxies : Client Id and Client encoded in Basic Auth format. API Provider : AFS Token." ,required=true,schema=@Schema()) @RequestHeader(value="Authorization", required=true) String authorization,@Parameter(in = ParameterIn.DEFAULT, description = "Identity Verification Request", required=true, schema=@Schema()) @Valid @RequestBody List<Person> body,@Parameter(in = ParameterIn.HEADER, description = "A unique number for every Trace and a 128 bit number encoded as 32 lower-hex characters." ,schema=@Schema()) @RequestHeader(value="trace-id", required=false) String traceId) {
        String accept = request.getHeader("Accept");
        if (accept != null && (accept.contains("application/json") || accept.contains("*/*"))) {
            try {
                return new ResponseEntity<IdentityVerificationResponsePayLoad>(objectMapper.readValue("{\r\n  \"riskScores\" : {\r\n    \"riskScore4\" : 412.27612549813875,\r\n    \"riskScore3\" : 2147483647,\r\n    \"riskScore1\" : 1.2747405657335236\r\n  },\r\n  \"verifiedInput\" : {\r\n    \"verifiedInputCount\" : 1,\r\n    \"verificationSource\" : \"Internal\",\r\n    \"verificationCode2\" : 1465,\r\n    \"verificationCode3\" : 19,\r\n    \"verificationCode1\" : 6.027456177042947E8\r\n  }\r\n}", IdentityVerificationResponsePayLoad.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<IdentityVerificationResponsePayLoad>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<IdentityVerificationResponsePayLoad>(HttpStatus.NOT_IMPLEMENTED);
    }

}
