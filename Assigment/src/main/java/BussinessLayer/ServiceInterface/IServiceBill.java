package BussinessLayer.ServiceInterface;

import java.util.List;

import BussinessLayer.entities.Bill;

public interface IServiceBill {
	public Bill add(Bill entity) throws Exception;
	public Bill delete(Bill entity) throws Exception;
	public Bill update(Bill entity) throws Exception;
	public Bill findById(int id) throws Exception;
	public List<Bill> selectAll() throws Exception;

}
