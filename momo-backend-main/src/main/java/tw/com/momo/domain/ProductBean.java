package tw.com.momo.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "products")
public class ProductBean {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;

	private Integer price;
//	private Integer stock;
//	private Integer num;
	private String description;
	private String category;
	private String cover;
	
	//0109新增
	@Column(name = "state", nullable = false, length = 11)
	private Integer state;
	
	@Temporal(TemporalType.TIMESTAMP)
    private Date createddate;

    @ManyToOne(targetEntity = UserBean.class, fetch = FetchType.EAGER)
    @JoinColumn(nullable = false, name = "sellerid")
    private UserBean userBean;
    
    public ProductBean() {
    	
    }
	
	public ProductBean(UserBean user) {
        this.userBean = user;
        createddate = new Date();
    }

	@Override
	public String toString() {
		return "ProductBean [id=" + id + ", name=" + name + ", price=" + price +", description="
				+ description + ", category=" + category + ", state=" + state + ", createdDate=" + createddate + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Date getCreatedDate() {
		return createddate;
	}

	public void setCreatedDate(Date createddate) {
		this.createddate = createddate;
	}

	public UserBean getUserBean() {
		return userBean;
	}

	public void setUserBean(UserBean userBean) {
		this.userBean = userBean;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public String getCover() {
		return cover;
	}

	public void setCover(String cover) {
		this.cover = cover;
	}
	
}
