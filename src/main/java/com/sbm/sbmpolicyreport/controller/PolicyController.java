package com.sbm.sbmpolicyreport.controller;

import com.sbm.sbmpolicyreport.model.Policy;
import com.sbm.sbmpolicyreport.service.PolicyService;
import com.sun.net.httpserver.Authenticator;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;


import java.util.List;

@Controller
public class PolicyController {

    private final PolicyService _policyService;

    public PolicyController(PolicyService policyService){
        _policyService = policyService;

    }


    @RequestMapping(value="/", method= RequestMethod.GET)
    public ModelAndView listPolicy() {
        ModelAndView model = new ModelAndView("policy_list");
        List<Policy> policyList = _policyService.getAllPolicy();
        model.addObject("policyList", policyList);

        return model;
    }


    @RequestMapping(value="/addPolicy/", method=RequestMethod.GET)
    public ModelAndView addPolicy() {
        ModelAndView model = new ModelAndView();

        Policy policy = new Policy();
        model.addObject("policyForm", policy);
        model.setViewName("policy_form");

        return model;
    }


    @RequestMapping(value="/updatePolicy/{id}", method=RequestMethod.GET)
    public ModelAndView editPolicy(@PathVariable long id) {
        ModelAndView model = new ModelAndView();

        Policy policy = _policyService.getPolicyByID(id);
        model.addObject("policyForm", policy);
        model.setViewName("policy_form");

        return model;
    }

    @RequestMapping(value="/savePolicy", method=RequestMethod.POST)
    public ModelAndView save(@ModelAttribute("policyForm") Policy policy) {
        _policyService.saveOrUpdatePolicy(policy);

        return new ModelAndView("redirect:/");
    }

    @RequestMapping(value="/deletePolicy/{id}", method=RequestMethod.GET)
    public ModelAndView delete(@PathVariable("id") long id) {
        _policyService.deletePolicy(id);

        return new ModelAndView("redirect:/");
    }





    @PostMapping("/")
    public String submitForm(@Valid @ModelAttribute("policy") Policy policy,
                             BindingResult bindingResult) {

        if (bindingResult.hasErrors()){
            return "policy_form";
        }
        return null;



    }

    }
