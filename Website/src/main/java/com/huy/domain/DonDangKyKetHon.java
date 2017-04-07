package com.huy.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "dondangkykethon")
public class DonDangKyKetHon implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ddkkh_id", nullable = false)
	private int id;

	@NotEmpty
	@Column(name = "ddkkh_ten", nullable = false)
	private String name;

	@Column(name = "ddkkh_cmnd", nullable = false)
	private String cmnd;

	@Column(name = "ddkkh_ngaydk", nullable = false)
	private String ngaydangky;

	@Column(name = "ddkkh_ngayhen", nullable = false)
	private String ngayhen;

	@Column(name = "ddkkh_ngaynhan", nullable = true)
	private String ngaynhan;

	@Column(name = "ddkkh_ghichu", nullable = true)
	private String ghichu;

	public DonDangKyKetHon() {
        super();
    }

	public DonDangKyKetHon(int id, String name, String cmnd, String ngaydangky, String ngayhen, String ngaynhan,
			String ghichu) {
		super();
		this.id = id;
		this.name = name;
		this.cmnd = cmnd;
		this.ngaydangky = ngaydangky;
		this.ngayhen = ngayhen;
		this.ngaynhan = ngaynhan;
		this.ghichu = ghichu;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCmnd() {
		return cmnd;
	}

	public void setCmnd(String cmnd) {
		this.cmnd = cmnd;
	}

	public String getNgaydangky() {
		return ngaydangky;
	}

	public void setNgaydangky(String ngaydangky) {
		this.ngaydangky = ngaydangky;
	}

	public String getNgayhen() {
		return ngayhen;
	}

	public void setNgayhen(String ngayhen) {
		this.ngayhen = ngayhen;
	}

	public String getNgaynhan() {
		return ngaynhan;
	}

	public void setNgaynhan(String ngaynhan) {
		this.ngaynhan = ngaynhan;
	}

	public String getGhichu() {
		return ghichu;
	}

	public void setGhichu(String ghichu) {
		this.ghichu = ghichu;
	}
	

}
