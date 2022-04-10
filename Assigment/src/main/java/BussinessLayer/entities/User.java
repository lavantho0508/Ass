package BussinessLayer.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the users database table.
 * 
 */
@Entity
@Table(name="users")
@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "username")
	private String username;
	
	private String diachi;

	private String email;

	private String password;

	private String sdt;

	private Integer trangthai;
	
	@Column(name = "avarta")
	private String avarta;

	//bi-directional many-to-one association to Category
	@OneToMany(mappedBy="user")
	private List<Category> categories;

	public User() {
	}

	public Integer getId() {
		return this.id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getAvarta() {
		return avarta;
	}

	public void setAvarta(String avarta) {
		this.avarta = avarta;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDiachi() {
		return this.diachi;
	}

	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSdt() {
		return this.sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	public Integer getTrangthai() {
		return this.trangthai;
	}

	public void setTrangthai(Integer trangthai) {
		this.trangthai = trangthai;
	}

	public List<Category> getCategories() {
		return this.categories;
	}

	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}

	public Category addCategory(Category category) {
		getCategories().add(category);
		category.setUser(this);

		return category;
	}

	public Category removeCategory(Category category) {
		getCategories().remove(category);
		category.setUser(null);

		return category;
	}

}