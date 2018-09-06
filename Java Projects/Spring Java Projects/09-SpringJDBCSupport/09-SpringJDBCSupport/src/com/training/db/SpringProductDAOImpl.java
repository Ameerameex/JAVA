package com.training.db;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.training.business.Product;

public class SpringProductDAOImpl implements ProductDAO, ProductQueries {
	JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	@Override
	public boolean addProduct(Product product) throws Throwable {
		Object[] values = { product.getId(), product.getName(), product.getPrice(), product.getManufacturedDate(),
				product.getCategory() + "" };
		int rowCount = template.update(INSERT, values);
		if (rowCount > 0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteProduct(Product product) throws Throwable {
		Object[] value = { product.getId() };
		int rowCount = template.update(DELETE, value);
		if (rowCount > 0) {
			return true;
		}

		return false;
		
	}

	
	@Override
	public boolean updateProduct(Product product) throws Throwable {
		Object[] values = { product.getName(), product.getPrice(), product.getManufacturedDate(),
				product.getCategory()+"",product.getId()};
		int rowCount = template.update(UPDATE, values);
		if (rowCount > 0) {
			return true;
		}

		return false;
	}

	@Override
	public Product findProduct(int id) throws Throwable {
		Product product = template.queryForObject(FIND, new ProductRowMapper(), id);
		return product;
	}

	@Override
	public List<Product> getAllProducts() throws Throwable {
		List<Product> products = template.query(FINDALL, new ProductRowMapper());

		return products;
	}

	private class ProductRowMapper implements RowMapper<Product> {

		@Override
		public Product mapRow(ResultSet rs, int arg1) throws SQLException {
			Product product = new Product();
			product.setId(rs.getInt(1));
			product.setName(rs.getString(2));
			product.setPrice(rs.getDouble(3));
			product.setCategory(rs.getString(5).charAt(0));

			return product;
		}
	}
}
