package com.niit.test.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.test.model.Cart;
import com.niit.test.model.Cartitems;
import com.niit.test.model.OrderDetails;
import com.niit.test.model.Shipping;

@Repository
@Transactional
public class CartDaoImpl implements Cartdao {
	
	@Autowired
	private SessionFactory sf;

	@Override
	public void add(Cart cart) {
		// TODO Auto-generated method stub
		sf.getCurrentSession().save(cart);
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Cart> getAllCart(String username) {
		// TODO Auto-generated method stub
		return sf.getCurrentSession().createQuery("from CART where USERNAME='"+username+"'").list();

	}

	@Override
	public void update(Cart cart) {
		// TODO Auto-generated method stub
		sf.getCurrentSession().update(cart);
		
	}
	public Cart getCartdetbycid(int cid)
	{
		return (Cart)sf.getCurrentSession().get(Cart.class,cid);
		
	}
	
	@Override
	public void deletecartitem(int cid) {
		// TODO Auto-generated method stub
		sf.getCurrentSession().delete(getCartdetbycid(cid));
	}

	@Override
	public void saveshippment(Shipping shippingdetails) {
		// TODO Auto-generated method stub
		sf.getCurrentSession().saveOrUpdate(shippingdetails);
	}

	@Override
	public void savecart(Cartitems cit) {
		// TODO Auto-generated method stub
		sf.getCurrentSession().save(cit);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Cartitems> getallacrtitesm(int sid) {
		// TODO Auto-generated method stub
		return  (List<Cartitems>) sf.getCurrentSession().createQuery("FROM CARTITEMS WHERE SID='"+sid+"'").list();
	}

	@Override
	public void saveorder(OrderDetails ord) {
		// TODO Auto-generated method stub
		sf.getCurrentSession().saveOrUpdate(ord);
	}

	@Override
	public Shipping getShippingdetails(int sid) {
		// TODO Auto-generated method stub
		return (Shipping) sf.getCurrentSession().get(Shipping.class,sid);
	}

	@Override
	public void deleteallacrtitem(String username) {
		// TODO Auto-generated method stub
		List<Cart> cartfullitems=getAllCart(username);
		for(int i=0;i<cartfullitems.size();i++)
		{
			int cid=cartfullitems.get(i).getCid();
			deletecartitem(cid);
	
		}
	}
}
