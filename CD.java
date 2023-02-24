package Tuan2;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Locale;

public class CD {
//khoiTaoBien
	private String maCD;
	private String tuaCD;
	private Calendar ngayPH;
	private Double donGia;
	private int soBH;
//dongGoi
	public String getMaCD() {
		return maCD;
	}
	public void setMaCD(String ma) throws Exception { 
		if (ma!="") {
			this.maCD = ma;
		} else throw new Exception("Loi ma");
	}
	public String getTuaCD() {
		return tuaCD;
	}
	public void setTuaCD(String tua) throws Exception {
		if (tua!="") {
			this.tuaCD = tua;
		}else throw new Exception("Loi");
	}
	public Calendar getNgayPH() {
		return ngayPH;
	}
	public void setNgayPH(Calendar ngayPH) throws Exception {
		if (ngayPH!=null) {
			this.ngayPH = ngayPH; 
		} else throw new Exception("Lol ngay");
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	public int getSoBH() {
		return soBH;
	} public void setSoBH(int soBH) { 
		this.soBH = soBH;
	}
//taoHamKhoiTaoDoiTuong
	public CD() {
		this.maCD = "0000000";
		this.tuaCD = "xxxxxxx";
		this.ngayPH = null;
		this.donGia = (double) 10000;
		this.soBH = 0;
	}
	public CD(String ma, String tua, Calendar ngayPH, double donGia, int so) throws Exception {
		if (ma!="") {
			this.maCD = ma;
		} else throw new Exception("Loi ma");
		if (tua!="") {
			this.tuaCD = tua;
		}else throw new Exception("Loi");
		if (ngayPH!=null) {
			this.ngayPH = ngayPH; 
		} else throw new Exception("Loi ngay");
		this.donGia = donGia;
		if (so>0) {
			this.soBH = so;
		} else throw new Exception("Loi so");
		}
	//getThanhTien
		public double getThanhTien() { 
			return getDonGia()*getSoBH();
		}
	//tieuDe
		public void tieuDe() {
			System.out.println("Test ket qua"); for (int i = 0; i <72; i++)
				System.out.printf("-");
				System.out.println();
				System.out.printf("%-10s | %-10s | %-14s|%-10s | %-10s | %-12s|\n",
				"Ma CD", "Tua CD", "Ngay Phat Hanh", "Don Gia", "So Bai Hat", "Tong tien");
				for (int i = 0; i <72; i++)
				System.out.printf("-");
				System.out.println();
		}
		Locale lc= new Locale("vi", "VN");
		DateFormat df = DateFormat.getDateInstance(1, lc);
		NumberFormat sf = NumberFormat.getCurrencyInstance(lc);
		@Override
		public String toString() {
			String s="";
			s+=String.format("%-1051 % -10s | % 145 | %10s | %10s | %125", getMaCD(), getTuaCD(),
			df. format(getNgayPH().getTime()),sf.format(getDonGia()),
			getSoBH(), sf.format(getThanhTien()));
			return s;
		}
}