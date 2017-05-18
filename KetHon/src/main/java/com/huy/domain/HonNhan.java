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

	@Column(name = "hn_ngaydk", nullable = false)
	private String ngaydangky;
	
	@Column(name = "hn_ngayhen", nullable = false)
	private String ngayhen;
	
	@Column(name = "hn_xa", nullable = false)
	private int idxa;
	
	@Column(name = "hn_trangthai", nullable = false)
	private String trangthai;
	
	//Thong tin nam
	@Column(name = "nam_hoten", nullable = false)
	private String namhoten;
	@Column(name = "nam_ngaysinh", nullable = false)
	private String nam_ngaysinh;
	@Column(name = "nam_dantoc", nullable = false)
	private int nam_dantoc;
	@Column(name = "nam_quoctich", nullable = false)
	private int nam_quoctich;
	@Column(name = "nam_xa", nullable = false)
	private int nam_xa;
	@Column(name = "nam_cmnd", nullable = false)
	private String nam_cmnd;
	
	//Thong tin nu
	@Column(name = "nu_hoten", nullable = false)
	private String nu_hoten;
	@Column(name = "nu_ngaysinh", nullable = false)
	private String nu_ngaysinh;
	@Column(name = "nu_dantoc", nullable = false)
	private int nu_dantoc;
	@Column(name = "nu_quoctich", nullable = false)
	private int nu_quoctich;
	@Column(name = "nu_xa", nullable = false)
	private int nu_xa;
	@Column(name = "nu_cmnd", nullable = false)
	private String nu_cmnd;

	public HonNhan() {
        super();
    }

	public HonNhan(int id, String ngaydangky, String ngayhen, int idxa, String trangthai, String namhoten,
			String nam_ngaysinh, int nam_dantoc, int nam_quoctich, int nam_xa, String nam_cmnd, String nu_hoten,
			String nu_ngaysinh, int nu_dantoc, int nu_quoctich, int nu_xa, String nu_cmnd) {
		super();
		this.id = id;
		this.ngaydangky = ngaydangky;
		this.ngayhen = ngayhen;
		this.idxa = idxa;
		this.trangthai = trangthai;
		this.namhoten = namhoten;
		this.nam_ngaysinh = nam_ngaysinh;
		this.nam_dantoc = nam_dantoc;
		this.nam_quoctich = nam_quoctich;
		this.nam_xa = nam_xa;
		this.nam_cmnd = nam_cmnd;
		this.nu_hoten = nu_hoten;
		this.nu_ngaysinh = nu_ngaysinh;
		this.nu_dantoc = nu_dantoc;
		this.nu_quoctich = nu_quoctich;
		this.nu_xa = nu_xa;
		this.nu_cmnd = nu_cmnd;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getIdxa() {
		return idxa;
	}

	public void setIdxa(int idxa) {
		this.idxa = idxa;
	}

	public String getTrangthai() {
		return trangthai;
	}

	public void setTrangthai(String trangthai) {
		this.trangthai = trangthai;
	}

	public String getNamhoten() {
		return namhoten;
	}

	public void setNamhoten(String namhoten) {
		this.namhoten = namhoten;
	}

	public String getNam_ngaysinh() {
		return nam_ngaysinh;
	}

	public void setNam_ngaysinh(String nam_ngaysinh) {
		this.nam_ngaysinh = nam_ngaysinh;
	}

	public int getNam_dantoc() {
		return nam_dantoc;
	}

	public void setNam_dantoc(int nam_dantoc) {
		this.nam_dantoc = nam_dantoc;
	}

	public int getNam_quoctich() {
		return nam_quoctich;
	}

	public void setNam_quoctich(int nam_quoctich) {
		this.nam_quoctich = nam_quoctich;
	}

	public int getNam_xa() {
		return nam_xa;
	}

	public void setNam_xa(int nam_xa) {
		this.nam_xa = nam_xa;
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

	public int getNu_dantoc() {
		return nu_dantoc;
	}

	public void setNu_dantoc(int nu_dantoc) {
		this.nu_dantoc = nu_dantoc;
	}

	public int getNu_quoctich() {
		return nu_quoctich;
	}

	public void setNu_quoctich(int nu_quoctich) {
		this.nu_quoctich = nu_quoctich;
	}

	public int getNu_xa() {
		return nu_xa;
	}

	public void setNu_xa(int nu_xa) {
		this.nu_xa = nu_xa;
	}

	public String getNu_cmnd() {
		return nu_cmnd;
	}

	public void setNu_cmnd(String nu_cmnd) {
		this.nu_cmnd = nu_cmnd;
	}
}
