package it.polito.ai.virtuallabs.services;

import it.polito.ai.virtuallabs.dtos.StudentDTO;
import it.polito.ai.virtuallabs.dtos.VMDTO;

import java.io.IOException;
import java.security.Principal;
import java.util.List;

public interface VMService {
    // VMS MANAGEMENT

    void vmChangeParam(VMDTO vmdto, Principal principal);

    void changeState(String vmId, String action, Principal principal);

    void switchOnVM(String vmId, Principal principal);

    void switchOffVM(String vmId, Principal principal);

    void deleteVM(String vmId, Principal principal);

    void createVM(VMDTO vmdto, String courseId, Principal principal);

    byte[] execVM(String vmId, Principal principal) throws IOException;

    List<VMDTO> getMyVms(Principal principal, String courseName);

    List<StudentDTO> getOwners(String vmId, Principal principal);

    List<StudentDTO> getNotOwners(String vmId, Principal principal);

    void addOwner(String vmId, String idStudent, Principal principal);
}
