/*
 * NOTE: This class is auto generated by the swagger code generator program (3.0.33).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.freetrainingzone.identityverification.api;

import com.freetrainingzone.identityverification.model.IdentityVerificationResponsePayLoad;
import com.freetrainingzone.identityverification.model.Person;
import com.freetrainingzone.identityverification.model.ServiceError;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-03-26T14:47:05.807916-04:00[America/New_York]")
@Validated
public interface IdentityVerificationDetailApi {

    @Operation(summary = "", description = "", tags={ "identityVerificationDetail", "checkInstantId", "dataFromLN" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Message processed successfully.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = IdentityVerificationResponsePayLoad.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request -The server cannot or will not proceess the request due to an apparent client error (e.g. malformed request syntax, size too large, invalid request framing, or deceptive request routing).", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ServiceError.class))),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized. When authentication is required and has failed or has not yet been provided.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ServiceError.class))),
        
        @ApiResponse(responseCode = "404", description = "Not found: The requested resource could not be founf but may be available in the future. Subsequent requests by the client are permissible.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ServiceError.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error: A generic error message, given when an unxpected condition was ecnountered and no more specific message is sutiable.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ServiceError.class))) })
    @RequestMapping(value = "/identityVerificationDetail",
        produces = "application/json", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<IdentityVerificationResponsePayLoad> identityVerificationDetail(@Parameter(in = ParameterIn.HEADER, description = "API Gateway Hosed APIs or Proxies : Client Id and Client encoded in Basic Auth format. API Provider : AFS Token." ,required=true,schema=@Schema()) @RequestHeader(value="Authorization", required=true) String authorization,
                                                                                   @Parameter(in = ParameterIn.DEFAULT, description = "Identity Verification Request", required=true, schema=@Schema()) @Valid @RequestBody List<Person> body,
                                                                                   @Parameter(in = ParameterIn.HEADER, description = "A unique number for every Trace and a 128 bit number encoded as 32 lower-hex characters." ,schema=@Schema()) @RequestHeader(value="trace-id", required=false) String traceId);

}

