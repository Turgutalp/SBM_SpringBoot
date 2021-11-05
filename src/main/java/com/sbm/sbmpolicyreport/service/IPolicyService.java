package com.sbm.sbmpolicyreport.service;

import com.sbm.sbmpolicyreport.model.Policy;

import java.util.List;

public interface IPolicyService {

    public List<Policy> getAllPolicy();

    public Policy getPolicyByID(long id);

    public void saveOrUpdatePolicy(Policy policy);

    public void deletePolicy(long id);
}
