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
@Table(name = "kethon")
public class KetHon implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "kh_id", nullable = false)
    private int id;
    
    @NotEmpty
    @Column(name = "kh_name", nullable = false)
    private String name;
    //Thông tin nơi đăng kí
    @Column(name = "kh_huyen", nullable = false)
    private String huyen;

    @Column(name = "kh_xa")
    private String xa;

    //Thông tin duyệt  
    @Column(name = "kh_trangthai")
    private String trangthai;
    
    //Thông tin người nam
    @Column(name = "kh_nam_hoten")
    private String nam_hoten;
    
    @Column(name = "kh_nam_ngaysinh")
    private String nam_ngaysinh;
    
    @Column(name = "kh_nam_cmnd")
    private String nam_cmnd;
    
    @Column(name = "kh_nam_noicap")
    private String nam_noicap;
    
    @Column(name = "kh_nam_ngaycap")
    private String nam_ngaycap;
    
    @Column(name = "kh_nam_quoctich")
    private String nam_quoctich;
    
    @Column(name = "kh_nam_dantoc")
    private String nam_dantoc;
    
    @Column(name = "kh_nam_slkethon")
    private String nam_slkethon;
    
   //Thông tin nữ
    @Column(name = "kh_nnu_hoten")
    private String nu_hoten;
    
    @Column(name = "kh_nu_ngaysinh")
    private String nu_ngaysinh;
    
    @Column(name = "kh_nu_cmnd")
    private String nu_cmnd;
    
    @Column(name = "kh_nu_noicap")
    private String nu_noicap;
    
    @Column(name = "kh_nu_ngaycap")
    private String nu_ngaycap;
    
    @Column(name = "kh_nu_quoctich")
    private String nu_quoctich;
    
    @Column(name = "kh_nu_dantoc")
    private String nu_dantoc;
    
    @Column(name = "kh_nu_slkethon")
    private String nu_slkethon;
   
    public KetHon() {
        super();
    }

	public KetHon(int id, String huyen, String xa, String trangthai, String nam_hoten, String nam_ngaysinh,
			String nam_cmnd, String nam_noicap, String nam_ngaycap, String nam_quoctich, String nam_dantoc,
			String nam_slkethon, String nu_hoten, String nu_ngaysinh, String nu_cmnd, String nu_noicap,
			String nu_ngaycap, String nu_quoctich, String nu_dantoc, String nu_slkethon) {
		super();
		this.id = id;
		this.huyen = huyen;
		this.xa = xa;
		this.trangthai = trangthai;
		this.nam_hoten = nam_hoten;
		this.nam_ngaysinh = nam_ngaysinh;
		this.nam_cmnd = nam_cmnd;
		this.nam_noicap = nam_noicap;
		this.nam_ngaycap = nam_ngaycap;
		this.nam_quoctich = nam_quoctich;
		this.nam_dantoc = nam_dantoc;
		this.nam_slkethon = nam_slkethon;
		this.nu_hoten = nu_hoten;
		this.nu_ngaysinh = nu_ngaysinh;
		this.nu_cmnd = nu_cmnd;
		this.nu_noicap = nu_noicap;
		this.nu_ngaycap = nu_ngaycap;
		this.nu_quoctich = nu_quoctich;
		this.nu_dantoc = nu_dantoc;
		this.nu_slkethon = nu_slkethon;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getHuyen() {
		return huyen;
	}

	public void setHuyen(String huyen) {
		this.huyen = huyen;
	}

	public String getXa() {
		return xa;
	}

	public void setXa(String xa) {
		this.xa = xa;
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

	public String getNam_cmnd() {
		return nam_cmnd;
	}

	public void setNam_cmnd(String nam_cmnd) {
		this.nam_cmnd = nam_cmnd;
	}

	public String getNam_noicap() {
		return nam_noicap;
	}

	public void setNam_noicap(String nam_noicap) {
		this.nam_noicap = nam_noicap;
	}

	public String getNam_ngaycap() {
		return nam_ngaycap;
	}

	public void setNam_ngaycap(String nam_ngaycap) {
		this.nam_ngaycap = nam_ngaycap;
	}

	public String getNam_quoctich() {
		return nam_quoctich;
	}

	public void setNam_quoctich(String nam_quoctich) {
		this.nam_quoctich = nam_quoctich;
	}

	public String getNam_dantoc() {
		return nam_dantoc;
	}

	public void setNam_dantoc(String nam_dantoc) {
		this.nam_dantoc = nam_dantoc;
	}

	public String getNam_slkethon() {
		return nam_slkethon;
	}

	public void setNam_slkethon(String nam_slkethon) {
		this.nam_slkethon = nam_slkethon;
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

	public String getNu_cmnd() {
		return nu_cmnd;
	}

	public void setNu_cmnd(String nu_cmnd) {
		this.nu_cmnd = nu_cmnd;
	}

	public String getNu_noicap() {
		return nu_noicap;
	}

	public void setNu_noicap(String nu_noicap) {
		this.nu_noicap = nu_noicap;
	}

	public String getNu_ngaycap() {
		return nu_ngaycap;
	}

	public void setNu_ngaycap(String nu_ngaycap) {
		this.nu_ngaycap = nu_ngaycap;
	}

	public String getNu_quoctich() {
		return nu_quoctich;
	}

	public void setNu_quoctich(String nu_quoctich) {
		this.nu_quoctich = nu_quoctich;
	}

	public String getNu_dantoc() {
		return nu_dantoc;
	}

	public void setNu_dantoc(String nu_dantoc) {
		this.nu_dantoc = nu_dantoc;
	}

	public String getNu_slkethon() {
		return nu_slkethon;
	}

	public void setNu_slkethon(String nu_slkethon) {
		this.nu_slkethon = nu_slkethon;
	}
    
}