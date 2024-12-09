package in.ashokit.service;

import java.util.List;

import org.springframework.stereotype.Service;

import in.ashokit.bindings.PlanForm;

@Service
public class PlanServiceImpl implements PlanSevice {

    @Override
    public boolean createPlan(PlanForm planForm) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createPlan'");
    }

    @Override
    public List<PlanForm> fetchPlans() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'fetchPlans'");
    }

    @Override
    public PlanForm getPlanById(Integer planId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPlanById'");
    }

    @Override
    public String changePlanStatus(Integer planId, String status) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'changePlanStatus'");
    }

}
