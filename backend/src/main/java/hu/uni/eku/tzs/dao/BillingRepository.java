package hu.uni.eku.tzs.dao;

import hu.uni.eku.tzs.dao.entity.Bill;
import org.springframework.data.repository.CrudRepository;

public interface BillingRepository extends CrudRepository<Bill, Integer>{
    Bill findByBillId(Integer billId);
}
