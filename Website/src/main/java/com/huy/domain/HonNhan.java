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
@Table(name = "honnhan")
public class HonNhan implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "hn_id", nullable = false)
	private int id;

	@Column(name = "u_id")
	private String name;

	@Column(name = "ddkkh_id", nullable = false)
	private String madondangky;

	@Column(name = "hn_noidangky", nullable = false)
	private String noidangky;

	@Column(name = "hn_trangthai")
	private String trangthai;
	//Thong tin nam
	@Column(name = "nam_hoten", nullable = false)
	private String nam_hoten;
	@Column(name = "nam_ngaysinh", nullable = false)
	private String nam_ngaysinh;
	@Column(name = "nam_dantoc", nullable = false)
	private String nam_dantoc;
	@Column(name = "nam_quoctich", nullable = false)
	private String nam_quoctich;
	@Column(name = "nam_noicutru", nullable = false)
	private String nam_noicutru;
	@Column(name = "nam_cmnd", nullable = false)
	private String nam_cmnd;
	
	//Thong tin nu
	@Column(name = "nu_hoten", nullable = false)
	private String nu_hoten;
	@Column(name = "nu_ngaysinh", nullable = false)
	private String nu_ngaysinh;
	@Column(name = "nu_dantoc", nullable = false)
	private String nu_dantoc;
	@Column(name = "nu_quoctich", nullable = false)
	private String nu_quoctich;
	@Column(name = "nu_noicutru", nullable = false)
	private String nu_noicutru;
	@Column(name = "nu_cmnd", nullable = false)
	private String nu_cmnd;

	public HonNhan() {
        super();
    }

	public HonNhan(int id, String name, String madondangky, String noidangky, String trangthai, String nam_hoten,
			String nam_ngaysinh, String nam_dantoc, String nam_quoctich, String nam_noicutru, String nam_cmnd,
			String nu_hoten, String nu_ngaysinh, String nu_dantoc, String nu_quoctich, String nu_noicutru,
			String nu_cmnd) {
		super();
		this.id = id;
		this.name = name;
		this.madondangky = madondangky;
		this.noidangky = noidangky;
		this.trangthai = trangthai;
		this.nam_hoten = nam_hoten;
		this.nam_ngaysinh = nam_ngaysinh;
		this.nam_dantoc = nam_dantoc;
		this.nam_quoctich = nam_quoctich;
		this.nam_noicutru = nam_noicutru;
		this.nam_cmnd = nam_cmnd;
		this.nu_hoten = nu_hoten;
		this.nu_ngaysinh = nu_ngaysinh;
		this.nu_dantoc = nu_dantoc;
		this.nu_quoctich = nu_quoctich;
		this.nu_noicutru = nu_noicutru;
		this.nu_cmnd = nu_cmnd;
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

	public String getMadondangky() {
		return madondangky;
	}

	public void setMadondangky(String madondangky) {
		this.madondangky = madondangky;
	}

	public String getNoidangky() {
		return noidangky;
	}

	public void setNoidangky(String noidangky) {
		this.noidangky = noidangky;
	}

	public String getTrangthai() {
		return trangthai;
	}

	public void setTrangthai(String trangthai) {
		this.trangthai = trangthai;
	}

	public String getNam_hoten() {
		return nam_hoten;
	}

	public void setNam_hoten(String nam_hoten) {
		this.nam_hoten = nam_hoten;
	}

	public String getNam_ngaysinh() {
		return nam_ngaysinh;
	}

	public void setNam_ngaysinh(String nam_ngaysinh) {
		this.nam_ngaysinh = nam_ngaysinh;
	}

	public String getNam_dantoc() {
		return nam_dantoc;
	}

	public void setNam_dantoc(String nam_dantoc) {
		this.nam_dantoc = nam_dantoc;
	}

	public String getNam_quoctich() {
		return nam_quoctich;
	}

	public void setNam_quoctich(String nam_quoctich) {
		this.nam_quoctich = nam_quoctich;
	}

	public String getNam_noicutru() {
		return nam_noicutru;
	}

	public void setNam_noicutru(String nam_noicutru) {
		this.nam_noicutru = nam_noicutru;
	}

	public String getNam_cmnd() {
		return nam_cmnd;
	}

	public void setNam_cmnd(String nam_cmnd) {
		this.nam_cmnd = nam_cmnd;
	}

	public String getNu_hoten() {
		return nu_hoten;
	}

	public void setNu_hoten(String nu_hoten) {
		this.nu_hoten = nu_hoten;
	}

	public String getNu_ngaysinh() {
		return nu_ngaysinh;
	}

	public void setNu_ngaysinh(String nu_ngaysinh) {
		this.nu_ngaysinh = nu_ngaysinh;
	}

	public String getNu_dantoc() {
		return nu_dantoc;
	}

	public void setNu_dantoc(String nu_dantoc) {
		this.nu_dantoc = nu_dantoc;
	}

	public String getNu_quoctich() {
		return nu_quoctich;
	}

	public void setNu_quoctich(String nu_quoctich) {
		this.nu_quoctich = nu_quoctich;
	}

	public String getNu_noicutru() {
		return nu_noicutru;
	}

	public void setNu_noicutru(String nu_noicutru) {
		this.nu_noicutru = nu_noicutru;
	}

	public String getNu_cmnd() {
		return nu_cmnd;
	}

	public void setNu_cmnd(String nu_cmnd) {
		this.nu_cmnd = nu_cmnd;
	}
	
}
