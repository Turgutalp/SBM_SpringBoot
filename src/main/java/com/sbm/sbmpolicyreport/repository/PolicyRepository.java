package com.sbm.sbmpolicyreport.repository;

import com.sbm.sbmpolicyreport.model.Policy;
import org.springframework.data.repository.CrudRepository;

public interface PolicyRepository  extends CrudRepository<Policy, Long> {
}
