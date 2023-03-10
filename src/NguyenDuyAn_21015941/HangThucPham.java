package NguyenDuyAn_21015941;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class HangThucPham {
	private String maHang;
	private String tenHang;
	private Calendar ngaySX;
	private Calendar ngayHH;
	private double donGia;
	public DateFormat df;
//dong goi va rang buoc
	// ma Hang
	public String getMaHang() {
		return maHang;
	}
	public void setMaHang(String ma) throws Exception {
		if(ma!=""){
			this.maHang = ma;
		}else throw new Exception("Loi");
	}
	// ten Hang
	public String getTenHang() {
		return tenHang;
	}
	public void setTenHang(String ten) throws Exception {
		if(ten!=""){
			this.tenHang = ten;
		}else throw new Exception("Loi");
	}
	// ngay SX
	public Calendar getNgaySX() {
		return ngaySX;
	}
	public void setNgaySX(Calendar ngaySX) throws Exception {
		if(ngaySX!=null){
			this.ngaySX = ngaySX;
		}else throw new Exception("Loi");
	}
	// ngay HH
	public Calendar getNgayHH() {
		return ngayHH;
	}
	public void setNgayHH(Calendar ngayHH) throws Exception {
		if(ngayHH!=null){
			this.ngayHH = ngayHH;
		}else throw new Exception("Loi");
	}
	// don Gia
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) throws Exception {
		if(donGia!=0){
			this.donGia = donGia;
		}else throw new Exception("Loi");
	}
//contructor
	public HangThucPham(String ma, String ten, Calendar ngaySX, Calendar ngayHH, double donGia) throws Exception {
		this.maHang = ma;
		this.tenHang = ten;
		this.ngaySX = ngaySX;
		this.ngayHH = ngayHH;
		this.donGia = donGia;
		if(ma!=""){
			this.maHang = ma;
		}else throw new Exception("Loi");
		if(ten!=""){
			this.tenHang = ten;
		}else throw new Exception("Loi");
		if(ngaySX!=null){
			this.ngaySX = ngaySX;
		}else throw new Exception("Loi");
		if(ngayHH!=null){
			this.ngayHH = ngayHH;
		}else throw new Exception("Loi");
		if(donGia!=0){
			this.donGia = donGia;
		}else throw new Exception("Loi");
	}
	
	public HangThucPham() {
		
	}
	public boolean checkHangSuDung() {
		Calendar ngayHH= Calendar.getInstance();
		if (ngayHH.getTime().getTime()>getNgayHH().getTime().getTime()) {
			return false;
		} else {
			return true;
		}
	}
//toString
	@Override
	public String toString() {
	Locale lc= new Locale("vi", "VN");
	df = DateFormat.getDateInstance(0, lc);
	return super.toString();
	}
	public void tieuDe() {
		System.out.println("Test ket qua"); for (int i = 0; i <72; i++)
			System.out.printf("-");
			System.out.println();
			System.out.printf("%-10s | %-10s | %-14s|%-10s | %-10s | %-12s|\n",
			"Ma Hang", "Ten Hang", "Ngay sx", "Ngay HH", "Don Gia");
			for (int i = 0; i <72; i++)
			System.out.printf("-");
			System.out.println();
	}
	
}
