package tw.com.momo.payload.request;

import java.util.List;

import tw.com.momo.domain.ProductBean;

public class OrderDto {
	private Integer id;
	private Integer total;
	private Integer shipping;
	private Integer payment;
	private Integer status;
	private String shippingadd;
	private String consignee;
	private String tel ;
	private String email;
	private List<OrderDetailDto> products;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	public Integer getShipping() {
		return shipping;
	}
	public void setShipping(Integer shipping) {
		this.shipping = shipping;
	}
	public Integer getPayment() {
		return payment;
	}
	public void setPayment(Integer payment) {
		this.payment = payment;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getShippingadd() {
		return shippingadd;
	}
	public void setShippingadd(String shippingadd) {
		this.shippingadd = shippingadd;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<OrderDetailDto> getProducts() {
		return products;
	}
	public void setProducts(List<OrderDetailDto> products) {
		this.products = products;
	}
	public String getConsignee() {
		return consignee;
	}
	public void setConsignee(String consignee) {
		this.consignee = consignee;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
}