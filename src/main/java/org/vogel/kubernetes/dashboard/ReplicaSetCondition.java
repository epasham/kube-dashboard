package org.vogel.kubernetes.dashboard;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class ReplicaSetCondition {
    private String type;
    private String status;
    private String reason;
}
