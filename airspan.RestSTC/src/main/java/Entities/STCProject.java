package Entities;

import java.util.List;

/**
 * Created by iagmon on 16-Nov-16.
 */
public class STCProject {

    List<STCPort> ports;


    public STCProject(List<STCPort> ports) {
        this.ports = ports;
    }

    public List<STCPort> GetPorts() {
        return ports;
    }
}
