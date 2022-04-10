package DataAccessLayer;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import BussinessLayer.ServiceInterface.IServiceBill;
import BussinessLayer.Utils.JpaUtil;
import BussinessLayer.entities.Bill;

public class ServiceBill  implements IServiceBill{
EntityManager em;
public ServiceBill() {
	em=JpaUtil.createEntityManager();
	// TODO Auto-generated constructor stub
}
	@Override
	public Bill add(Bill entity) throws Exception {
		try {
			em.getTransaction().begin();
			em.persist(entity);
			em.flush();
			em.getTransaction().commit();
			return entity;
		} catch (Exception e) {
			e.printStackTrace();
			em.getTransaction().rollback();
			throw e;
		}
	}

	@Override
	public Bill delete(Bill entity) throws Exception {
		try {
			em.getTransaction().begin();
			em.remove(entity);
			em.flush();
			em.getTransaction().commit();
			return entity;
		} catch (Exception e) {
			e.printStackTrace();
			em.getTransaction().rollback();
			throw e;
		}
	}

	@Override
	public Bill update(Bill entity) throws Exception {
		try {
			em.getTransaction().begin();
			em.merge(entity);
			em.flush();
			em.getTransaction().commit();
			return entity;
		} catch (Exception e) {
			e.printStackTrace();
			em.getTransaction().rollback();
			throw e;
		}
	}

	@Override
	public Bill findById(int id) throws Exception {
		return em.find(Bill.class,id);
	}

	@Override
	public List<Bill> selectAll() throws Exception {
	String query="SELECT b FROM Bill b ";
	TypedQuery<Bill>list=em.createQuery(query,Bill.class);
	return list.getResultList();
	}
	

}
