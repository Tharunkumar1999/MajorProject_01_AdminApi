package in.ashokit.service;

import java.util.List;

import in.ashokit.bindings.PlanForm;

public interface PlanSevice {

    public boolean createPlan(PlanForm planForm);

    public List<PlanForm> fetchPlans();

    public PlanForm getPlanById(Integer planId);

    public String changePlanStatus(Integer planId, String status);

}
