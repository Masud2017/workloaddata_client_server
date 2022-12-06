package org.workload.service;

import org.workload.model.ClientRFD;

public interface WorkLoadSerializer {
    Object serialize (ClientRFD clientRFD);
}
