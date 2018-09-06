package com.ameex.training.db;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.ameex.training.business.Product;

@Repository(value="productDAO")
public class SpringProductDAOImpl implements ProductDAO, MySQLProductQueries{

	@Autowired
	JdbcTemplate template;

	
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	@Override
	public boolean addProduct(Product product) {
		Object[] values={product.getId(), product.getName(), product.getPrice(), product.getManufacturedDate(), product.getCategory()+""};
		int rowcount=template.update(INSERT_QUERY,values);
		if(rowcount>0)
			return true;
		return false;
	}

	@Override
	public boolean updateProduct(Product product) {
		Object[] values={ product.getName(), product.getPrice(), product.getManufacturedDate(), product.getCategory()+"", product.getId()};
		int rowcount=template.update(UPDATE_QUERY,values);
		if(rowcount>0)
			return true;
		
		return false;
	}

	@Override
	public boolean deleteProduct(Product product) {
		Object[] values={product.getId()};
		int rowcount=template.update(DELETE_QUERY,values);
		if(rowcount>0)
			return true;
		return false;
	}

	@Override
	public Product findProduct(int id) {
		Product product=template.queryForObject(FIND_ONE_QUERY, new ProductRowMapper(), id);
		return product;
	}

	@Override
	public List<Product> getAllProducts() {
		List<Product> products=template.query(FIND_ALL_QUERY, new ProductRowMapper());
		return products;
	}
	
	
	
	private class ProductRowMapper implements RowMapper<Product>{

		@Override
		public Product mapRow(ResultSet rs, int arg1) throws SQLException {
				Product product=new Product();
				product.setId(rs.getInt(1));
				product.setName(rs.getString(2));
				product.setPrice(rs.getDouble(3));
				java.sql.Date date=rs.getDate(4);
				java.util.Date date2=DateConversion.convertToUtilDate(date);
				product.setManufacturedDate(date2);
				product.setCategory(rs.getString(5).charAt(0));
				return product;
		}

}
}