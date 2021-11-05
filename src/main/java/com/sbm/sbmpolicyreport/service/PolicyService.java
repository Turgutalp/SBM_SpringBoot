package com.sbm.sbmpolicyreport.service;

import com.sbm.sbmpolicyreport.model.Policy;
import com.sbm.sbmpolicyreport.repository.PolicyRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class PolicyService implements IPolicyService {

    private final PolicyRepository _policyRepository;

    public PolicyService(PolicyRepository policyRepository){
        _policyRepository = policyRepository;
    }


    @Override
    public List<Policy> getAllPolicy() {
       return (List<Policy>) _policyRepository.findAll();
    }

    @Override
    public Policy getPolicyByID(long id) {
        return  _policyRepository.findById(id).get();
    }

    @Override
    public void saveOrUpdatePolicy(Policy policy) {

        _policyRepository.save(policy);
    }

    @Override
    public void deletePolicy(long id) {
        _policyRepository.deleteById(id);

    }
}
