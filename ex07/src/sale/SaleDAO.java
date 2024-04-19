package sale;

import java.sql.*;
import java.util.*;
import product.Database;
import product.ProductVO;

public class SaleDAO {
	Connection con = Database.CON;
	//판매현황
	public ArrayList<SaleVO> list(){
		ArrayList<SaleVO> array = new ArrayList<SaleVO>();
		try {
			String sql = "select sale_date, code, sum(qnt), price, name ";
			sql+= "from view_sale ";
			sql+= "group by sale_date, code, price, name ";
			sql+= "order by sale_date, code";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				SaleVO vo = new SaleVO();
				
				vo.setSale_date(rs.getDate("sale_date"));
				vo.setCode(rs.getString("code"));
				vo.setQnt(rs.getInt("sum(qnt)"));
				vo.setPrice(rs.getInt("price"));
				vo.setName(rs.getString("name"));
				array.add(vo);
			}
		}catch(Exception e) {
			System.out.println("판매현황:" + e.toString());
		}
		return array;
	}
	
	
	
	
	
	
	
}
